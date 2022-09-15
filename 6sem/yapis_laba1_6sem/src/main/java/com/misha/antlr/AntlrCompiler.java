package com.misha.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.misha.gen.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class AntlrCompiler {
    private static final Logger logger = LogManager.getLogger();
    private static final String PATH = "src/main/resources/";
    private static final String TEMP_PATH = PATH + "tempf/";
    private static final String PM_FILE = ".pm";
    private static final String CPP_FILE = ".cpp";
    private static final String EXE_FILE = ".exe";
    private static final String COMMAND = "cmd /c g++ %s -o %s";

    public static void main(String[] args) {
        try {
            String[] examples = {"example_1", "example_2", "example_3"};
            logger.log(Level.INFO, "example files -> " + Arrays.toString(examples));
            File tempDir = new File(TEMP_PATH);
            boolean isDirectoryCreated = tempDir.mkdir();
            if (isDirectoryCreated) {
                logger.log(Level.INFO, "\"tempf\" directory has been created");
            }
            for (String example : examples) {
                String exampleFile = PATH + example + PM_FILE;
                String outputFile = TEMP_PATH + example + CPP_FILE;
                String exeFile = TEMP_PATH + example + EXE_FILE;
                String input = Files.readString(Paths.get(exampleFile));
                logger.log(Level.INFO, "input from  file " + example + ":\n" + input);
                String output = compile(input);
                logger.log(Level.INFO, "output:\n" + output);
                Files.write(Paths.get(outputFile), output.getBytes());
                String command = String.format(COMMAND, outputFile, exeFile);
                Process compile = Runtime.getRuntime().exec(command);
                compile.waitFor();
                logger.log(Level.INFO, example + " file was compiled\n\n\n\n");
            }
            logger.log(Level.INFO, "done");
        } catch (IOException | RuntimeException | InterruptedException exception) {
            exception.printStackTrace();
            logger.log(Level.ERROR, exception.getMessage());
        }
    }

    private static String compile(String input) {
        CharStream charStream = CharStreams.fromString(input);
        CustomErrorListener errorListener = new CustomErrorListener();
        PollaMLexer lexer = new PollaMLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PollaMParser parser = new PollaMParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();
        CustomVisitor visitor = new CustomVisitor();
        return visitor.visit(tree);
    }
}
