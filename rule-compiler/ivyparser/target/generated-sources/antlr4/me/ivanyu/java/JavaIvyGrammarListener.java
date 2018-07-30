// Generated from me\ivanyu\java\JavaIvyGrammar.g4 by ANTLR 4.3
package me.ivanyu.java;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaIvyGrammarParser}.
 */
public interface JavaIvyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#valueChar}.
	 * @param ctx the parse tree
	 */
	void enterValueChar(@NotNull JavaIvyGrammarParser.ValueCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#valueChar}.
	 * @param ctx the parse tree
	 */
	void exitValueChar(@NotNull JavaIvyGrammarParser.ValueCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(@NotNull JavaIvyGrammarParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(@NotNull JavaIvyGrammarParser.EolContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(@NotNull JavaIvyGrammarParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(@NotNull JavaIvyGrammarParser.KeyValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull JavaIvyGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull JavaIvyGrammarParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#keyChar}.
	 * @param ctx the parse tree
	 */
	void enterKeyChar(@NotNull JavaIvyGrammarParser.KeyCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#keyChar}.
	 * @param ctx the parse tree
	 */
	void exitKeyChar(@NotNull JavaIvyGrammarParser.KeyCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#separatorAndValue}.
	 * @param ctx the parse tree
	 */
	void enterSeparatorAndValue(@NotNull JavaIvyGrammarParser.SeparatorAndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#separatorAndValue}.
	 * @param ctx the parse tree
	 */
	void exitSeparatorAndValue(@NotNull JavaIvyGrammarParser.SeparatorAndValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull JavaIvyGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull JavaIvyGrammarParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#dep}.
	 * @param ctx the parse tree
	 */
	void enterDep(@NotNull JavaIvyGrammarParser.DepContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#dep}.
	 * @param ctx the parse tree
	 */
	void exitDep(@NotNull JavaIvyGrammarParser.DepContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaIvyGrammarParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(@NotNull JavaIvyGrammarParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaIvyGrammarParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(@NotNull JavaIvyGrammarParser.KeyContext ctx);
}