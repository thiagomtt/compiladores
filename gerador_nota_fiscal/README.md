# Gerador Nota Fiscal (JSON)

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

-   Um exemplo completo pode ser conferido nos arquivos 
    *   notaExemplo.in 
    *   notaExemplo.out

-   O executável se encontra em "geradorNotaFiscal/target/geradornotafiscal-1.0-SNAPSHOT-jar-with-dependencies.jar"
    Para executar utilize o seguinte formato:
    ```bash
    ~$ java -jar geradornotafiscal-1.0-SNAPSHOT-jar-with-dependencies.jar notaEntrada.in notaSaida.out
    ```