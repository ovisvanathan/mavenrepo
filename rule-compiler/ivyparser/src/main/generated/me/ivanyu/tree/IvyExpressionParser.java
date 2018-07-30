package me.ivanyu.tree; 

import me.ivanyu.IvyGrammarBaseListener;
import me.ivanyu.IvyGrammarParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Stack;

public class IvyExpressionParser extends IvyGrammarBaseListener {

    public String orgVal;
    public String nameVal;
    public String revVal;
    public String orgVal2;
    public String nameVal2;
    public String revVal2;

    
   /**
	 * Enter a parse tree produced by {@link IvyGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	public void enterLogical_expr(@NotNull IvyGrammarParser.Logical_exprContext ctx) {           
        
    }

    
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	public void exitLogical_expr(@NotNull IvyGrammarParser.Logical_exprContext ctx) {
        
    
            String result = ctx.getChild(2).getText();
            
            String rstr2 = result.replaceAll("\"", "");

             if(ctx.getChild(0).getText().equals("org"))   
                orgVal = rstr2;
             else if(ctx.getChild(0).getText().equals("name"))   
                nameVal = rstr2;
             else 
                revVal = rstr2;
            
           
    }

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#obj}.
	 * @param ctx the parse tree
	 */
	public void enterObj(@NotNull IvyGrammarParser.ObjContext ctx) {
        
    }
    
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#obj}.
	 * @param ctx the parse tree
	 */
	public void exitObj(@NotNull IvyGrammarParser.ObjContext ctx) {
        
    }

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	public void enterExpr(@NotNull IvyGrammarParser.ExprContext ctx) {
        
    }
    
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	public void exitExpr(@NotNull IvyGrammarParser.ExprContext ctx) {

    }

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#ivy}.
	 * @param ctx the parse tree
	 */
	public void enterIvy(@NotNull IvyGrammarParser.IvyContext ctx) {
        
    }
    
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#ivy}.
	 * @param ctx the parse tree
	 */
	public void exitIvy(@NotNull IvyGrammarParser.IvyContext ctx) {
        
        
    }

	/**
	 * Enter a parse tree produced by {@link IvyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	public void enterValue(@NotNull IvyGrammarParser.ValueContext ctx) {
        
    }
    
	/**
	 * Exit a parse tree produced by {@link IvyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	public void exitValue(@NotNull IvyGrammarParser.ValueContext ctx) {
      
    }
}
    