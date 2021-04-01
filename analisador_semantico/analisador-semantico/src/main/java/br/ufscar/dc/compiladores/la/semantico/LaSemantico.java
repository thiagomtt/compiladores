package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;

public class LaSemantico extends LaBaseVisitor<Void> {

    Escopos escoposAninhados = new Escopos();

    @Override
    public Void visitPrograma(LaParser.ProgramaContext ctx) {
        if (ctx.corpo() != null) {
            if (ctx.corpo().cmd() != null) {
                // Comando de retorno permitido somente em funções. Se existir retorna erro
                for (LaParser.CmdContext cmd : ctx.corpo().cmd()) {
                    if (cmd.cmdRetorne() != null) {
                        LaSemanticoUtils.adicionarErroSemantico(cmd.cmdRetorne().getStart(), "comando retorne nao permitido nesse escopo");
                    }
                }
            }
        }
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_global(LaParser.Declaracao_globalContext ctx) {
        // Lista de parametros para função/procedimento
        List<String> parametros = new ArrayList<>();
        ctx.parametros().parametro().forEach(pctx -> {
            parametros.add(pctx.tipo_estendido().getText());
        });
        // Verifica se é função(com retorno) ou procedimento(sem retorno)
        if (ctx.tipo_estendido() != null) { // função
            escoposAninhados.obterEscopoAtual().inserir(ctx.IDENT().getText(), ctx.tipo_estendido().getText(), "funcao", parametros);
        } else { // procedimento
            escoposAninhados.obterEscopoAtual().inserir(ctx.IDENT().getText(), "", "procedimento", parametros);
            ctx.cmd().stream().filter(cctx -> (cctx.cmdRetorne() != null)).forEachOrdered(cctx -> {
                LaSemanticoUtils.adicionarErroSemantico(cctx.cmdRetorne().getStart(), "comando retorne nao permitido nesse escopo");
            });
        }
        // Declara o novo escopo da função/procedimento
        // Adiciona os parametros/variaveis/comandos no escopo 
        escoposAninhados.criarNovoEscopo();
        visitParametros(ctx.parametros());
        ctx.declaracao_local().forEach(lctx -> {
            visitDeclaracao_local(lctx);
        });
        ctx.cmd().forEach(cctx -> {
            visitCmd(cctx);
        });
        // Descarta o escopo para ser usado
        escoposAninhados.abandonarEscopo();

        return null;
    }

    @Override
    public Void visitParcela_unario(LaParser.Parcela_unarioContext ctx) {
        // Verifica se é chamada de função/procedimento
        if (ctx.IDENT() != null) {
            String ident = ctx.IDENT().getText();
            // Busca o escopo com todas as informações
            for (TabelaDeSimbolos ts : escoposAninhados.percorrerEscoposAninhados()) {
                if (ts.existe(ident) != null) {
                    // Número de parametros errado 
                    if (ts.parametros(ident).size() != ctx.expressao().size()) {
                        LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "incompatibilidade de parametros na chamada de " + ident);
                        return super.visitParcela_unario(ctx);
                    } else {
                        for (int i = 0; i < ts.parametros(ident).size(); i++) {
                            // Tipo dos parametros incompatíveis
                            if (!ts.parametros(ident).get(i).equals(VerificaTipo.Expressao(ctx.expressao(i), escoposAninhados))) {
                                LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "incompatibilidade de parametros na chamada de " + ident);
                                return super.visitParcela_unario(ctx);
                            }
                        }
                    }
                    return super.visitParcela_unario(ctx);
                }
            }
            // Função/procedimento não foi declarado
            LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "identificador " + ident + " nao declarado");
        }
        return super.visitParcela_unario(ctx); 
    }

    @Override
    public Void visitParametro(LaParser.ParametroContext ctx) {
        boolean isPointer = ctx.tipo_estendido().pointer != null;

        // tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
        if (ctx.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
            String tipoIdent = ctx.tipo_estendido().getText();
            if (isPointer) {
                tipoIdent = "^" + tipoIdent;
            }
            // Insere no escopo atual
            for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
                escoposAninhados.obterEscopoAtual().inserir(ictx.getText(), tipoIdent, isPointer);
            }
        } else {
            // tipo -> tipo_estendido -> tipo_basico_ident -> IDENT
            // Ex: Declaração de um objeto do tipo 'IDENT' dentro da passagem de parametros
            String tipoRegistro = ctx.tipo_estendido().tipo_basico_ident().IDENT().getText();
            TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
            // Retorna a subTabela correta do tipo passado
            for (TabelaDeSimbolos percorrerEscoposAninhado : escoposAninhados.percorrerEscoposAninhados()) {
                if (percorrerEscoposAninhado.existe(ctx.tipo_estendido().tipo_basico_ident().IDENT().getText()) != null) {
                    subTabela = percorrerEscoposAninhado.subTabela(ctx.tipo_estendido().tipo_basico_ident().IDENT().getText());
                    break;
                }
            }
            // Insere o objeto com a subTabela do tipo desejado
            for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
                escoposAninhados.obterEscopoAtual().inserir(ictx.getText(), "registro", tipoRegistro, subTabela);

            }
        }

        return super.visitParametro(ctx);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public Void visitDeclaracao_local(LaParser.Declaracao_localContext ctx) {
        // 'declare' variavel
        if (ctx.variavel() != null) { 
            visitVariavel(ctx.variavel());
        // 'constante' IDENT ':' tipo_basico '=' valor_constante
        } else if (ctx.tipo_basico() != null) { 
            // Insere a constante com o valor e tipo no escopo atual 
            String nomeVar = ctx.identConst.getText();
            String tipo = ctx.tipo_basico().getText();
            String valor = ctx.valor_constante().getText();
            escoposAninhados.obterEscopoAtual().inserir(nomeVar, tipo, valor);
        // 'tipo' IDENT ':' tipo
        } else {
            String nomeTipo = ctx.identTipo.getText();
            // tipo -> tipo_estendido
            if (ctx.tipo().tipo_estendido() != null) { 
                boolean isPointer = ctx.tipo().tipo_estendido().pointer != null;
                // tipo -> tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
                if (ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    String tipoIdent = ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                    if (isPointer) {
                        tipoIdent = "^" + tipoIdent;
                    }
                    // Verifica se identificador já foi declarado no escopo
                    if (escoposAninhados.obterEscopoAtual().existe(nomeTipo) != null) {
                        LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "identificador " + nomeTipo + " ja declarado anteriormente");
                    } else {
                        escoposAninhados.obterEscopoAtual().inserir(nomeTipo, tipoIdent, isPointer);
                    }
                // tipo -> tipo_estendido -> tipo_basico_ident -> IDENT
                // tipo como um tipo 
                } else {
                    ;
                }
            // tipo -> registro
            } else {
                // Cria tabela de simbolos para o registro
                TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
                ctx.tipo().registro().variavel().forEach(vctx -> {
                    // variavel -> tipo -> tipo_estendido
                    if (vctx.tipo().tipo_estendido() != null) {
                        boolean isPointer = vctx.tipo().tipo_estendido().pointer != null;
                        // tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
                        if (vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                            String tipoIdent = vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                            if (isPointer) {
                                tipoIdent = "^" + tipoIdent;
                            }
                            // Verifica se identificador já existe na subtabela do registro
                            for (LaParser.IdentificadorContext ictx : vctx.identificador()) {
                                if (subTabela.existe(ictx.getText()) != null) {
                                    LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + ictx.getText() + " ja declarado anteriormente");
                                } else {
                                    subTabela.inserir(ictx.getText(), tipoIdent, isPointer);
                                }
                            }
                        // tipo_estendido -> tipo_basico_ident -> IDENT
                        // identificador na subtabela como tipo
                        } else {
                            ;
                        }
                    // variavel -> tipo -> registro
                    // registro dentro de registro
                    } else {
                        ;
                    }
                });
                // Insere o registro com a subtabela no escopo atual
                escoposAninhados.obterEscopoAtual().inserir(nomeTipo, "registro", nomeTipo, subTabela);
            }
        }

        return null;
    }

    @Override
    public Void visitIdentificador(LaParser.IdentificadorContext ctx) {
        String nomeIdent = ctx.ident1.getText();
        if (escoposAninhados.obterEscopoAtual().existe(nomeIdent) != null) {
            // Se identificador existe, verifica se é um registro
            if (ctx.ident2.size() > 0) {
                TabelaDeSimbolos subTabela = escoposAninhados.obterEscopoAtual().subTabela(nomeIdent);
                ctx.ident2.stream().filter(t -> (subTabela.existe(t.getText()) == null)).forEachOrdered(t -> {
                    LaSemanticoUtils.adicionarErroSemantico(t, "identificador " + ctx.getText() + " nao declarado");
                });
            }
        // Identificador não declarado
        } else {
            if (ctx.ident2.size() > 0) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "identificador " + nomeIdent + "." + ctx.ident2.get(0).getText() + " nao declarado");
            } else {
                LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "identificador " + nomeIdent + " nao declarado");
            }
        }
        return null;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public Void visitVariavel(LaParser.VariavelContext ctx) {
        // tipo -> tipo_estendido
        if (ctx.tipo().tipo_estendido() != null) {
            boolean isPointer = ctx.tipo().tipo_estendido().pointer != null;
            // tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
            if (ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                String tipoIdent = ctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                if (isPointer) {
                    tipoIdent = "^" + tipoIdent;
                }
                // Verifica se identificador já existe e insere no escopo
                for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
                    String nomeIdent = ictx.ident1.getText();
                    if (escoposAninhados.obterEscopoAtual().existe(nomeIdent) != null) {
                        LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + nomeIdent + " ja declarado anteriormente");
                    } else {
                        escoposAninhados.obterEscopoAtual().inserir(nomeIdent, tipoIdent, isPointer);
                    }
                }
            // tipo_estendido -> tipo_basico_ident -> IDENT
            } else {
                String tipoIdent = ctx.tipo().getText();
                TabelaDeSimbolos subTabela;
                // Verifica se tipo existe e pega a subtabela respectiva
                if (escoposAninhados.obterEscopoAtual().existe(tipoIdent) != null) {
                    subTabela = escoposAninhados.obterEscopoAtual().subTabela(tipoIdent);
                    // Verifica se identificadores já foram declarados no escopo atual, se não insere com a subtabela correta do tipo
                    ctx.identificador().stream().map(ictx -> {
                        String nomeIdent = ictx.ident1.getText();
                        if (escoposAninhados.obterEscopoAtual().existe(nomeIdent) != null) {
                            LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + tipoIdent + " ja declarado anteriormente");
                        }
                        return nomeIdent;
                    }).forEachOrdered(nomeIdent -> {
                        escoposAninhados.obterEscopoAtual().inserir(nomeIdent, "registro", tipoIdent, subTabela);
                    });
                // Tipo não foi declarado
                } else {
                    escoposAninhados.obterEscopoAtual().inserir(ctx.identificador(0).getText(), "invalido", isPointer);
                    LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "tipo " + tipoIdent + " nao declarado");
                }
            }
        // tipo -> registro
        } else {
            // Cria subtabela para o registro
            TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
            // Varre variaveis dentro do registro da variavel 
            ctx.tipo().registro().variavel().forEach(vctx -> {
                // variavel -> tipo -> tipo_estendido
                if (vctx.tipo().tipo_estendido() != null) {
                    boolean isPointer = vctx.tipo().tipo_estendido().pointer != null;
                    // variavel -> tipo -> tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
                    if (vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                        String tipoIdent = vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                        if (isPointer) {
                            tipoIdent = "^" + tipoIdent;
                        }
                        for (LaParser.IdentificadorContext ictx : vctx.identificador()) {
                            String nomeIdent = ictx.ident1.getText();
                            if (subTabela.existe(nomeIdent) != null) {
                                LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + nomeIdent + " ja declarado anteriormente");
                            } else {
                                subTabela.inserir(nomeIdent, tipoIdent, isPointer);
                            }
                        }
                    // variavel -> tipo -> tipo_estendido -> tipo_basico_ident -> IDENT
                    } else { 
                        ;
                    }
                // variavel -> tipo -> registro
                } else {
                    ;
                }
            });
            ctx.identificador().stream().map(ictx -> {
                return ictx;
            }).forEachOrdered(ictx -> {
                escoposAninhados.obterEscopoAtual().inserir(ictx.ident1.getText(), "registro", ictx.ident1.getText(), subTabela);
            });
        }

        return null; 
    }

    @Override
    public Void visitCmdAtribuicao(LaParser.CmdAtribuicaoContext ctx) {
        String tipoIdent;
        String tipoExp;
        // Verifica se identificador existe no escopo
        if (escoposAninhados.obterEscopoAtual().existe(ctx.identificador().ident1.getText()) != null) {
            // Atribuição para variavel dentro de registro
            if (ctx.identificador().ident2.size() > 0) { 
                String registro = ctx.identificador().ident1.getText();
                String ident = ctx.identificador().ident2.get(0).getText();
                TabelaDeSimbolos subTabela = escoposAninhados.obterEscopoAtual().subTabela(registro);
                tipoIdent = subTabela.tipo(ident);
                tipoExp = VerificaTipo.Expressao(ctx.expressao(), escoposAninhados);
                // Trunca inteiro para real  
                if (tipoIdent.equals("real") && tipoExp.equals("inteiro")) {
                } else if (!tipoIdent.equals(tipoExp)) {
                    LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "atribuicao nao compativel para "+ (subTabela.isPointer(ident) ? "^" : "") + registro + "." + ident);
                }
            // Atribuição simples
            } else {
                String nomeIdent = ctx.identificador().ident1.getText();
                tipoIdent = escoposAninhados.obterEscopoAtual().tipo(nomeIdent);
                if(tipoIdent.equals("registro")){
                    tipoIdent = escoposAninhados.obterEscopoAtual().nomeRegistro(nomeIdent);
                }
                tipoExp = VerificaTipo.Expressao(ctx.expressao(), escoposAninhados);
                // Trunca inteiro para real
                if (tipoIdent.equals("real") && tipoExp.equals("inteiro")) {
                } else if (!tipoIdent.equals(tipoExp)) {
                    LaSemanticoUtils.adicionarErroSemantico(ctx.getStart(), "atribuicao nao compativel para "+ (escoposAninhados.obterEscopoAtual().isPointer(nomeIdent) ? "^" : "") + ctx.identificador().getText());
                }
            }
        }
        return super.visitCmdAtribuicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

}
