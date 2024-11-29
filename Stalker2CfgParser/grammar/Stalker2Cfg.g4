grammar Stalker2Cfg;

cfg
   : map* EOF
   ;

map
   : key STRUCT_START struct_ref* NEWLINE (pair | map)* STRUCT_END NEWLINE?
   | SINGLE_LINE_COMMENT
   | NEWLINE
   ;

pair
    : key ASSIGNMENT value? NEWLINE?
    ;
    
struct_pair
    : pair
    | STRUCT_LITERAL
    ;
   
struct_ref
    : OPEN_BRACE struct_pair (KV_SEPARATOR pair)* CLOSE_BRACE
    ;
   
    
value 
    : number
    | LITERAL
    | STRING (ARRAY_SEPARATOR STRING)*
    | PATH_REF
    | array_ref
    | PATH_VAL
    | STRING_ARRAY // pretty sure this is a bug in original stalker configs
    ;
   
key 
    : struct_key
    | STRING
    | array_ref
    | set_ref
    ;
    
array_ref
    : OPEN_BRACE INTEGER CLOSE_BRACE
    ;

set_ref
    : OPEN_BRACE SET_INDEX CLOSE_BRACE
    ;
    
number
    : NUMBER
    | PERCENTAGE
    | INTEGER
    ;

struct_key
    : STRUCT_KEY
    ;
  
// Lexer

SINGLE_LINE_COMMENT
    : '//' .*? (NEWLINE | EOF)
    ;
    
INLINE_COMMENT
    : '//' .*?
    ;

STRUCT_START
    : ':' [ ]+ 'struct.begin'
    ;
    
STRUCT_END
    : 'struct.end'
    ;
    
STRUCT_KEY
    : 'refurl'
    | 'refkey'
    ;
    
ASSIGNMENT
    : '='
    ;

PERCENTAGE
    : INT '%;'
    ;

INTEGER
   : INT
   ;
   
NUMBER
    : '-'? INT ('.' [0-9]*[f])? // 1234f, 1234.5f
    | '-'? INT ('.' [0-9]*)? // 1.2
    | '-'? '.' [0-9]+[f]      // .2f
    ;
    
fragment INT
    : '0'
    | [1-9] [0-9]*
    ;
    
LITERAL
    : 'true'
    | 'false'
    ;
    
PATH_VAL
    : STRING '\'' SINGLE_QUOTE_CHAR* '\''
    | PATH_REF '\'' SINGLE_QUOTE_CHAR* '\''
    ;

fragment SINGLE_QUOTE_CHAR
    : ~['\\\r\n]
    ;

STRING_ARRAY
    : STRING ',' STRING (',' STRING)*
    ;

STRING 
    : [A-Za-z_0-9]+ ('::' [A-Za-z_0-9]+)?
    ;

PATH_REF
    : [A-Za-z./\\]+
    ;
    
SET_INDEX
    : '*'
    ;
    
NEWLINE
    : '\r\n'
    | [\r\n\u2028\u2029]
    ;
    
STRUCT_LITERAL
    : 'bskipref'
    ;

ARRAY_SEPARATOR
    : ','
    ;

KV_SEPARATOR
    : ';'
    ;
    
OPEN_BRACE
    : '{'
    | '['
    ;

CLOSE_BRACE
    : '}'
    | ']'
    ;
    
WS
    : [ \t\u00A0\uFEFF\u2003]+ -> skip
    ;
