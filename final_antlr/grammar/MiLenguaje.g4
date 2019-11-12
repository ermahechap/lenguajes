grammar MiLenguaje;

/*
----------- Parser Rules ---------------
*/



start: entry+;

entry: resource | global |  body;

global: Global ID (const_ | type)* End;
resource: spec? Resource ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES)?
    ( Separate | resource_body )
;

body: Body ID (TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES) resource_body End;

resource_body :
    declarations*
    (Initial block End)?
    proc*
    (Final block End)?
;

spec: Spec ID (import_ | const_ | type | operation)*; //not finished yet

import_: Import ID (',' ID)* (TK_SEMI_COLON)?;
const_: Const (equal_expression | assign_expression);

type: Type ID TK_EQUAL Rec TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES; // THIS one is dubious because there is no example of this
optype: Optype ID TK_EQUAL TK_LEFT_PARENTHESES op_type_params TK_RIGHT_PARENTHESES (Returns param )?; //dont know if these are just IDS or functions are allowed too
op_type_params:
    Res ? param (TK_SEMI_COLON Res? param)*
;
var: Var comma_params TK_COLON (Cap ? ID | data_type) (assign_expression)? |
     Var assign_expression;

operation: Op comma_params ( operation_one | TK_COLON ID);
operation_one: TK_LEFT_PARENTHESES params? TK_RIGHT_PARENTHESES (Returns param)? ;

proc: (Proc | Procedure) ID (TK_LEFT_PARENTHESES comma_expressions_params? TK_RIGHT_PARENTHESES)? (Returns param)? block End;


block: declarations* statements ;

declarations: import_ | const_ | type | optype | var | operation | function_ | expression;
statements: (sequential | operation_invocation | operation_service | resource_control)*;



comma_params: ID subscript_slice* (',' ID subscript_slice*)*;
//comma_expressions: binary_expression subscript_slice* (',' binary_expression subscript_slice*)*;
comma_expressions_params:   (ID subscript_slice* | binary_expression) (',' (ID subscript_slice* | binary_expression))*;
params: param (TK_SEMI_COLON param)*;
param: ID (',' ID)* subscript_slice* TK_COLON ( data_type | 'cap' ID | ID);


/*
to-do
proc
block
    sequential || operation_service
DATA_TYPE
*/

data_type: (Int | Char | String | Bool | Chars) subscript_slice ;


// Expressions
equal_expression: ID TK_EQUAL (binary_expression | ( ID | array ) ) (TK_SEMI_COLON)?;
assign_expression: ID TK_ASSIGN (binary_expression | ( ID | array ) | data_type (TK_LEFT_PARENTHESES (array | ID | STRING) TK_RIGHT_PARENTHESES)? ) (TK_SEMI_COLON)?;

function_: (RESERVED_WORD_F | ID subscript_slice?) TK_LEFT_PARENTHESES (comma_expressions_params | expression) TK_RIGHT_PARENTHESES; //dont know if reserved word f

resource_control: create_cap_expression | destroy_cap_expression ;
create_cap_expression: ID TK_ASSIGN Create ID TK_LEFT_PARENTHESES comma_expressions_params? TK_RIGHT_PARENTHESES ('on' ID)?;
destroy_cap_expression: Destroy ID;

operation_invocation: call_expression | send_expression | concurrent_expression;
call_expression: Call? ID TK_LEFT_PARENTHESES comma_expressions_params? TK_RIGHT_PARENTHESES;
send_expression: Send ID TK_LEFT_PARENTHESES comma_expressions_params? TK_RIGHT_PARENTHESES;
concurrent_expression: Co (TK_LEFT_PARENTHESES quantifier To ID TK_RIGHT_PARENTHESES)? call_invocation (TK_EXECUTE block)? 'oc';
call_invocation: Call? (ID assigns (binary_expression | ( ID | array ) ) | function_);
quantifier: ID TK_COLON binary_expression;

sequential: 'skip' |
             var |
             (comma_expressions_params | expression) |
             var Tk_increment |
             var Tk_decrement |
             If (boolean_expression Tk_ejecuta block Tk_separa?)* Fi |
             Do (boolean_expression Tk_ejecuta block Tk_separa?)* Od |
             Fa for_expr block_cycle Af |
             'exit' |
             Next;

boolean_expression: Tk_par_izq expression Tk_par_der | expression;

for_expr : ID TK_ASSIGN expression To expression for_expr_Ls* TK_EXECUTE;
for_expr_Ls : TK_COMMA ID TK_ASSIGN expression To expression;

block_cycle : (comma_expressions_params | expression);

operation_service: 'NOTYET';


expression: assign (TK_SEMI_COLON)?;

assign:
    (ID | array) TK_SWAP (ID | array) //missing sliced array/string
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

unary_expression: post_op | pre_op | single_expr | function_;

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
subscript_slice: TK_LEFT_BRACKET (subscript | slice | '*') (',' (subscript | slice | '*'))* TK_RIGHT_BRACKET (TK_COLON (ID | data_type))?;
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

RESERVED_WORD_F : Write ; //add others

// No idea what an ordered type means
// ********* Reserved ************
/// Reserved ///
Spec : 'spec';
Global : 'global';
Res: 'res';
Af : 'af';
Read : 'read';
If : 'if';
Fi : 'fi';
Do : 'do';
Od : 'od';
Resource : 'resource';
Procedure : 'procedure';
Type : 'type';
Optype : 'optype';
Rec : 'rec';
Int : 'int';
Getarg : 'getarg';
Cap : 'cap';
Import : 'import';
Id : 'id';
Create : 'create';
End : 'end';
Stop : 'stop';
Write : 'write';
Send : 'send';
Or : 'or';
Body : 'body';
Fa : 'fa';
Mod : 'mod';
Var : 'var';
To : 'to';
True : 'true';
False : 'false';
Returns : 'returns';
Writes : 'writes';
Put : 'put';
Op : 'op';
Receive : 'receive';
Destroy : 'destroy';
Final : 'final';
Process : 'process';
Char : 'char';
Chars : 'chars';
Bool : 'bool';
Real : 'real';
Reply : 'reply';
Next : 'next';
Ni : 'ni';
Co : 'co';
Proc : 'proc';
String : 'string';
Const : 'const';
Low : 'low';
High : 'high';
Call : 'call';
In : 'in';
Separate : 'separate';

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

BOOLEAN: 'true' | 'false';
NUMBER: INT | REAL;
INT: DIGIT+;
REAL: DIGIT+ '.' DIGIT+ | '.' DIGIT+ ;
STRING: '"' ( '\\"' | . )*? '"';

ID: IDENTIFIER | IDENTIFIER_PTR;
IDENTIFIER : ID_LETTER (ID_LETTER | DIGIT)* () ;
IDENTIFIER_PTR: IDENTIFIER '.' IDENTIFIER;

ID_LETTER: 'a'..'z' | 'A'..'Z' | '_';
DIGIT: '0'..'9';

// Ignored
SPACES : [ \t\r\n]+ -> skip; // tabs, new lines, spaces,etc
LINE_COMMENT: '#' .*? '\n' -> skip; // skip comments