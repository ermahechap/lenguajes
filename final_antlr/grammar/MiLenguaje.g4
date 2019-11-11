grammar MiLenguaje;

/*
----------- Parser Rules ---------------
*/



start: entry ;

entry: (resource | global | body) entry | EOF;

global: 'global' ID (const | type)* 'end';
resource: spec? 'resource' ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES)?
    ( 'separate' | resource_endigns)
;

resource_endigns:
    'resource' ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES)?  'separate'
    | resource_body? body
;

resource_body :
    ('body' ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES)?)?
    (import_ | type | optype | operation | var | const)*
    //declarations?
    //(initial block end)?
    //procs
    //(final block end)?
;

body: resource_body 'end';


spec: 'spec' ID (import_ | const | type | operation)*; //not finished yet

import_: 'import' ID (',' ID)* (TK_SEMI_COLON)?;
const: 'const' equal_expression;

type: 'type' ID TK_EQUAL 'rec' TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES; // THIS one is dubious because there is no example of this
optype: 'optype' ID TK_EQUAL TK_LEFT_PARENTHESES op_type_params TK_RIGHT_PARENTHESES ('returns'param )?;
op_type_params:
    'res'? param (TK_SEMI_COLON 'res'? param)*
;
var: 'var' comma_params TK_COLON type assign_expression;

operation: 'op' comma_params ( operation_one | TK_COLON ID);
operation_one: TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES ('returns' param)? ;

proc: 'proc' ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES)? ('returns' param)? block 'end';


block: declarations? statements ;

statements: 'JA';
declarations: 'JA';

comma_params: ID subscript_slice* (',' ID subscript_slice*)*;
params: param (TK_SEMI_COLON param)*;
param: ID (',' ID)* (subscript_slice* TK_COLON ( data_type | 'cap' ID | ID));


/*
to-do
resource_body
    block

DATA_TYPE
*/

data_type: 'int' | 'char' | 'string' 'bool';

// Expressions
equal_expression: ID TK_EQUAL (binary_expression | ( ID | array ) ) (TK_SEMI_COLON)?;
assign_expression: ID TK_ASSIGN (binary_expression | ( ID | array ) ) (TK_SEMI_COLON)?;

expression: assign (TK_SEMI_COLON)?;

assign:
    array TK_SWAP (ID | array) //missing sliced array/string
    |ID assigns (binary_expression | ( ID | array ) )
;

binary_expression: or_expression;

or_expression: and_expression ( ( TK_OR | TK_XOR ) and_expression)*;//lowest precedence, left

and_expression: comp_expression (TK_AND comp_expression)*; //left

comp_expression: shift_expression (comps shift_expression)*;//left

shift_expression: simple_op_expression ( (TK_LEFT_SHIFT | TK_LEFT_SHIFT) simple_op_expression)*;

simple_op_expression: other_op_expression ( simple_op other_op_expression)*;

other_op_expression: exponentiation_expression (other_op exponentiation_expression)*;

exponentiation_expression: (unary_expression TK_EXPONENTIATION)* unary_expression;

unary_expression: post_op | pre_op | single_expr;

post_op :
    (ID | REAL) (TK_INCREMENT | TK_DECREMENT)
    | (ID) TK_POINTER
    | (array | STRING) subscript_slice*
;
pre_op :
    TK_NOT (BOOLEAN | INT)
    | sign_change (INT | REAL)
    | (TK_INCREMENT | TK_DECREMENT) (ID | REAL | INT)
    | TK_ADDRESS ID
    // missing TK_N_INVOCATIONS
;

single_expr: ID | NUMBER | STRING | array | grouping;

array: TK_LEFT_BRACKET (ID | NUMBER | STRING | BOOLEAN)(','(ID | NUMBER | STRING | BOOLEAN))* TK_RIGHT_BRACKET;
subscript_slice: TK_LEFT_BRACKET (subscript | slice) (',' (subscript | slice))* TK_RIGHT_BRACKET;
slice: subscript TK_COLON (subscript| '*');
subscript: (ID | INT);

grouping : TK_LEFT_PARENTHESES binary_expression TK_RIGHT_PARENTHESES ;


// groups of tokens
sign_change: TK_PLUS | TK_MINUS;

