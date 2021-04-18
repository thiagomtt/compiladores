grammar Notas;

NOTA
    :   'nota'
    ;
FIM_NOTA
    :   'fim_nota'
    ;

PRODUTOS
    :   'produtos'
    ;

EMITENTE
    :   'emitente'
    ;
DESTINATARIO
    :   'destinatario'
    ;
ITENS
    :   'itens'
    ;
PAGAMENTO
    :   'pagamento'
    ;

IDENT
    :   ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;
CADEIA
    :   '"' (~('"'|'\n'))* '"'
    ;

NUM_INT
    :   ('0'..'9')+
    ;

CPF
    :   (NUM_INT)? (NUM_INT)? NUM_INT ('.' NUM_INT NUM_INT NUM_INT)* '-' NUM_INT NUM_INT   
    ;

CNPJ
    :   NUM_INT NUM_INT '.' NUM_INT NUM_INT NUM_INT '.' NUM_INT NUM_INT NUM_INT '/0001-' NUM_INT NUM_INT
    ;

NUM_REAL
    :   ('0'..'9')+ '.' ('0'..'9')+
    ;

ABREPAR
    :   '('
    ;
FECHAPAR
    :   ')'
    ;

DOIS_PONTOS
    :   ':'
    ;

COMENTARIO
    :   '//' ~[\r\n]*
        -> skip
    ;
BLOCO_COMENTARIO
    :   '/*' .*? '*/'
        -> skip
    ;
WHITE_SPACE
    :   ( ' ' | '\t' | '\r' | '\n' )
        -> skip
    ;

/*
Regras utilizadas para os erros léxicos dos testes
*/
COMENTARIO_ERRADO
    :   '//' ~('\n')*
    |   '/*' .*?
    ;
CADEIA_ERRADA
    :   '"' (~('"'))*
    ;
ERRO
    :   .
    ;

/* 
Regras sintáticas
*/
notaFiscal
    :   'produtos' produtos 'nota' corpo 
    ;

produtos
    :   (produto)+ 
    ;

produto
    :   nome=IDENT ':' valor=NUM_REAL descricao=CADEIA
    ;

corpo
    :   emitente destinatario itens pagamento
    ;

emitente
    :   'emitente' ':' cpf_cnpj
    ;

destinatario
    :   'destinatario' ':' cpf_cnpj
    ;

cpf_cnpj
    :   CPF
    |   CNPJ
    ;

itens
    :   'itens' ':' (item)+
    ;

item
    :   nome=IDENT ('(' quantidade=NUM_INT ')')?
    ;

pagamento
    :   'pagamento' ':' forma_pagamento
    ;

forma_pagamento
    :   IDENT
    ;
