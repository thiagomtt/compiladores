/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.la.semantico;

/**
 *
 * @author thiago
 */
public class VerificaTipo {

    public static String Expressao(LaParser.ExpressaoContext ctx, Escopos escopo) {
        String tipoTermo = null;
        for (LaParser.Termo_logicoContext tctx : ctx.termo_logico()) {
            String tipoTermoLogico = TermoLogico(tctx, escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoTermoLogico;
            } else {
                if (!tipoTermoLogico.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String TermoLogico(LaParser.Termo_logicoContext ctx, Escopos escopo) {
        String tipoTermo = null;
        for (LaParser.Fator_logicoContext fctx : ctx.fator_logico()) {
            String tipoFatorLogico = FatorLogico(fctx, escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoFatorLogico;
            } else {
                if (!tipoFatorLogico.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String FatorLogico(LaParser.Fator_logicoContext ctx, Escopos escopo) {
        String tipoTermo = null;
        String tipoParcelaLogica = ParcelaLogica(ctx.parcela_logica(), escopo);
        if (tipoTermo == null) {
            tipoTermo = tipoParcelaLogica;
        } else {
            if (!tipoParcelaLogica.equals(tipoTermo)) {
                //erro
            }
        }
        return tipoTermo;
    }

    public static String ParcelaLogica(LaParser.Parcela_logicaContext ctx, Escopos escopo) {
        String tipoTermo = null;
        if (ctx.exp_relacional() != null) {
            String tipoExpRelacional = ExpressaoRelacional(ctx.exp_relacional(), escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoExpRelacional;
            } else {
                if (!tipoExpRelacional.equals(tipoTermo)) {
                    //erro
                }
            }
        } else {
            tipoTermo = "booleano";
        }
        return tipoTermo;
    }

    public static String ExpressaoRelacional(LaParser.Exp_relacionalContext ctx, Escopos escopo) {
        String tipoTermo = null;
        if (ctx.op_relacional() != null) {
            tipoTermo = "logico";
        } else {
            String tipoExpAritmetica = ExpressaoAritmetica(ctx.exp_aritmetica(0), escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoExpAritmetica;
            } else {
                if (!tipoExpAritmetica.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String ExpressaoAritmetica(LaParser.Exp_aritmeticaContext ctx, Escopos escopo) {
        String tipoTermo = null;
        for (LaParser.TermoContext tctx : ctx.termo()) {
            String tipoT = Termo(tctx, escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoT;
            } else {
                if (!tipoT.equals(tipoTermo)) {
                    tipoTermo = "INVALIDO";
                }
            }
        }
        return tipoTermo;
    }

    public static String Termo(LaParser.TermoContext ctx, Escopos escopo) {
        String tipoTermo = null;
        for (LaParser.FatorContext fctx : ctx.fator()) {
            String tipoFator = Fator(fctx, escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoFator;
            } else {
                if (!tipoFator.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String Fator(LaParser.FatorContext ctx, Escopos escopo) {
        String tipoTermo = null;
        for (LaParser.ParcelaContext pctx : ctx.parcela()) {
            String tipoParcela = Parcela(pctx, escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoParcela;
            } else {
                if (!tipoParcela.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String Parcela(LaParser.ParcelaContext ctx, Escopos escopo) {
        String tipoTermo = null;
        if (ctx.parcela_unario() != null) {
            String tipoParcelaUnario = ParcelaUnario(ctx.parcela_unario(), escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoParcelaUnario;
            } else {
                if (!tipoParcelaUnario.equals(tipoTermo)) {
                    //erro
                }
            }
        } else {
            String tipoParcelaNaoUnario = ParcelaNaoUnario(ctx.parcela_nao_unario(), escopo);
            if (tipoTermo == null) {
                tipoTermo = tipoParcelaNaoUnario;
            } else {
                if (!tipoParcelaNaoUnario.equals(tipoTermo)) {
                    //erro
                }
            }
        }
        return tipoTermo;
    }

    public static String ParcelaUnario(LaParser.Parcela_unarioContext ctx, Escopos escopo) {
        String tipoTermo = null;
        if (ctx.identificador() != null) {
            String ident = ctx.identificador().ident1.getText();
            // Busca o tipo dentro da subtabela do registro
            if (ctx.identificador().ident2.size() > 0) {
                for (TabelaDeSimbolos ts : escopo.percorrerEscoposAninhados()) {
                    if (ts.existe(ident) != null) {
                        // Retorna o tipo do identificador no escopo atual
                        if (!ts.tipo(ident).equals("registro") && ts.subTabela(ident) == null) {
                            return ts.tipo(ident);
                        // Se for registro pega o nome do registro dentro da subtabela
                        } else if (ts.tipo(ident).equals("registro")) {
                            return ts.subTabela(ident).tipo(ctx.identificador().ident2.get(0).getText());
                        }
                    }
                }
            // Retorna o tipo do identificador no escopo atual
            // Se for registro retorna o nome do registro 
            } else {
                tipoTermo = escopo.obterEscopoAtual().tipo(ident);
                if(tipoTermo.equals("registro")){
                    tipoTermo = escopo.obterEscopoAtual().nomeRegistro(ident);
                }
            }
        // Retorna o tipo de retorno da função
        } else if (!ctx.expressao().isEmpty() && ctx.IDENT() != null) {
            String identificador = ctx.IDENT().getText();
            for (TabelaDeSimbolos ts : escopo.percorrerEscoposAninhados()) {
                if (ts.existe(identificador) != null) {
                    if (ts.retorno(identificador).equals("funcao")) {
                        tipoTermo = ts.tipo(identificador);
                        break;
                    }
                }
            }
        } else if (ctx.NUM_INT() != null) {
            tipoTermo = "inteiro";
        } else if (ctx.NUM_REAL() != null) {
            tipoTermo = "real";
        } else {
            tipoTermo = Expressao(ctx.expSimples, escopo);
        }
        return tipoTermo;
    }

    public static String ParcelaNaoUnario(LaParser.Parcela_nao_unarioContext ctx, Escopos escopo) {
        String tipoTermo = null;
        // Retorna o tipo do identificador no escopo atual
        if (ctx.identificador() != null) {
            if (ctx.endereco != null) {
                tipoTermo = "^" + escopo.obterEscopoAtual().tipo(ctx.identificador().getText());
            } else {
                tipoTermo = escopo.obterEscopoAtual().tipo(ctx.identificador().getText());
            }
        // Tipo de CADEIA é 'literal' (pela gramatica)
        } else {
            tipoTermo = "literal";
        }
        return tipoTermo;
    }

}
