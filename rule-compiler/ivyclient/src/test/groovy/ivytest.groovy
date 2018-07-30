package me.ivanyu;

import me.ivanyu.compiler.ExceptionThrowingErrorHandler;
import me.ivanyu.java.tree.JavaIvyExpressionParser;
import me.ivanyu.tree.IvyExpressionParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;

import me.ivanyu.java.*;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
  
  
//@RunWith(Parameterized.class)
public class GrammarTest  {
      
  //  @Parameters
     public static Object [][] data() {
             Object [][] xobs = new Object[7][2]
             xobs[0][0] = true
             xobs[0][1] = '<dependency org="org.pakiza" name="pakaaeeba" rev="2.1.8-SNAPSHOT"/>' 
             xobs[1][0] = true
             xobs[1][1] = '<dependency org="com.ahome-it" name="lienzo-core" rev="2.0.295-RELEASE"/>' 
             xobs[2][0] = true
             xobs[2][1] = '<dependency org="com.allen-sauer.gwt.dnd" name="gwt-dnd" rev="3.1.2" />' 
             xobs[3][0] = true
             xobs[3][1] = '<dependency org="com.beust" name="jcommander" rev="1.5"/>' 

             xobs[4][0] = true
             xobs[4][1] = '<dependency org="com.datastax.cassandra" \n name="cassandra-driver-core" \n rev="1.0.0"/>' 

             xobs[5][0] = true
             xobs[5][1] = '<dependency org="com.drewnoakes" name="metadata-extractor" rev="2.6.2"/>'
             xobs[6][0] = true
             xobs[6][1] = '<dependency org="com.fasterxml.jackson.core" name="jackson-core" rev="2.8.9"/>' 
             
             return xobs
        }
        
    private final boolean testValid;
    private final String testString;

    /*
    public GrammarTest(boolean testValid, String testString) {
        this.testValid = testValid;
        this.testString = testString;
    } 
    */

    public GrammarTest() {
    }   

    public void setup() {
	}

	
    
        
    @Test
    public void ruleTest() {

    		Object [][] xobs = data()
        
        for(int i=0;i<7;i++) {
            boolean valid = xobs[i][0];
            String inp = xobs[i][1]
            this.testString = inp
            
           if(inp.indexOf("\n") != -1) { 
              String [] toks = inp.split("\n")     
                
              StringBuffer sbuf = new StringBuffer() 
              for(String tok : toks) {  
                  sbuf.append(tok)
                  sbuf.append("\n")
              }
                this.testString = sbuf.toString() 
          }
            
        println " TESTSTRING =========================================" + this.testString
    
        ANTLRInputStream input = new ANTLRInputStream(this.testString);
    //    RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input);
      
        IvyGrammarLexer lexer = new IvyGrammarLexer(input);
       
       TokenStream tokens = new CommonTokenStream(lexer);

     //   RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens);

        IvyGrammarParser parser = new IvyGrammarParser(tokens);

          IvyExpressionParser treeBuilder = new IvyExpressionParser();
          parser.addParseListener(treeBuilder);
          parser.setErrorHandler(new ExceptionThrowingErrorHandler());
        
        
        parser.removeErrorListeners();
        parser.setErrorHandler(new ExceptionThrowingErrorHandler());
//        ParserRuleContext ruleContext = parser.rule_set();
          ParserRuleContext ruleContext = parser.ivy();
  
            assertNull(ruleContext.exception);
    
        
        println treeBuilder.orgVal

        }        
    }
    
 }