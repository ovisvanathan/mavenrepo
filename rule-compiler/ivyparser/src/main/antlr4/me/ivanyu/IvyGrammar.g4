grammar IvyGrammar;

ivy
   : value
   ;

obj
   : '<' expr '/>'
   ;

expr
   : 'dependency' logical_expr logical_expr logical_expr
   ;
   
logical_expr
    :  ( LVAL '=' RVAL )
    ;
 

LVAL 
    : 'org'
    | 'name'
    | 'rev'        
    ;

RVAL : QUOT STRING_LITERAL QUOT  
     | STRING_LITERAL
     ;      

QUOT :  '"'
     ;
     
WS : [ \r\t\u000C\n]+ -> skip ;

STRING_LITERAL : '"' (~('"' | '\\' ) | '\\' ('"' | '\\' | ' ' | '\n'))* '"';

IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9\n]*;
   
value
   : STRING
   | NUMBER
   | obj
   | 'true'
   | 'false'
   | 'null'
   ;  