assigns:
    TK_ASSIGN
    | TK_INCREMENT_ASSIGN
    | TK_DECREMENT_ASSIGN
    | TK_MULTIPLICATION_ASSIGN
    | TK_DIVISION_ASSIGN
    | TK_REMAINDER_ASSIGN
    | TK_EXPONENTIATION_ASSIGN
    | TK_OR_ASSIGN
    | TK_AND_ASSIGN
    | TK_CONCAT_ASSIGN
    | TK_LEFT_SHIFT_ASSIGN
    | TK_RIGHT_SHIFT_ASSIGN
;

comps:
    | TK_EQUAL
    | TK_NOT_EQUAL
    | TK_GREATER
    | TK_GREATER_EQUAL
    | TK_lESS
    | TK_LESS_EQUAL
;

simple_op:
    | TK_CONTAT
    | TK_PLUS
    | TK_MINUS
;

other_op:
    TK_REMAINDER
    | TK_MODULUS
    | TK_DIVISION
    | TK_MULTIPLICATION
;

/*
------------- Lexer Rules --------------
*/
/*
RESERVED_WORDS:
    'global'
    |'af'
    |'read'
    |'if'
    |'fi'
    |'union'
    |'real'
    |'resource'
    |'initial'
    |'ptr'
    |'procedure'
    |'int'
    |'oc'
    |'getarg'
    |'call'
    |'any'
    |'cap'
    |'enum'
    |'import'
    |'id'
    |'ref'
    |'create'
    |'end'
    |'on'
    |'stop'
    |'od'
    |'write'
    |'send'
    |'or'
    |'body'
    |'do'
    |'fa'
    |'mod'
    |'var'
    |'val'
    |'res'
    |'downto'
    |'by'
    |'rec'
    |'vm'
    |'to'
    |'returns'
    |'bogus'
    |'return'
    |'st'
    |'writes'
    |'else'
    |'P'
    |'V'
    |'in'
    |'ni'
    |'put'
    |'end'
    |'op'
    |'fa'
    |'forward'
    |'receive'
    |'destroy'
    |'body'
    |'write'
    |'exit'
    |'final'
    |'process'
    |'send'
    |'getarg'
    |'skip'
    |'stop'
    |'char'
    |'global'
    |'import'
    |'create'
    |'destroy'
    |'reply'
    |'next'
    |'fi'
    |'ni'
    |'co'
    |'cap'
    |'proc'
    |'string'
    |'low'
    |'high'
    |'bool'
    |'file'
    |'sem'
    |'const'
    |'optype'
    |'type'
    |'external'
    |'extend'
;*/

ID: IDENTIFIER | IDENTIFIER_PTR;
IDENTIFIER : ID_LETTER (ID_LETTER | DIGIT)* () ;
IDENTIFIER_PTR: IDENTIFIER '.' IDENTIFIER;
BOOLEAN: 'true' | 'false';
NUMBER: INT | REAL;
INT: DIGIT+;
REAL: DIGIT+ '.' DIGIT+ | '.' DIGIT+ ;
STRING: '"' ( '\\"' | . )*? '"';

ID_LETTER: 'a'..'z' | 'A'..'Z' | '_';
DIGIT: '0'..'9';


// No idea what an ordered type means


//  ******** OPERTATORS **********
TK_SEPARA: '[]';
TK_LEFT_BRACKET: '[';
TK_RIGHT_BRACKET: ']';
TK_LEFT_PARENTHESES: '(';
TK_RIGHT_PARENTHESES: ')';
TK_LEFT_BRACE: '{';
TK_RIGHT_BRACE: '}';
//--
TK_EXECUTE: '->';
TK_DOT: '.';
TK_SEMI_COLON : ';' ;
TK_COLON: ':' ;
TK_COMMA: ',';

// tokens:
TK_INCREMENT : '++';
TK_DECREMENT : '--';
TK_POINTER : '^';
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
TK_CONCAT_ASSIGN: '||:=';
TK_LEFT_SHIFT_ASSIGN: '<<:=';
TK_RIGHT_SHIFT_ASSIGN: '>>:=';


// Ignored
SPACES : [ \t\r\n]+ -> skip; // tabs, new lines, spaces,etc
LINE_COMMENT: '#' .*? '\n' -> skip; // skip comments