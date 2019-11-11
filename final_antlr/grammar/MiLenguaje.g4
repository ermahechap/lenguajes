grammar MiLenguaje;

/*
----------- Parser Rules ---------------
*/



start: expression;

// Expressions

expression
:
    ID
    | PRE_OPERATOR ID
    | ID POST_OPERATOR
;



/*
------------- Lexer Rules --------------
*/


// Operand types
ID : [a-zA-Z]*;



// TOKEN DEFINITION:
TK_INCREMENT : '++';
TK_DECREMENT : '--';
TK_POINTER : '^';
TK_SUBCRIPT : '[...]';
TK_NOT: 'not' | '~';
TK_PLUS: '+';
TK_MINUS: '-';
TK_ADDRESS: '@';
TK_N_INVOCATIONS: '?';
TK_EXPONENTIATION: '**';
TK_MULTIPLICATION: '*';
TK_DIVISION: '/';
TK_REMAINDER: '%';
TK_MODULUS: 'mod';
TK_CONTAT: '||';
TK_LEFT_SHIFT: '<<';
TK_RIGHT_SHIFT: '>>';
TK_EQUAL: '=';
TK_NOT_EQUAL: '!=' | '~=';
TK_GREATER: '>';
TK_lESS: '<';
TK_GREATER_EQUAL: '>=';
TK_LESS_EQUAL: '<=';
TK_AND: '&' | 'and';
TK_OR: 'or' | '|';
TK_XOR: 'xor';
TK_ASSIGN: ':=';
TK_SWAP: ':=:';
TK_INCREMENT_ASSIGN: '+:=';
TK_DECREMENT_ASSIGN: '-:=';
TK_MULTIPLICATION_ASSIGN: '*:=';
TK_DIVISION_ASSIGN: '/:=';
TK_REMAINDER_ASSIGN: '%:=';
TK_EXPONENTIATION_ASSIGN: '**:=';
TK_OR_ASSIGN: '|:=';
TK_AND_ASSIGN: '&:=';
TK_CONTAT_ASSIGN: '||:=';
TK_LEFT_SHIFT_ASSIGN: '<<:=';
TK_RIGHT_SHIFT_ASSIGN: '>>:=';
//--
TK_SEPARA: '[]';
TK_LEFT_BRACKET: '[';
TK_RIGHT_BRACKET: ']';
TK_LEFT_PARENTHESES: '(';
TK_RIGHT_PARENTHESES: ')';
TK_LEFT_BRACE: '{';
TK_RIGHT_BRACE: '}';
//--
TK_EXECUTE: '->';
TK_DOT: '.'


PRE_OPERATOR: '++' | '--' | '^' ;
POST_OPERATOR: 'not' | '~' | '-' | '++' | '--' | '@'

// Ignored
SPACES : [ \t\r\n]+ -> skip; // tabs, new lines, spaces,etc