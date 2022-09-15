// Generated from C:/Users/миша/IdeaProjectsM/YapisParser/src/main/resources\PollaM.g4 by ANTLR 4.9.2
package com.misha.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PollaMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PollaMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PollaMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PollaMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PollaMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#typeIdPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdPart(PollaMParser.TypeIdPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#typeVarPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVarPart(PollaMParser.TypeVarPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#mainDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDef(PollaMParser.MainDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionDefReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefReturn(PollaMParser.FunctionDefReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionDefNonReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefNonReturn(PollaMParser.FunctionDefNonReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionBodyWithoutReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBodyWithoutReturn(PollaMParser.FunctionBodyWithoutReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#emptRet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptRet(PollaMParser.EmptRetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionBodyWithReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBodyWithReturn(PollaMParser.FunctionBodyWithReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionDefParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefParameters(PollaMParser.FunctionDefParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#contentLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentLine(PollaMParser.ContentLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperators(PollaMParser.OperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PollaMParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#variableDeclarationWithAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithAssignment(PollaMParser.VariableDeclarationWithAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#valueAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAssignment(PollaMParser.ValueAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#typeConvertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConvertion(PollaMParser.TypeConvertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PollaMParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#operationsWithSets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationsWithSets(PollaMParser.OperationsWithSetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#changeSetOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSetOperation(PollaMParser.ChangeSetOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#unionOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOperation(PollaMParser.UnionOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#differenceOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifferenceOperation(PollaMParser.DifferenceOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#intersectionOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionOperation(PollaMParser.IntersectionOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#symmetricDifferenceOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymmetricDifferenceOperation(PollaMParser.SymmetricDifferenceOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#booleanOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperations(PollaMParser.BooleanOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(PollaMParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(PollaMParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(PollaMParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#operatorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBody(PollaMParser.OperatorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(PollaMParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#sizeCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeCall(PollaMParser.SizeCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PollaMParser#clearCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCall(PollaMParser.ClearCallContext ctx);
}