grammar lang;
@header{
    package lang.parser;
 }

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

/* Regras da Gramática da linguagem lang */

//prog -> {data} {func}
prog: data* func*;

//data -> data_type ID ‘{’ {decl} ‘}
data: TIPO_DATA ID_TIPO_DATA ABRE_CHAVES decl* FECHA_CHAVES;
//data: DATA_TYPE ID ABRE_CHAVES decl* FECHA_CHAVES;

//decla -> ID ‘::’ type ‘;’
decl: ID DOIS_PONTOS_DUPLO type PONTO_VIRGULA;

//func -> ID ‘(’ [params] ‘)’ [‘:’ type (’,’ type)*] ‘{’ {cmd} ‘}’
func: ID ABRE_PARENTESES params? FECHA_PARENTESES (DOIS_PONTOS type (VIRGULA type)*)? ABRE_CHAVES cmd* FECHA_CHAVES;

//params -> ID ‘::’ type {, ID ‘::’ type}
params: ID DOIS_PONTOS_DUPLO type (VIRGULA ID DOIS_PONTOS_DUPLO type)*;

//type -> type ‘[’ ‘]’ | btype
type: type ABRE_COLCHETES FECHA_COLCHETES
    | btype
    ;

//btype -> Int_type | Char_type | Bool_type | Float_type | ID
btype: TIPO_INT
     | TIPO_CHAR
     | TIPO_BOOL
     | TIPO_FLOAT
     | ID_TIPO_DATA
     | ID
     ;

cmd: ABRE_CHAVES cmd* FECHA_CHAVES //‘{’ {cmd} ‘}’
   | IF ABRE_PARENTESES exp FECHA_PARENTESES cmd //if ‘(’ exp ‘)’ cmd
   | IF ABRE_PARENTESES exp FECHA_PARENTESES cmd ELSE cmd //if ‘(’ exp ‘)’ cmd else cmd
   | ITERATE ABRE_PARENTESES exp FECHA_PARENTESES cmd //iterate ‘(’ exp ‘)’ cmd
   | READ lvalue PONTO_VIRGULA //read lvalue ‘;’
   | PRINT exp PONTO_VIRGULA //print exp ‘;’
   | RETURN exp (VIRGULA exp)* PONTO_VIRGULA //return exp {‘,’ exp} ‘;’
   | lvalue ATRIBUICAO exp PONTO_VIRGULA  //lvalue = exp ‘;’
   | ID ABRE_PARENTESES exps? FECHA_PARENTESES (MENOR_QUE lvalue (VIRGULA lvalue)* MAIOR_QUE)? PONTO_VIRGULA //ID ‘(’ [exps] ‘)’ [‘<’ lvalue {‘,’ lvalue} ‘>’] ‘;’
   ;

//exp -> exp && exp | rexp
exp: exp DISJUNCAO exp
   | rexp
   ;

//rexp -> aexp < aexp | rexp == aexp | rexp != aexp | aexp
rexp: aexp MENOR_QUE aexp
    | rexp IGUALDADE aexp
    | rexp DIFERENCA aexp
    | aexp
    ;

//aexp -> aexp + mexp | aexp - mexp | mexp
aexp: aexp SOMA mexp
    | aexp SUBTRACAO mexp
    | mexp
    ;

//mexp -> mexp * sexp | mexp / sexp | mexp % sexp | sexp
mexp: mexp MULTIPLICACAO sexp
    | mexp DIVISAO sexp
    | mexp RESTO sexp
    | sexp
    ;

//sexp -> ! sexp | - sexp | true | false | null | INT | FLOAT | CHAR | pexp
sexp: NEGACAO sexp
    | SUBTRACAO sexp
    | TRUE
    | FALSE
    | NULL
    | INT
    | FLOAT
    | CHAR
    | pexp
    ;

//pexp ->
pexp: lvalue //lvalue 
    | ABRE_PARENTESES exp FECHA_PARENTESES //‘(’ exp ‘)’ 
    | NEW type (ABRE_COLCHETES exp FECHA_COLCHETES)? //new type [ ‘[’ exp ‘]’ ]
    | ID ABRE_PARENTESES exps? FECHA_PARENTESES ABRE_COLCHETES exp FECHA_COLCHETES //ID ‘(’ [exps] ‘)’ ‘[’ exp ‘]’
    ;

//lvalue -> 
lvalue: ID //ID
      | lvalue ABRE_COLCHETES exp FECHA_COLCHETES // lvalue ‘[’ exp ‘]’
      | lvalue PONTO ID //lvalue . ID 
      ;

//exps -> exp { , exp }
exps: exp (VIRGULA exp)*;


/* Regras da léxicas da linguagem lang */

//Palavras reservadas
IF: 'if';
ELSE: 'else';
ITERATE: 'iterate';
READ: 'read';
PRINT: 'print';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
NEW: 'new';

//Operadores
SOMA: '+';
MULTIPLICACAO: '*';
SUBTRACAO: '-';
DIVISAO: '/';
RESTO: '%';

//Lógicos
NEGACAO: '!';
DISJUNCAO: '&&';
DIFERENCA: '!=';
IGUALDADE: '==';
MAIOR_QUE: '>';
MENOR_QUE: '<';

//Separadores
ASPA_SIMPLES: '\'';
CONTRA_BARRA: '\\';
ATRIBUICAO: '=';
VIRGULA: ',';
PONTO_VIRGULA: ';';
PONTO: '.';
DOIS_PONTOS: ':';
DOIS_PONTOS_DUPLO: '::';

//Balanceamento e acesso
ABRE_CHAVES: '{';
FECHA_CHAVES: '}';
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';
ABRE_COLCHETES: '[';
FECHA_COLCHETES: ']';

//Tipos
TIPO_DATA: 'data';
TIPO_INT: 'Int';
TIPO_CHAR: 'Char';
TIPO_FLOAT: 'Float';
TIPO_BOOL: 'Bool';

//Verificar melhor onde ID se refere a nome de variável e onde se refere à nome de tipo
ID_TIPO_DATA: [A-Z][a-zA-Z0-9_]*;
ID: [a-zA-Z][a-zA-Z0-9_]*;
INT: '0' | '-'?[1-9][0-9]*;
FLOAT: INT? PONTO [0-9]+;
CHAR: '\''[\u0000-\u00FF]'\''
    | '\'\\t\''
    | '\'\\r\''
    | '\'\\b\''
    | '\'\\\\\''
    | '\'\'\''
    | '\'\\n\''
    ;
COMENTARIO_UMA_LINHA:'--' ~[\r\n]* -> skip;
COMENTARIO_MULTIPLAS_LINHAS:'{-' ~[\r\n]* '-}' -> skip;
WS: [ \t\n\r]+ -> skip;
