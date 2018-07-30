
import org.apache.commons.vfs2.FileSystemManager
import org.apache.commons.vfs2.VFS
import org.apache.commons.vfs2.FileObject
import org.apache.commons.vfs2.FilesCache

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;



import me.ivanyu.compiler.ExceptionThrowingErrorHandler;
import me.ivanyu.tree.IvyExpressionParser;
import me.ivanyu.IvyGrammarParser;
import me.ivanyu.IvyGrammarLexer;

class pomscanner {

    static String vgroupId
    static String vartifactId
    static String vversion

    static boolean pomfound = false
    
    static FileObject file
    
    static String [] gavdeps 
    
   static void main(String[] args) {

        def scanner = new pomscanner()
  File file = new File("C:/dl2/mavenrepo/ivy-dict.xml")
          def lineNo = 1
          def line
          def StringBuffer sbuf = new StringBuffer()
          file.withReader { reader ->
                while ((line = reader.readLine())!=null) {
            
                    // as lines may contain newlines int hem, we need to handle that    
                    // we simply wait until the last new line and then merge the input
                    sbuf.append(line)
                    if(!line.contains("/>")) { 
                            sbuf.append(" ")
                            continue;
                    }
                                        
                    gavdeps = scanner.depeater_consume(sbuf.toString())
                             
            //        if(gavdeps[0] == null) continue 

                             
                    printf( "result = %s, %s, %s", gavdeps[0],   gavdeps[1],  (gavdeps[2] == null)? "NULL" : gavdeps[2])
                    println()
     
                    sbuf = new StringBuffer()
                    lineNo++
  
  
                    populateTree(gavdeps)
  
                }
          }
          
          
     }
      
        static String[] depeater_consume(line) {

        //    println line
    
            String [] gavs = new String[3];
            if(line.trim().startsWith("<dependency")) {

            
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
            
              gavs[0] = treeBuilder.orgVal
              gavs[1] = treeBuilder.nameVal
              gavs[2] = treeBuilder.revVal

   //           printf( "result = %s, %s, %s", gavs[0],   gavs[1],  (gavs[2] == null)? "NULL" : gavs[2])
   //           println()
              
           
           }
    
              return gavs;  
            
        }
   }
   
   
   