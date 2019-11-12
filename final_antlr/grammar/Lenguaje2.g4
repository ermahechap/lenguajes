grammar Lenguaje2;

/// Componentes ///
components : global | resource_specification | resource_body | proc | block;

///main : specification resource_specification main | global main | E;

specification : Spec Identifier specification_body | E;

specification_body
    : Import specification_body |
    operation specification_body |
    variable specification_body |
    constant specification_body |
    type specification_body;

global: Global Identifier declarations End;

resource_specification: specification? | Resource Identifier resource_options? resource_body End;

resource_options: Tk_par_izq Tk_par_der | E;


resource_body:
        body_id? |
        Import resource_body |
        proc |
        declarations? |
        write;

write : Write Tk_par_izq formal_identifiers? Tk_par_der;

body_id : Body Identifier block End ;

proc : Procedure Identifier Tk_par_izq formal_identifiers Tk_par_der return? block End |
       Proc Identifier Tk_par_izq formal_identifiers? Tk_par_der return? block End ;

block : declarations? statements ;

initial : ;

final : ;

formal_identifiers : Identifier formal_identifiers_Ls* ;
formal_identifiers_Ls : Tk_coma Identifier;

result_identifier : ;

/// Declaraciones ///

declarations : variable_or_constant* | type* | operation_type* | operation* | E;

expression : Id | literal | invocation | constructor | binary_expr | prefix_expr | suffix_expr | create_expr;

literal: Numerico | String | True | False;

variable_or_constant : constant | variable;

constant : Const Identifier Tk_asig expr;

invocation : expr paren_list;

paren_list : Tk_par_izq paren_item_ls Tk_par_der;

paren_item_ls : E | expr_Lp;

expr_Lp : expr expr_Lp2;
expr_Lp2 : Tk_coma expr expr_Lp2 | E;
expr : Numerico | Identifier;

constructor : Tk_par_izq constr_item_Lp Tk_par_der;

constr_item_Lp : constr_item constr_item_Lp2;
constr_item_Lp2 : Tk_coma constr_item constr_item_Lp2 | E;
constr_item : expr | Tk_par_izq expr Tk_par_der;

binary_expr : expr Tk_exp expr | expr Tk_multi expr | expr Tk_div expr |
              expr Tk_residuo expr | expr Tk_rem_asign expr | expr Tk_mas expr |
              expr Tk_menos expr| expr Tk_conc expr | expr Tk_igual expr |
              expr Tk_ne expr | expr Tk_ge expr | expr Tk_menor_igual expr |
              expr Tk_mayorque expr | expr Tk_menorque expr | expr Tk_and expr |
              expr Tk_or expr | expr Tk_xor expr | expr Tk_right_shift expr |
              expr Tk_left_shift expr | expr Tk_swap expr | expr Tk_asig expr |
              expr Tk_inc_asing expr | expr Tk_dec_asing expr |
              expr Tk_mult_asing expr | expr Tk_div_asing expr | expr Tk_rem_asing expr |
              expr Tk_exp_asing expr | expr Tk_or_asing expr | expr Tk_and_asing expr |
              expr Tk_concat_asing expr | expr Tk_right_shift_asign expr |
              expr Tk_left_shift_asign expr;

prefix_expr : Tk_bit_wise expr | Tk_mas expr | Tk_menos expr |
              Tk_direccion expr | Tk_num_llamadas expr | Tk_increment expr |
              Tk_decrement expr | basic_type paren_expr | String paren_expr |
              Low Tk_par_izq type Tk_par_der | High Tk_par_izq type Tk_par_der |
              Tk_new Tk_par_izq subscripts_opt new_item Tk_par_der;

basic_type : ;

paren_expr : ;

subscripts_opt : ;

new_item : ;

suffix_expr :expr Tk_increment | expr Tk_decrement | expr Tk_puntero | expr Tk_punto Identifier | expr Tk_llave_izq bound_lp Tk_llave_der;

bound_lp: bounds bound_lp2;
bound_lp2:  Tk_coma bounds bound_lp2;

bounds: bound | bound Tk_dos_puntos bound;

bound : expr | Tk_multi;

create_expr : ;

type : Type Identifier Tk_igual Rec parameters ;

operation_type : Optype Identifier Tk_igual parameters return?;
return : Returns result_identifier;

parameters : Tk_par_izq argms Tk_par_der;

