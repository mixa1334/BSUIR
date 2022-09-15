// Generated from C:/Users/миша/IdeaProjectsM/YapisParser/src/main/resources\PollaM.g4 by ANTLR 4.9.2
package com.misha.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PollaMParser}.
 */
public interface PollaMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PollaMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PollaMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PollaMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PollaMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PollaMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#typeIdPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdPart(PollaMParser.TypeIdPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#typeIdPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdPart(PollaMParser.TypeIdPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#typeVarPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeVarPart(PollaMParser.TypeVarPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#typeVarPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeVarPart(PollaMParser.TypeVarPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#mainDef}.
	 * @param ctx the parse tree
	 */
	void enterMainDef(PollaMParser.MainDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#mainDef}.
	 * @param ctx the parse tree
	 */
	void exitMainDef(PollaMParser.MainDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionDefReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefReturn(PollaMParser.FunctionDefReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionDefReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefReturn(PollaMParser.FunctionDefReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionDefNonReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefNonReturn(PollaMParser.FunctionDefNonReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionDefNonReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefNonReturn(PollaMParser.FunctionDefNonReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionBodyWithoutReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodyWithoutReturn(PollaMParser.FunctionBodyWithoutReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionBodyWithoutReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodyWithoutReturn(PollaMParser.FunctionBodyWithoutReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#emptRet}.
	 * @param ctx the parse tree
	 */
	void enterEmptRet(PollaMParser.EmptRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#emptRet}.
	 * @param ctx the parse tree
	 */
	void exitEmptRet(PollaMParser.EmptRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionBodyWithReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodyWithReturn(PollaMParser.FunctionBodyWithReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionBodyWithReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodyWithReturn(PollaMParser.FunctionBodyWithReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionDefParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefParameters(PollaMParser.FunctionDefParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionDefParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefParameters(PollaMParser.FunctionDefParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void enterContentLine(PollaMParser.ContentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#contentLine}.
	 * @param ctx the parse tree
	 */
	void exitContentLine(PollaMParser.ContentLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(PollaMParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(PollaMParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PollaMParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PollaMParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#variableDeclarationWithAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithAssignment(PollaMParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#variableDeclarationWithAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithAssignment(PollaMParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterValueAssignment(PollaMParser.ValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitValueAssignment(PollaMParser.ValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#typeConvertion}.
	 * @param ctx the parse tree
	 */
	void enterTypeConvertion(PollaMParser.TypeConvertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#typeConvertion}.
	 * @param ctx the parse tree
	 */
	void exitTypeConvertion(PollaMParser.TypeConvertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PollaMParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PollaMParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#operationsWithSets}.
	 * @param ctx the parse tree
	 */
	void enterOperationsWithSets(PollaMParser.OperationsWithSetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#operationsWithSets}.
	 * @param ctx the parse tree
	 */
	void exitOperationsWithSets(PollaMParser.OperationsWithSetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#changeSetOperation}.
	 * @param ctx the parse tree
	 */
	void enterChangeSetOperation(PollaMParser.ChangeSetOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#changeSetOperation}.
	 * @param ctx the parse tree
	 */
	void exitChangeSetOperation(PollaMParser.ChangeSetOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#unionOperation}.
	 * @param ctx the parse tree
	 */
	void enterUnionOperation(PollaMParser.UnionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#unionOperation}.
	 * @param ctx the parse tree
	 */
	void exitUnionOperation(PollaMParser.UnionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#differenceOperation}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceOperation(PollaMParser.DifferenceOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#differenceOperation}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceOperation(PollaMParser.DifferenceOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#intersectionOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOperation(PollaMParser.IntersectionOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#intersectionOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOperation(PollaMParser.IntersectionOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#symmetricDifferenceOperation}.
	 * @param ctx the parse tree
	 */
	void enterSymmetricDifferenceOperation(PollaMParser.SymmetricDifferenceOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#symmetricDifferenceOperation}.
	 * @param ctx the parse tree
	 */
	void exitSymmetricDifferenceOperation(PollaMParser.SymmetricDifferenceOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#booleanOperations}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperations(PollaMParser.BooleanOperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#booleanOperations}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperations(PollaMParser.BooleanOperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(PollaMParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(PollaMParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(PollaMParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(PollaMParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(PollaMParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(PollaMParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#operatorBody}.
	 * @param ctx the parse tree
	 */
	void enterOperatorBody(PollaMParser.OperatorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#operatorBody}.
	 * @param ctx the parse tree
	 */
	void exitOperatorBody(PollaMParser.OperatorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#printCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(PollaMParser.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#printCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(PollaMParser.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#sizeCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeCall(PollaMParser.SizeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#sizeCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeCall(PollaMParser.SizeCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PollaMParser#clearCall}.
	 * @param ctx the parse tree
	 */
	void enterClearCall(PollaMParser.ClearCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PollaMParser#clearCall}.
	 * @param ctx the parse tree
	 */
	void exitClearCall(PollaMParser.ClearCallContext ctx);
}