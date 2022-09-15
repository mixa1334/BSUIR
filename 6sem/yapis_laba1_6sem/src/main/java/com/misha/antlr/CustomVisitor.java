package com.misha.antlr;

import com.misha.gen.PollaMBaseVisitor;
import com.misha.gen.PollaMParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import static com.misha.antlr.CToken.*;
import static com.misha.antlr.PMToken.*;

public class CustomVisitor extends PollaMBaseVisitor<String> {
    private static final String EMPTY_STRING = "";
    private static final String WS_STRING = " ";
    private static final String FORMAT_SYMBOL = "%s";
    private static final String BRACKETS_REGEX = "[\\(\\)]";
    private static final String SET = "set";
    private static final String ELEMENT = "element";
    private final VariableContext context = new VariableContext();

    @Override
    public String visitProgram(PollaMParser.ProgramContext ctx) {
        context.clearContext();
        return C_INCLUDE + customVisit(ctx).replaceAll(FORMAT_SYMBOL, EMPTY_STRING);
    }

    @Override
    public String visitType(PollaMParser.TypeContext ctx) {
        return customVisit(ctx) + WS_STRING;
    }

    @Override
    public String visitTypeIdPart(PollaMParser.TypeIdPartContext ctx) {
        context.addAccordingToType(ctx.ID().getText(), ctx.type().getText());
        return customVisit(ctx);
    }

