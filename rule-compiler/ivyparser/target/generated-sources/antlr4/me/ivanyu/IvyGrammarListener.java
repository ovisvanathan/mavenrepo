// Generated from me\ivanyu\IvyGrammar.g4 by ANTLR 4.3
package me.ivanyu;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IvyGrammarParser}.
 */
public interface IvyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(@NotNull IvyGrammarParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(@NotNull IvyGrammarParser.Logical_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(@NotNull IvyGrammarParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(@NotNull IvyGrammarParser.ObjContext ctx);

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull IvyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull IvyGrammarParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#ivy}.
	 * @param ctx the parse tree
	 */
	void enterIvy(@NotNull IvyGrammarParser.IvyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#ivy}.
	 * @param ctx the parse tree
	 */
	void exitIvy(@NotNull IvyGrammarParser.IvyContext ctx);

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull IvyGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull IvyGrammarParser.ValueContext ctx);
}