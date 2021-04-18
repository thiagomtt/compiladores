package br.ufscar.dc.compiladores.geradornotafiscal;

import static java.lang.Float.parseFloat;

public class SemanticoVisitor extends NotasBaseVisitor<Void> {

    TabelaDeSimbolos tds = new TabelaDeSimbolos();
    // Codigo para produtos
    static int codigo = 1;

    // Valida CPF seguindo o algoritmo disponivel em
    // https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
    public boolean validaCpf(char cpf[]) {
        int j, sum, resto;

        // Parte 1
        sum = 0;
        j = 0;
        for (int i = 10; i > 1; i--) {
            sum += i * Character.getNumericValue(cpf[j]);
            j++;
        }
        resto = (sum * 10) % 11 == 10 ? 0 : (sum * 10) % 11;
        if (resto != Character.getNumericValue(cpf[cpf.length - 2])) {
            return false;
        }

        // Parte 2
        sum = 0;
        j = 0;
        for (int i = 11; i > 1; i--) {
            sum += i * Character.getNumericValue(cpf[j]);
            j++;
        }
        resto = (sum * 10) % 11 == 10 ? 0 : (sum * 10) % 11;
        if (resto != Character.getNumericValue(cpf[cpf.length - 1])) {
            return false;
        }

        return true;
    }

    // Valida CNPJ seguindo o algoritmo disponivel em
    // https://www.geradorcnpj.com/algoritmo_do_cnpj.htm
    public boolean validaCnpj(char cnpj[]) {
        int j, sum, resto;

        // Parte 1
        sum = 0;
        j = 2;
        for (int i = 11; i >= 0; i--) {
            sum += j * Character.getNumericValue(cnpj[i]);
            j++;
            if (j == 10) {
                j = 2;
            }
        }
        resto = sum % 11 < 2 ? 0 : 11 - (sum % 11);
        if (resto != Character.getNumericValue(cnpj[cnpj.length - 2])) {
            return false;
        }

        // Parte 2
        sum = 0;
        j = 2;
        for (int i = 12; i >= 0; i--) {
            sum += j * Character.getNumericValue(cnpj[i]);
            j++;
            if (j == 10) {
                j = 2;
            }
        }
        resto = sum % 11 < 2 ? 0 : 11 - (sum % 11);
        if (resto != Character.getNumericValue(cnpj[cnpj.length - 1])) {
            return false;
        }

        return true;
    }

    @Override
    public Void visitProdutos(NotasParser.ProdutosContext ctx) {
        ctx.produto().forEach(produto -> {
            String nomeProduto = produto.nome.getText();
            float valorProduto = parseFloat(produto.valor.getText());
            String descricaoProduto = produto.descricao.getText();
            // Adiciona produto na tabela e no BD
            if (tds.existe(nomeProduto) == null) {
                tds.inserir(nomeProduto, valorProduto, descricaoProduto);
                Principal.bd.inserir(nomeProduto, codigo, descricaoProduto, valorProduto, 0);
                codigo += 1;
            } else {
                SemanticoUtils.adicionarErroSemantico(produto.getStart(), "Produto ja declarado");
            }
        });
        return null;
    }

    @Override
    public Void visitEmitente(NotasParser.EmitenteContext ctx) {
        // CPF
        if (ctx.cpf_cnpj().CPF() != null) {
            String cpf = ctx.cpf_cnpj().CPF().getText().replaceAll("\\.", "").replaceAll("-", "");
            char[] cpfArray = cpf.toCharArray();

            if (!validaCpf(cpfArray)) {
                SemanticoUtils.adicionarErroSemantico(ctx.cpf_cnpj().getStart(), "CPF invalido");
            }
        // CNPJ
        } else {
            String cnpj = ctx.cpf_cnpj().CNPJ().getText().replaceAll("\\.", "").replaceAll("/", "").replaceAll("-", "");
            char[] cnpjArray = cnpj.toCharArray();

            if (!validaCnpj(cnpjArray)) {
                SemanticoUtils.adicionarErroSemantico(ctx.cpf_cnpj().getStart(), "CNPJ invalido");
            }
        }
        return super.visitEmitente(ctx);
    }

    @Override
    public Void visitDestinatario(NotasParser.DestinatarioContext ctx) {
        // CPF
        if (ctx.cpf_cnpj().CPF() != null) {
            String cpf = ctx.cpf_cnpj().CPF().getText().replaceAll("\\.", "").replaceAll("-", "");
            char[] cpfArray = cpf.toCharArray();

            if (!validaCpf(cpfArray)) {
                SemanticoUtils.adicionarErroSemantico(ctx.cpf_cnpj().getStart(), "CPF invalido");
                return null;
            }
        // CNPJ
        } else {
            String cnpj = ctx.cpf_cnpj().CNPJ().getText().replaceAll("\\.", "").replaceAll("/", "").replaceAll("-", "");
            char[] cnpjArray = cnpj.toCharArray();

            if (!validaCnpj(cnpjArray)) {
                SemanticoUtils.adicionarErroSemantico(ctx.cpf_cnpj().getStart(), "CNPJ invalido");
                return null;
            }
        }

        return null;
    }

    @Override
    public Void visitItens(NotasParser.ItensContext ctx) {
        // Set quantidade de cada item no BD
        ctx.item().forEach(item -> {
            String nomeItem = item.nome.getText();
            if (tds.existe(nomeItem) == null) {
                SemanticoUtils.adicionarErroSemantico(item.getStart(), "Item nao declarado");
            } else {
                if (item.quantidade != null) {
                    Principal.bd.setQuantidadeProduto(nomeItem, Integer.parseInt(item.quantidade.getText()));
                } else {
                    Principal.bd.setQuantidadeProduto(nomeItem, 1);
                }
            }
        });

        return super.visitItens(ctx);
    }

}