argms : Identifier Tk_dos_puntos data_type;

data_type : Int | Char | Bool | Real;

variable : Var Identifier subscripts? variable_asign;

variable_asign : Tk_dos_puntos data_type | asign_expr?;

asign_expr : Tk_asig expr;

subscripts : Tk_cor_izq subscripts_params Tk_cor_der subscripts_Ls | E;
subscripts_Ls : Tk_coma Identifier subscripts | E;
subscripts_params : Identifier subscripts_params_Ls* | expr Tk_dos_puntos expr  subscripts_params_Ls*| E;
subscripts_params_Ls : Tk_coma Identifier | Tk_coma expr Tk_dos_puntos expr | E;

operation : Op Identifier;

/// Statements ///
statements : sequential* | operation_invoc | operation_serv | resource_control;

sequential:
        'skip' |
         variable Tk_asig expr |
         variable Tk_increment |
         variable Tk_decrement |
         If (boolean_expression Tk_ejecuta block Tk_separa?)* Fi |
         Do (boolean_expression Tk_ejecuta block Tk_separa?)* Od |
         Fa for_expr block Af |
         'exit' |
         Next;

for_expr : Identifier Tk_asig expr To expr for_expr_Ls* Tk_ejecuta;
for_expr_Ls : Tk_coma Identifier Tk_asig expr To expr;

operation_invoc : Call? operation actuals+ | Send operation actuals+;

actuals : Identifier Tk_par_izq actuals_params? Tk_par_der;
actuals_params : Identifier actuals_params2*;
actuals_params2 : Tk_coma Identifier;

operation_serv : In quantifier+ operation formal_identifiers+ boolean_expression? Tk_asig block Tk_separa Ni;

resource_control : ;

boolean_expression: Tk_par_izq expr Tk_par_der | expression;

quantifier : Identifier;

/// Reserved ///
Spec : 'spec';
Global : 'global';
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
Numerico : [0-9]+('.'[0-9]+)?('e'[0-9]+('.'[0-9]+)?)?
                   |[0-9]+('.'[0-9]+)?('E'[0-9]+('.'[0-9]+)?)?;
Identifier : [a-zA-Z][A-Za-z0-9]+[A-Za-z0-9];

/// Tokens ///
Tk_par_izq : '(';
Tk_par_der :')';
Tk_increment :'++';
Tk_decrement :'--';
Tk_puntero :'^';
Tk_bit_wise :'not';
Tk_bit_wise_ :'~';
Tk_mas :'+';
Tk_menos :'-';
Tk_direccion :'@';
Tk_num_llamadas :'?';
Tk_exp :'**';
Tk_multi :'*';
Tk_div :'/';
Tk_residuo :'%';
Tk_swap :':=:';
Tk_conc :'||';
Tk_left_shift :'<<';
Tk_right_shift :'>>';
Tk_igual :'=';
Tk_negacion :'!';
Tk_punto_y_coma :';';
Tk_asig :':=';
Tk_dos_puntos :':';
Tk_coma :',';
Tk_punto :'.';
Tk_ejecuta :'->';
Tk_inc_asign :'+:=';
Tk_dec_asign :'-:=';
Tk_mult_asign :'*:=';
Tk_div_asign :'/:=';
Tk_rem_asign :'%:=';
Tk_exp_asign :'**:=';
Tk_or_asign :'|:=';
Tk_and_asign :'&:=';
Tk_concat_asign :'||:=';
Tk_left_shift_asign :'<<:=';
Tk_right_shift_asign :'>>:=';
Tk_distinto :'!=';
Tk_distinto_ :'~=';
Tk_cor_izq :'[';
Tk_cor_der :']';
Tk_menorque :'<';
Tk_mayorque :'>';
Tk_mayor_igual :'>=';
Tk_menor_igual :'<=';
Tk_separa :'[]';
Tk_llave_izq :'{';
Tk_llave_der :'}';
Tk_slice :'...';
Tk_div_sum :'/+';
Tk_mod :'mod';
Tk_and :'and';
Tk_and_ :'&';
Tk_or :'or';
Tk_or_ :'|';
Tk_xor :'xor';

WHITESPACE : [ \r\n\t] -> skip;
E :  [ \r\n\t] -> skip;

/// Comentarios ///
COMMENT : '#'.*? -> skip;
LINE_COMMENT : '#' ~[\r\n]* -> skip ;