    @Override
    public String visitTypeVarPart(PollaMParser.TypeVarPartContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitMainDef(PollaMParser.MainDefContext ctx) {
        context.clearContext();
        return customVisit(ctx).replaceAll(PM_VOID, C_INT);
    }

    @Override
    public String visitFunctionDefReturn(PollaMParser.FunctionDefReturnContext ctx) {
        context.clearContext();
        context.setFunctionReturnType(ctx.typeIdPart().type().getText());
        return customVisit(ctx);
    }

    @Override
    public String visitFunctionDefNonReturn(PollaMParser.FunctionDefNonReturnContext ctx) {
        context.clearContext();
        return customVisit(ctx);
    }

    @Override
    public String visitFunctionBodyWithoutReturn(PollaMParser.FunctionBodyWithoutReturnContext ctx) {
        return C_OPEN_CURLY_BRACKET + customVisit(ctx) + C_CLOSE_CURLY_BRACKET;
    }

    @Override
    public String visitEmptRet(PollaMParser.EmptRetContext ctx) {
        return "";
    }

    @Override
    public String visitFunctionBodyWithReturn(PollaMParser.FunctionBodyWithReturnContext ctx) {
        String result = C_OPEN_CURLY_BRACKET + customVisit(ctx) + C_CLOSE_CURLY_BRACKET;
        String ret = ctx.ID().getText();
        if (!context.compareFunctionReturnTypeToIdType(ret)) {
            throw new RuntimeException("!!! -> Invalid return type" + "(" + ret + ")");
        }
        return result;
    }

    @Override
    public String visitFunctionDefParameters(PollaMParser.FunctionDefParametersContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitContentLine(PollaMParser.ContentLineContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitVariableDeclaration(PollaMParser.VariableDeclarationContext ctx) {
        String var = ctx.ID().getText();
        if (!context.addAccordingToType(var, ctx.typeVarPart().getText())) {
            throw new RuntimeException("!!! -> variable already exists" + "(" + var + ")");
        }
        return customVisit(ctx);
    }

    @Override
    public String visitVariableDeclarationWithAssignment(PollaMParser.VariableDeclarationWithAssignmentContext ctx) {
        String var = ctx.valueAssignment().ID(0).getText();
        if (!context.addAccordingToType(var, ctx.typeVarPart().getText())) {
            throw new RuntimeException("!!! -> variable already exists" + "(" + var + ")");
        }
        return customVisit(ctx);
    }

    @Override
    public String visitValueAssignment(PollaMParser.ValueAssignmentContext ctx) {
        if (ctx.children == null) {
            return EMPTY_STRING;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String id = ctx.children.get(0).getText();
        if (!context.hasIdtf(id)) {
            throw new RuntimeException("!!! -> variable does not exist" + "(" + id + ")");
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            ParseTree child = ctx.children.get(i);
            String str;
            if (child instanceof TerminalNodeImpl) {
                str = parseNodeText(child);
            } else {
                str = visit(child);
                if (child instanceof PollaMParser.OperationsWithSetsContext) {
                    String inserter = C_COMMA + WS_STRING + String.format(C_SET_OPERATION_INSERTER, id, id);
                    str = String.format(str, inserter);
                    int start = stringBuilder.indexOf(C_ASSIGN);
                    stringBuilder.replace(start, start + 1, C_SEMICOLON);
                }
            }
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }

    @Override
    public String visitTypeConvertion(PollaMParser.TypeConvertionContext ctx) {
        String var = ctx.ID().getText();
        if (!context.hasIdtf(var)) {
            throw new RuntimeException("!!! -> variable does not exist" + "(" + var + ")");
        }
        return customVisit(ctx);
    }

    @Override
    public String visitFunctionCall(PollaMParser.FunctionCallContext ctx) {

        return customVisit(ctx);
    }

    @Override
    public String visitOperationsWithSets(PollaMParser.OperationsWithSetsContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitChangeSetOperation(PollaMParser.ChangeSetOperationContext ctx) {
        String set = ctx.ID(0).getText();
        if (!context.hasSet(set)) {
            throw new RuntimeException("!!! -> set does not exist" + "(" + set + ")");
        }
        return customVisit(ctx);
    }

    @Override
    public String visitUnionOperation(PollaMParser.UnionOperationContext ctx) {
        String firstSet = ctx.getChild(0).getText();
        String secondSet = ctx.getChild(2).getText();
        if (!context.hasSet(firstSet) || !context.hasSet(secondSet)) {
            throw new RuntimeException("!!! union operation available only for sets");
        }
        return String.format(C_SET_UNION, firstSet, firstSet, secondSet, secondSet, FORMAT_SYMBOL);
    }

    @Override
    public String visitDifferenceOperation(PollaMParser.DifferenceOperationContext ctx) {
        String firstSet = ctx.getChild(0).getText();
        String secondSet = ctx.getChild(2).getText();
        if (!context.hasSet(firstSet) || !context.hasSet(secondSet)) {
            throw new RuntimeException("!!! difference operation available only for sets");
        }
        return String.format(C_SET_DIFFERENCE, firstSet, firstSet, secondSet, secondSet, FORMAT_SYMBOL);
    }

    @Override
    public String visitIntersectionOperation(PollaMParser.IntersectionOperationContext ctx) {
        String firstSet = ctx.getChild(0).getText();
        String secondSet = ctx.getChild(2).getText();
        if (!context.hasSet(firstSet) || !context.hasSet(secondSet)) {
            throw new RuntimeException("!!! intersection operation available only for sets");
        }
        return String.format(C_SET_INTERSECTION, firstSet, firstSet, secondSet, secondSet, FORMAT_SYMBOL);
    }

    @Override
    public String visitSymmetricDifferenceOperation(PollaMParser.SymmetricDifferenceOperationContext ctx) {
        String firstSet = ctx.getChild(0).getText();
        String secondSet = ctx.getChild(2).getText();
        if (!context.hasSet(firstSet) || !context.hasSet(secondSet)) {
            throw new RuntimeException("!!! symmetric_difference operation available only for sets");
        }
        return String.format(C_SET_SYMMETRIC_DIFFERENCE, firstSet, firstSet, secondSet, secondSet, FORMAT_SYMBOL);
    }

    @Override
    public String visitBooleanOperations(PollaMParser.BooleanOperationsContext ctx) {
        if (ctx.children.size() > 1) {
            String firstOper = ctx.children.get(0).getText();
            String secondOper = ctx.children.get(2).getText();
            if (!context.hasIdtf(firstOper) && !context.hasIdtf(secondOper)) {
                throw new RuntimeException("!!! -> variable does not exist" + "(" + firstOper + "," + secondOper + ")");
            }
        } else {
            String var = ctx.ID(0).getText();
            if (!context.hasIdtf(var)) {
                throw new RuntimeException("!!! -> variable does not exist" + "(" + var + ")");
            }
        }
        return customVisit(ctx);
    }

    @Override
    public String visitOperators(PollaMParser.OperatorsContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitOperatorBody(PollaMParser.OperatorBodyContext ctx) {
        return C_OPEN_CURLY_BRACKET + customVisit(ctx) + C_CLOSE_CURLY_BRACKET;
    }

    @Override
    public String visitIfBlock(PollaMParser.IfBlockContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitForBlock(PollaMParser.ForBlockContext ctx) {
        if (ctx.children == null) {
            return EMPTY_STRING;
        }
        String iter = ctx.ID(0).getText();
        String set = ctx.ID(1).getText();
        if (!context.hasSet(set)) {
            throw new RuntimeException("!!! -> for loop onpy for sets" + "(" + set + ")");
        }
        if (!context.addElement(iter)) {
            throw new RuntimeException("!!! -> variable for iteration already exists" + "(" + iter + ")");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ctx.children.size(); i++) {
            ParseTree child = ctx.children.get(i);
            String string;
            if (child instanceof TerminalNodeImpl) {
                string = parseNodeText(child);
                if (i == 2) {
                    string = C_FOR_AUTO + WS_STRING + string;
                }
            } else {
                string = visit(child);
            }
            stringBuilder.append(string);
        }
        context.removeElem(iter);
        return stringBuilder.toString();
    }

    @Override
    public String visitWhileBlock(PollaMParser.WhileBlockContext ctx) {
        return customVisit(ctx);
    }

    @Override
    public String visitPrintCall(PollaMParser.PrintCallContext ctx) {
        if (ctx.ID() != null) {
            String var = ctx.ID().getText();
            if (!context.hasIdtf(var)) {
                throw new RuntimeException("!!! -> invalid variable to call print" + "(" + var + ")");
            }
        }
        return customVisit(ctx).replaceAll(BRACKETS_REGEX, EMPTY_STRING);
    }

    @Override
    public String visitSizeCall(PollaMParser.SizeCallContext ctx) {
        String id = ctx.ID().getText();
        if (!context.hasSet(id)) {
            throw new RuntimeException("!!! -> invalid set to call size" + "(" + id + ")");
        }
        return id + C_SET_SIZE;
    }

    @Override
    public String visitClearCall(PollaMParser.ClearCallContext ctx) {
        String id = ctx.ID().getText();
        if (!context.hasSet(id)) {
            throw new RuntimeException("!!! -> invalid set to call clear" + "(" + id + ")");
        }
        return id + C_SET_CLEAR;
    }

    private String customVisit(ParserRuleContext ctx) {
        if (ctx.children == null) {
            return EMPTY_STRING;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (ParseTree child : ctx.children) {
            String str;
            if (child instanceof TerminalNodeImpl) {
                str = parseNodeText(child);
            } else {
                str = visit(child);
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    private String parseNodeText(ParseTree child) {
        String sting = child.getText();
        return switch (sting) {
            case PM_PRINT -> C_COUT;
            case PM_DEF -> EMPTY_STRING;
            case PM_SET -> C_SET_DECLARATION;
            case PM_ELEMENT -> C_INT;
            case PM_VAR -> C_AUTO + WS_STRING;
            case PM_SET_ADD -> C_SET_INSERT;
            case PM_SET_REMOVE -> C_SET_ERASE;
            case PM_VOID -> PM_VOID + WS_STRING;
            case PM_RETURN -> PM_RETURN + WS_STRING;
            case PM_COLON -> C_SEMICOLON;
            case PM_FROM -> C_COLON;
            default -> sting;
        };
    }
}