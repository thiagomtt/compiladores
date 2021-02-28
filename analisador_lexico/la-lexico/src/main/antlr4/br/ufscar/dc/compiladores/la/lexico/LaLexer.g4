lexer grammar LaLexer;

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
OU_LOGICO: '^';
E_LOGICO: '&';

PONTO: '.';
RETICENCIAS: '..';
DOIS_PONTOS: ':';
VIRGULA: ',';

ABREPAR: '(';
FECHAPAR: ')';
ABRECOL: '[';
FECHACOL: ']';

COMENTARIO: '{' ~('\n'|'}')* '}' -> skip;
WS: ( ' ' | '\t' | '\r' | '\n' ) -> skip;

COMENTARIO_ERRADO: '{' .;
CADEIA_ERRADA: '"' (~('"'))* '\n';
ERRO: .;
