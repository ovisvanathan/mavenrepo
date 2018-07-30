grammar JavaIvyGrammar;

parse
  :  line eol
  ;

line
  :  '<' dep Space* keyValue keyValue keyValue '/>'
  ;

dep
  :    'dependency'  
  ;
  
keyValue
  :  key separatorAndValue 
     {
       // Replace all escaped `=` and `:`
       String k = $key.text.replace("\\:", ":").replace("\\=", "=");

       // Remove the  separator, if it exists
       String v = $separatorAndValue.text.replaceAll("^\\s*[:=]\\s*", "");

       // Remove all escaped line breaks with trailing spaces
       v = v.replaceAll("\\\\(\r?\n|\r)[ \t\f]*", "").trim();

       System.out.println("\nkey   : `" + k + "`");
       System.out.println("value : `" + v + "`");
     }
  ;

key
  :  keyChar+
  ;

keyChar
  :  AlphaNum 
  |  Backslash (Colon | Equals)  
  ;
  
separatorAndValue
  :  (Space | Colon | Equals) Quote valueChar+ Quote
  ;

valueChar
  :  AlphaNum 
  |  Space 
  |  Backslash LineBreak
  |  Equals
  |  Colon
  |  Dash
  |  Stop
  |  Underscore
  |  AT
  |  Percent
  |  Hash
  |  Sdash
  |  Hat
  |  Exclaim
  ;

eol
  :  LineBreak
  |  EOF
  ;

WS : [ \r\t\u000C\n]+ -> skip ;  
  
Backslash : '\\';
Colon     : ':';
Equals    : '=';
Quote     : '"';
Stop      : '.';
Dash      : '-';
Underscore: '_';  
At        : '@';
Percent   : '%';
Hash      : '#';
Sdash     : '$';
Hat       : '^';
Exclaim   : '!';

Comment
  :  ('!' | '#') ~('\r' | '\n')*
  ;

LineBreak
  :  '\r'? '\n'
  |  '\r'
  ;

Space
  :  ' ' 
  |  '\t' 
  |  '\f'
  ;

AlphaNum
  :  'a'..'z'
  |  'A'..'Z'
  |  '0'..'9'
  ;  