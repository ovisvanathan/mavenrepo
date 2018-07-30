import org.apache.commons.vfs2.FileSystemManager
import org.apache.commons.vfs2.VFS
import org.apache.commons.vfs2.FileObject
import org.apache.commons.vfs2.FilesCache


import me.ivanyu.compiler.ExceptionThrowingErrorHandler;
import me.ivanyu.tree.IvyExpressionParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import me.ivanyu.IvyGrammarParser;
import me.ivanyu.IvyGrammarLexer;

class scanpom {

    static String vgroupId
    static String vartifactId
    static String vversion

    static boolean pomfound = false
    
    static void main(String[] args) {

          File file = new File("C:/dl2/mavenrepo/jarswithoutpom.txt")
          def lineNo = 1
          def line
          file.withReader { reader ->
                while ((line = reader.readLine())!=null) {
            //        println  line

                     depeater_consume(line)
            
                      println vgroupId vartifactId vversion
            
                    
                    lineNo++
                }
          }
              
    }
    
    
    String [] depeater_consume(String line) {
    
           if(line.trim().startsWith("dependency")) {
            
              ANTLRInputStream input = new ANTLRInputStream(line)
              //    RuleSetGrammarLexer lexer = new RuleSetGrammarLexer(input)
  
              IvyGrammarLexer lexer = new IvyGrammarLexer(input)
   
              TokenStream tokens = new CommonTokenStream(lexer)

              //   RuleSetGrammarParser parser = new RuleSetGrammarParser(tokens)

              IvyGrammarParser parser = new IvyGrammarParser(tokens)

              IvyExpressionParser treeBuilder = new IvyExpressionParser()
              parser.addParseListener(treeBuilder)
              parser.setErrorHandler(new ExceptionThrowingErrorHandler())
    
    
     //       parser.removeErrorListeners();
     //       parser.setErrorHandler(new ExceptionThrowingErrorHandler())
    //        ParserRuleContext ruleContext = parser.rule_set();
       
              ParserRuleContext ruleContext = parser.ivy();


              assertEquals("org.pakiza", treeBuilder.orgVal)    
            
              scanpom.vgroupId = treeBuilder.orgVal
              scanpom.vartifactId = treeBuilder.nameVal
              scanpom.vversion = treeBuilder.revVal
                
           
           }
    
    }
    
}