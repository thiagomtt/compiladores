grammar La;

ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';

DECLARE: 'declare';
TIPO: 'tipo';
E: 'e';
OU: 'ou';
ATE: 'ate';
NAO: 'nao';
ESCREVA: 'escreva';
LEIA: 'leia';
FACA: 'faca';
SEJA: 'seja';
LOGICO: 'logico';
RETORNE: 'retorne';
ENTAO: 'entao';

ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';

CASO: 'caso';
FIM_CASO: 'fim_caso';

SE: 'se';
SENAO: 'senao';
FIM_SE: 'fim_se';

PARA: 'para';
FIM_PARA: 'fim_para';

FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';

REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';

PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';

VAR: 'var';
LITERAL: 'literal';
CONSTANTE: 'constante';

INTEIRO: 'inteiro';
REAL: 'real';

VERDADEIRO: 'verdadeiro';
FALSO: 'falso';

IDENT: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CADEIA: '"' (~('"'|'\n'))* '"';

NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

IGUAL: '=';
DIF: '<>';
MENOR: '<';
MENOR_IGUAL: '<=';
MAIOR: '>';
MAIOR_IGUAL: '>=';
ATRIBUICAO: '<-';

AD: '+';
SUB: '-';
DIV: '/';
RESTO: '%';
MULT: '*';
ELEVADO: '^';
E_COMERCIAL: '&';

PONTO: '.';
INTERVALO: '..';
DOIS_PONTOS: ':';
VIRGULA: ',';

ABREPAR: '(';
FECHAPAR: ')';
ABRECOL: '[';
FECHACOL: ']';

COMENTARIO: '{' ~('\n'|'}')* '}' -> skip;
WS: ( ' ' | '\t' | '\r' | '\n' ) -> skip;

/*
Regras utilizadas para os erros léxicos dos testes
*/
COMENTARIO_ERRADO: '{' .;
CADEIA_ERRADA: '"' (~('"'))* '\n';
ERRO: .;


/*
Regras sintáticas
*/
programa
        :       declaracoes 'algoritmo' corpo 'fim_algoritmo'
        ;

declaracoes
        :       (dec1_local_global)*
        ;
dec1_local_global
        :       declaracao_local
        |       declaracao_global
        ;
declaracao_local
        :       'declare' variavel
        |       'constante' identConst=IDENT ':' tipo_basico '=' valor_constante
        |       'tipo' identTipo=IDENT ':' tipo
        ;
variavel
        :       identificador (',' identificador)* ':' tipo
        ;
identificador
        :       ident1=IDENT ('.' ident2+=IDENT)* dimensao
        ;
dimensao
        :       ('[' exp_aritmetica ']')*
        ;

tipo
        :       registro
        |       tipo_estendido
        ;
tipo_basico
        :       'literal'
        |       'inteiro'
        |       'real'
        |       'logico'
        ;
tipo_basico_ident
        :       tipo_basico
        |       IDENT
        ;
tipo_estendido
        :       (pointer='^')? tipo_basico_ident
        ;

valor_constante
        :       CADEIA
        |       NUM_INT
        |       NUM_REAL
        |       'verdadeiro'
        |       'falso'
        ;

registro
        :       'registro' (variavel)* 'fim_registro'
        ;

declaracao_global
        :       'procedimento' IDENT '(' (parametros)? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
        |       'funcao' IDENT '(' (parametros)? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao'
        ;

parametros
        :       parametro (',' parametro)*
        ;
parametro
        :       ('var')? identificador (',' identificador)* ':' tipo_estendido
        ;

corpo
        :       (declaracao_local)* (cmd)*
        ;
cmd
        :       cmdLeia
        |       cmdEscreva
        |       cmdSe
        |       cmdCaso
        |       cmdPara
        |       cmdEnquanto
        |       cmdFaca
        |       cmdAtribuicao
        |       cmdChamada
        |       cmdRetorne
        ;
cmdLeia
        :       'leia' '(' ('^')? identificador (',' ('^')? identificador)* ')'
        ;
cmdEscreva
        :       'escreva' '(' expressao (',' expressao)* ')'
        ;
cmdSe
        :       'se' expressao 'entao' (ifCmd+=cmd)* ('senao' (elseCmd+=cmd)*)? 'fim_se'
        ;
cmdCaso
        :       'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso'
        ;
cmdPara
        :       'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para'
        ;
cmdEnquanto
        :       'enquanto' expressao 'faca' (cmd)* 'fim_enquanto'
        ;
cmdFaca
        :       'faca' (cmd)* 'ate' expressao
        ;
cmdAtribuicao
        :       (pointer='^')? identificador '<-' expressao
        ;
cmdChamada
        :       IDENT '(' expressao (',' expressao)* ')'
        ;
cmdRetorne
        :       'retorne' expressao
        ;

selecao
        :       (item_selecao)*
        ;
item_selecao
        :       constantes ':' (cmd)*
        ;
constantes
        :       intervalo=numero_intervalo (',' outrosIntervalos=numero_intervalo)*
        ;
numero_intervalo
        :       (op_unario)? inicio=NUM_INT ('..' (op_unario)? fim=NUM_INT)*
        ;
op_unario
        :       '-'
        ;

exp_aritmetica
        :       termo (op1 termo)*
        ;
termo
        :       fator (op2 fator)*
        ;
fator
        :       parcela (op3 parcela)*
        ;
op1
        :       '+'
        |       '-'
        ;
op2
        :       '*'
        |       '/'
        ;
op3
        :       '%'
        ;
parcela
        :       (op_unario)? parcela_unario
        |       parcela_nao_unario
        ;
parcela_unario
        :       ('^')? identificador
        |       IDENT '(' expressao (',' expressao)* ')'
        |       NUM_INT
        |       NUM_REAL
        |       '(' expSimples=expressao ')'
        ;
parcela_nao_unario
        :       endereco='&' identificador 
        |       CADEIA
        ;

exp_relacional
        :       exp_aritmetica (op_relacional exp_aritmetica)?
        ;
op_relacional
        :       '='
        |       '<>'
        |       '>='
        |       '<='
        |       '>'
        |       '<'
        ;

expressao
        :       termo_logico (op_logico_1 termo_logico)*
        ;
termo_logico
        :       fator_logico (op_logico_2 fator_logico)*
        ;
fator_logico
        :       ('nao')? parcela_logica
        ;
parcela_logica
        :       'verdadeiro' 
        |       'falso'
        |       exp_relacional
        ;
op_logico_1
        :       'ou'
        ;
op_logico_2
        :       'e'
        ;


