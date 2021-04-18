# Gerador Nota Fiscal (JSON)

## Grupo

-   Thiago de Moraes Teixeira    - 760667
-   Victoria de Martini de Souza - 759378

## Objetivo

-   O intuito desse projeto foi a unificação dos projetos anteriores resultando em uma aplicação que realiza as análises lexa, sintática, semântica e a geração de código.
-   A aplicação recebe um arquivo com uma área de declaração dos produtos que podem, ou não, estar presentes na nota fiscal, campos que recebem CPF/CNPJ tanto do emitente quanto do destinatário, itens que de fato estarão inclusos na nota e a forma do pagamento.

## Utilização

-   O molde do arquivo de entrada é o seguinte:
```txt
produtos
    // nomeProduto : valor "descrição"
    produto1: 10 "descrição do produto 1"

nota
    emitente:
        cpf/cnpj
    destinatario:
        cpf/cnpj
    itens:
        // item (quantidade)
        produto1 (2)
    pagamento:
        cartao
```

