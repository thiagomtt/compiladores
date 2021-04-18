package br.ufscar.dc.compiladores.geradornotafiscal;

import static java.lang.Float.parseFloat;
import java.util.Map.Entry;

public class GeradorNotaFiscal extends NotasBaseVisitor<Void> {

    public static StringBuilder notaFiscal = new StringBuilder();
    TabelaDeSimbolos tds = new TabelaDeSimbolos();
    BancoDeDados bd = new BancoDeDados();

    public void addCodigo(String codigo) {
        notaFiscal.append(codigo).append("\n");
    }

    public void addCodigo(int tab, String codigo) {
        for (int i = 0; i < tab; i++) {
            notaFiscal.append("\t");
        }
        notaFiscal.append(codigo).append("\n");
    }

    public void addCodigoAspas(int tab, String codigo) {
        for (int i = 0; i < tab; i++) {
            notaFiscal.append("\t");
        }
        notaFiscal.append("\"").append(codigo).append("\"");
    }

    public void addCodigoSemNewLine(String codigo) {
        notaFiscal.append(codigo);
    }

    @Override
    public Void visitNotaFiscal(NotasParser.NotaFiscalContext ctx) {
        // Abre nota
        addCodigo("[");
        addCodigo(1, "{");

        visitProdutos(ctx.produtos());
        visitCorpo(ctx.corpo());
        
        // Fecha nota
        addCodigo(1, "}");
        addCodigo("]");
        return null; 
    }

    @Override
    public Void visitProdutos(NotasParser.ProdutosContext ctx) {
        // Se o produto existir insere na tabela desta classe
        ctx.produto().forEach(produto -> {
            String nomeProduto = produto.nome.getText();
            float valorProduto = parseFloat(produto.valor.getText());
            String descricaoProduto = produto.descricao.getText();

            if (tds.existe(nomeProduto) == null) {
                tds.inserir(nomeProduto, valorProduto, descricaoProduto);
            } else {
                SemanticoUtils.adicionarErroSemantico(produto.getStart(), "Produto ja declarado");
            }
        });
        return null;
    }

    @Override
    public Void visitEmitente(NotasParser.EmitenteContext ctx) {
        addCodigoAspas(2, "emitente");
        addCodigo(": {");
        addCodigoAspas(3, "cpfCnpj");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, ctx.cpf_cnpj().getText());
        addCodigo("");
        addCodigo(2, "},");
        return null;
    }

    @Override
    public Void visitDestinatario(NotasParser.DestinatarioContext ctx) {
        String id = ctx.cpf_cnpj().getText();
        addCodigoAspas(2, "destinatario");
        addCodigo(": {");

        // Cpf/Cnpj
        addCodigoAspas(3, "cpfCnpj");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, ctx.cpf_cnpj().getText());
        addCodigo(",");
        // Razao social
        addCodigoAspas(3, "razaoSocial");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getRazaoSocial(id));
        addCodigo(",");
        // Email
        addCodigoAspas(3, "email");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getEmail(id));
        addCodigo(",");
        // Endereco
        addCodigoAspas(3, "endereco");
        addCodigo(": {");
        // Logradouro
        addCodigoAspas(4, "logradouro");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getLogradouro(id));
        addCodigo(",");
        // Numero
        addCodigoAspas(4, "numero");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Integer.toString(Principal.bd.getNumero(id)));
        addCodigo(",");
        // Bairro
        addCodigoAspas(4, "bairro");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getBairro(id));
        addCodigo(",");
        // Codigo cidade
        addCodigoAspas(4, "codigoCidade");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getCodigoCidade(id));
        addCodigo(",");
        // Descricao cidade
        addCodigoAspas(4, "descricaoCidade");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getDescricaoCidade(id));
        addCodigo(",");
        // Estado
        addCodigoAspas(4, "estado");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getEstado(id));
        addCodigo(",");
        // Cep
        addCodigoAspas(4, "cep");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Principal.bd.getCep(id));
        addCodigo("");
        // Fecha endereco
        addCodigo(3, "}");
        // Fecha destinatario
        addCodigo(2, "},");

        return super.visitDestinatario(ctx);
    }

    @Override
    public Void visitItens(NotasParser.ItensContext ctx) {
        addCodigoAspas(2, "itens");
        addCodigo(": [");

        for (int i = 0; i < ctx.item().size(); i++) {
            String produto = ctx.item(i).IDENT().getText();
            addCodigo(3, "{");
            // Codigo
            addCodigoAspas(4, "codigo");
            addCodigoSemNewLine(": ");
            addCodigoAspas(0, Integer.toString(Principal.bd.getCodigoProduto(produto)));
            addCodigo(",");
            // Descricao
            addCodigoAspas(4, "descricao");
            addCodigoSemNewLine(": ");
            addCodigoSemNewLine(Principal.bd.getDescricaoProduto(produto));
            addCodigo(",");
            // Valor
            addCodigoAspas(4, "valor");
            addCodigoSemNewLine(": ");
            addCodigoAspas(0, Float.toString(Principal.bd.getValorProduto(produto)));
            addCodigo(",");
            // Quantidade
            addCodigoAspas(4, "quantidade");
            addCodigoSemNewLine(": ");
            addCodigoAspas(0, Integer.toString(Principal.bd.getQuantidadeProduto(produto)));
            addCodigo("");

            if (i != ctx.item().size() - 1) {
                addCodigo(3, "},");
            } else {
                addCodigo(3, "}");
            }

        }

        addCodigo(2, "],");

        return super.visitItens(ctx);
    }

    @Override
    public Void visitPagamento(NotasParser.PagamentoContext ctx) {
        // Calcula valor total da nota
        float valorTotal = 0;
        for (Entry<String, EntradaBancoDeDados> produto : Principal.bd.getBanco().entrySet()) {
            if(produto.getValue().quantidade != 0){
                valorTotal += produto.getValue().quantidade * produto.getValue().valorProduto;
            }
        }
        // Inicia secao pagamentos
        addCodigoAspas(2, "pagamentos");
        addCodigo(": {");
        // Meio pagamento
        addCodigoAspas(3, "meio");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, ctx.forma_pagamento().getText());
        addCodigo(",");
        // Valor total
        addCodigoAspas(3, "valor");
        addCodigoSemNewLine(": ");
        addCodigoAspas(0, Float.toString(valorTotal));
        addCodigo("");
        
        // Fecha pagamentos
        addCodigo(2, "}");

        return super.visitPagamento(ctx); 
    }

}
