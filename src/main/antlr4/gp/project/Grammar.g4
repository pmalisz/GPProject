grammar Grammar;

/*
 * Parser Rules
 */
program
    :   PROGRAM LEFT_BRACE statement RIGHT_BRACE EOF ;

statement
    :   statement simple_statement
    |   simple_statement ;

simple_statement
    :   (variable_declaration SEMI)
    |   (io_functions SEMI)
    |   block_statement
    |   conditional_statement
    |   iteration_statement ;

variable_declaration
    :   ID ASSIGN equation ;

io_functions
    :   IN '()'
    |   OUT LEFT_PAREN factor RIGHT_PAREN ;

block_statement
    :   LEFT_BRACE statement RIGHT_BRACE ;

conditional_statement
    :   IF LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE statement RIGHT_BRACE (ELSE (LEFT_BRACE statement RIGHT_BRACE | conditional_statement))? ;

iteration_statement
    :   WHILE LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE statement RIGHT_BRACE ;

expression
    :   expression (OR | AND) expression
    |   expression (GREATER_THEN | LESS_THEN) expression
    |   expression (EQUAL | NOT_EQUAL) expression
    |   LEFT_PAREN expression RIGHT_PAREN
    |   NOT expression
    |   equation ;

equation
   :   equation (TIMES | DIV)  equation
   |   equation (PLUS | MINUS) equation
   |   LEFT_PAREN equation RIGHT_PAREN
   |   (PLUS | MINUS)* factor
   ;

factor
   :   ID
   |   INT ;

/*
 * Lexer Rules
 */
fragment DIGIT    : [0-9] ;
fragment LETTER   : [a-zA-Z] ;

IF              : 'if' ;
ELSE            : 'else' ;
WHILE           : 'while' ;
IN              : 'in' ;
OUT             : 'out' ;
PROGRAM         : 'program' ;

SEMI            : ';';

LEFT_PAREN      : '(';
RIGHT_PAREN     : ')';
LEFT_BRACE      : '{';
RIGHT_BRACE     : '}';

PLUS            : '+' ;
MINUS           : '-' ;
TIMES           : '*' ;
DIV             : '/' ;
ASSIGN          : '=' ;

GREATER_THEN    : '>' ;
LESS_THEN       : '<' ;
AND             : '&&' ;
OR              : '||' ;
NOT             : '!' ;
EQUAL           : '==' ;
NOT_EQUAL       : '!=' ;

ID              : LETTER (LETTER | DIGIT)* ;
INT             : DIGIT+ ;

WHITESPACE      : (' ' | '\t') -> skip ;
NEWLINE         : ('\r'? '\n' | '\r')+ -> skip ;