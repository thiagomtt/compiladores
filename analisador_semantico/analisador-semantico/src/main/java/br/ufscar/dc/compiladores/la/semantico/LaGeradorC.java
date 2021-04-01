package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;

public class LaGeradorC extends LaBaseVisitor<Void> {

    public static StringBuilder codigoC = new StringBuilder();
    Escopos escoposAninhados = new Escopos();

    private boolean existeIdentificador(LaParser.IdentificadorContext ctx) {
        for (TabelaDeSimbolos tabela : escoposAninhados.percorrerEscoposAninhados()) {
            if (tabela.existe(ctx.ident1.getText()) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Void visitPrograma(LaParser.ProgramaContext ctx) {
        // Gera a base do programa C
        codigoC.append("#include <stdio.h>\n");
        codigoC.append("#include <stdlib.h>\n");
        codigoC.append("\n");
        visitDeclaracoes(ctx.declaracoes());
        codigoC.append("int main(){");
        codigoC.append("\n");
        visitCorpo(ctx.corpo());
        codigoC.append("return 0;\n");
        codigoC.append("}");

        return null;
    }

    @Override
    public Void visitDeclaracao_global(LaParser.Declaracao_globalContext ctx) {
        // Pega os parametros da função/procedimento
        List<String> parametros = new ArrayList<>();
        ctx.parametros().parametro().forEach(pctx -> {
            parametros.add(pctx.tipo_estendido().getText());
        });

        // Função
        if (ctx.tipo_estendido() != null) {
            String tipoInC = "";
            switch (ctx.tipo_estendido().getText()) {
                case "literal" ->
                    tipoInC = "char";
                case "inteiro" ->
                    tipoInC = "int";
                case "real" ->
                    tipoInC = "float";
            }
            codigoC.append(tipoInC).append(" ").append(ctx.IDENT().getText()).append(" (");
            escoposAninhados.obterEscopoAtual().inserir(ctx.IDENT().getText(), ctx.tipo_estendido().getText(), "funcao", parametros);
            // Procedimento (função sem retorno)
        } else {
            codigoC.append("void ").append(ctx.IDENT().getText()).append(" (");
            escoposAninhados.obterEscopoAtual().inserir(ctx.IDENT().getText(), "", "procedimento", parametros);
        }

        // Declara o novo escopo da função/procedimento
        // Imprime os parametros/variaveis/comandos
        escoposAninhados.criarNovoEscopo();
        visitParametros(ctx.parametros());
        codigoC.append(") {\n");
        ctx.declaracao_local().forEach(lctx -> {
            visitDeclaracao_local(lctx);
        });
        ctx.cmd().forEach(cctx -> {
            visitCmd(cctx);
        });
        codigoC.append("}\n");
        escoposAninhados.abandonarEscopo();
        return null;
    }

    @Override
    public Void visitParametros(LaParser.ParametrosContext ctx) {
        // Visita todos os parametros e imprime
        for (int i = 0; i < ctx.parametro().size(); i++) {
            visitParametro(ctx.parametro(i));
            if (i != ctx.parametro().size() - 1) {
                codigoC.append(", ");
            }
        }
        return null;
    }

    @Override
    public Void visitParametro(LaParser.ParametroContext ctx) {
        boolean isPointer = ctx.tipo_estendido().pointer != null;

        // tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
        if (ctx.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
            String tipoIdent = ctx.tipo_estendido().getText();
            // Imprime cada parametro com seu tipo
            for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
                escoposAninhados.obterEscopoAtual().inserir(ictx.getText(), tipoIdent, isPointer);
                switch (tipoIdent) {
                    case "literal" ->
                        codigoC.append("char* ").append(ictx.ident1.getText());
                    case "inteiro", "logico" ->
                        codigoC.append("int ").append((isPointer) ? "*" : "").append(ictx.ident1.getText());
                    case "real" ->
                        codigoC.append("float ").append((isPointer) ? "*" : "").append(ictx.ident1.getText());
                }
            }
            // tipo_estendido -> tipo_basico_ident -> IDENT
            // Declaração de tipo dentro dos parametros
        } else {
            String tipoRegistro = ctx.tipo_estendido().tipo_basico_ident().IDENT().getText();
            TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
            // Resgata a subtabela do tipo 
            for (TabelaDeSimbolos percorrerEscoposAninhado : escoposAninhados.percorrerEscoposAninhados()) {
                if (percorrerEscoposAninhado.existe(ctx.tipo_estendido().tipo_basico_ident().IDENT().getText()) != null) {
                    subTabela = percorrerEscoposAninhado.subTabela(ctx.tipo_estendido().tipo_basico_ident().IDENT().getText());
                    break;
                }
            }
            // Declara o parametro como tipo no escopo atual
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
            codigoC.append("#define ").append(ctx.identConst.getText()).append(" ").append(ctx.valor_constante().getText()).append("\n");
            // 'tipo' IDENT ':' tipo
        } else {
            // Trata como typedef
            String nomeTipo = ctx.identTipo.getText();
            codigoC.append("typedef ");

            // tipo -> tipo_estendido
            if (ctx.tipo().tipo_estendido() != null) {
                ;
                // tipo -> registro
                // Tratado como struct
            } else {
                String nomeRegistro = nomeTipo;
                TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
                codigoC.append("struct {\n");
                // Visita as variaveis do registro e verifica o tipo 
                ctx.tipo().registro().variavel().forEach(vctx -> {
                    if (vctx.tipo().tipo_estendido() != null) {
                        boolean isPointer = vctx.tipo().tipo_estendido().pointer != null;
                        // variavel -> tipo -> tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
                        if (vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                            String tipoIdent = vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                            // Verifica se variavel já foi declarada 
                            // Se não, insere na subtabela do registro
                            for (LaParser.IdentificadorContext ictx : vctx.identificador()) {
                                if (subTabela.existe(ictx.getText()) != null) {
                                    LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + ictx.getText() + " ja declarado anteriormente");
                                } else {
                                    switch (tipoIdent) {
                                        case "literal" ->
                                            codigoC.append("char ").append(ictx.getText()).append("[80];\n");
                                        case "inteiro", "logico" ->
                                            codigoC.append("int ").append(ictx.getText()).append(";\n");
                                        case "real" ->
                                            codigoC.append("float ").append(ictx.getText()).append(";\n");
                                    }
                                    subTabela.inserir(ictx.getText(), tipoIdent, isPointer);
                                }
                            }
                            // variavel -> tipo -> tipo_estendido - tipo_basico_ident - IDENT    
                        } else {
                            ;
                        }
                        // variavel -> tipo -> registro
                    } else {
                        ;
                    }
                });
                codigoC.append("} ").append(nomeRegistro).append(";\n");
                escoposAninhados.obterEscopoAtual().inserir(nomeRegistro, "registro", nomeRegistro, subTabela);
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
                // Declara cada identificador
                for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
                    String nomeIdent = ictx.ident1.getText();
                    switch (tipoIdent) {
                        case "literal" -> {
                            codigoC.append("char ").append((isPointer) ? "*" : "").append(ictx.getText()).append("[80];\n");
                            escoposAninhados.obterEscopoAtual().inserir(nomeIdent, tipoIdent, isPointer);
                        }
                        case "inteiro", "logico" -> {
                            codigoC.append("int ").append((isPointer) ? "*" : "").append(ictx.getText()).append(";\n");
                            escoposAninhados.obterEscopoAtual().inserir(nomeIdent, tipoIdent, isPointer);
                        }
                        case "real" -> {
                            codigoC.append("float ").append((isPointer) ? "*" : "").append(ictx.getText()).append(";\n");
                            escoposAninhados.obterEscopoAtual().inserir(nomeIdent, tipoIdent, isPointer);
                        }
                    }
                }
                // tipo_estendido -> tipo_basico_ident -> IDENT
            } else {
                // Declara o tipo registro
                String nomeIdent = ctx.identificador(0).getText();
                String tipoIdent = ctx.tipo().getText();
                TabelaDeSimbolos subTabela = escoposAninhados.obterEscopoAtual().subTabela(tipoIdent);
                codigoC.append(tipoIdent).append(" ").append(nomeIdent).append(";\n");
                escoposAninhados.obterEscopoAtual().inserir(nomeIdent, "registro", tipoIdent, subTabela);
            }
            // tipo -> registro
        } else {
            // Cria a estrutura do struct
            String nomeRegistro = ctx.identificador(0).getText();
            TabelaDeSimbolos subTabela = new TabelaDeSimbolos();
            codigoC.append("struct {\n");
            ctx.tipo().registro().variavel().forEach(vctx -> {
                // variavel -> tipo -> tipo_estendido 
                if (vctx.tipo().tipo_estendido() != null) {
                    boolean isPointer = vctx.tipo().tipo_estendido().pointer != null;
                    // tipo_estendido -> tipo_basico_ident -> tipo_basico -> 'literal' | 'inteiro' | 'real' | 'logico'
                    if (vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                        String tipoIdent = vctx.tipo().tipo_estendido().tipo_basico_ident().tipo_basico().getText();
                        // Declara os identificadores dentro da struct
                        for (LaParser.IdentificadorContext ictx : vctx.identificador()) {
                            if (subTabela.existe(ictx.getText()) != null) {
                                LaSemanticoUtils.adicionarErroSemantico(ictx.getStart(), "identificador " + ictx.getText() + " ja declarado anteriormente");
                            } else {
                                switch (tipoIdent) {
                                    case "literal" ->
                                        codigoC.append("char ").append(ictx.getText()).append("[80];\n");
                                    case "inteiro", "logico" ->
                                        codigoC.append("int ").append(ictx.getText()).append(";\n");
                                    case "real" ->
                                        codigoC.append("float ").append(ictx.getText()).append(";\n");
                                }
                                subTabela.inserir(ictx.getText(), tipoIdent, isPointer);
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
            codigoC.append("} ").append(nomeRegistro).append(";\n");
            escoposAninhados.obterEscopoAtual().inserir(nomeRegistro, "registro", nomeRegistro, subTabela);
        }

        return null;
    }

    @Override
    public Void visitCmdLeia(LaParser.CmdLeiaContext ctx) {
        // Leitura com gets(string)/scanf(int|float)
        // Resgata o tipo do identificador na tabela de simbolos
        for (LaParser.IdentificadorContext ictx : ctx.identificador()) {
            String ident = ictx.ident1.getText();
            String tipoIdent = escoposAninhados.obterEscopoAtual().tipo(ident);
            switch (tipoIdent) {
                case "literal" ->
                    codigoC.append("gets(").append(ident).append(");\n");
                case "inteiro", "logico" ->
                    codigoC.append("scanf(\"%d\", &").append(ident).append(");\n");
                case "real" ->
                    codigoC.append("scanf(\"%f\", &").append(ident).append(");\n");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdEscreva(LaParser.CmdEscrevaContext ctx) {
        // Escrita com printf para cada tipo
        // Resgata o tipo do identificador da tabela de simbolos
        codigoC.append("printf(\"");
        for (LaParser.ExpressaoContext ectx : ctx.expressao()) {
            String tipo = VerificaTipo.Expressao(ectx, escoposAninhados);

            switch (tipo) {
                case "literal" ->
                    codigoC.append("%s");
                case "inteiro", "logico" ->
                    codigoC.append("%d");
                case "real" ->
                    codigoC.append("%f");
            }
        }
        codigoC.append("\",");
        for (int i = 0; i < ctx.expressao().size(); i++) {
            LaParser.ExpressaoContext exp = ctx.expressao(i);
            codigoC.append(exp.getText());
            if (i != ctx.expressao().size() - 1) {
                codigoC.append(",");
            }
        }
        codigoC.append(");\n");

        return null;
    }

    @Override
    public Void visitCmdAtribuicao(LaParser.CmdAtribuicaoContext ctx) {
        // Verifica se identificador existe na tabela de simbolos
        // Lado esquerdo da atribuição
        boolean isPointer = ctx.pointer != null;
        boolean existeIdent = existeIdentificador(ctx.identificador());

        if (existeIdent) {
            // Identificador que recebe valor de expressao
            String ident = ctx.identificador().ident1.getText();
            String tipoIdent = escoposAninhados.obterEscopoAtual().tipo(ident);
            // expressão que será atribuida
            String exp = ctx.expressao().getText();
            String tipoExp = VerificaTipo.Expressao(ctx.expressao(), escoposAninhados);
            // Faz a conversão de tipos i.e. "^inteiro" -> "inteiro"
            if(tipoExp.startsWith("^")){
                tipoExp = tipoExp.substring(1);
            }
            // Se identificador for do tipo registro
            if (tipoIdent.equals("registro")) {
                // Resgata a subtabela com suas variaveis
                TabelaDeSimbolos subTabelaDeSimbolos = escoposAninhados.obterEscopoAtual().subTabela(ident);
                // Verifica tipo do identificador dentro do registro
                String tipoVar = subTabelaDeSimbolos.tipo(ctx.identificador().IDENT(1).getText());
                // 'literal' usando strcpy para string
                switch (tipoVar) {
                    case "literal" ->
                        codigoC.append("strcpy(").append(ctx.identificador().getText()).append(", ").append(exp).append(");\n");
                    default ->
                        codigoC.append(ctx.identificador().getText()).append("=").append(exp).append(";\n");
                }
            // 'literal' usando strcpy para string 
            } else if (tipoIdent.equals(tipoExp)) {
                switch (tipoIdent) {
                    case "literal" ->
                        codigoC.append("strcpy(").append((isPointer) ? "*" : "").append(ctx.identificador().getText()).append(", ").append(exp).append(");\n");
                    default ->
                        codigoC.append((isPointer) ? "*" : "").append(ctx.identificador().getText()).append("=").append(exp).append(";\n");
                }
            }

        }
        return null;
    }

    @Override
    public Void visitCmdSe(LaParser.CmdSeContext ctx) {
        // CmdSe como if 
        // Gera o if com parametros
        codigoC.append("if (");
        visitExpressao(ctx.expressao());
        codigoC.append(") {\n");
        // Visita e gera os comandos dentro do corpo
        for (LaParser.CmdContext cmd : ctx.ifCmd) {
            visitCmd(cmd);
        }
        codigoC.append("}");
        // Caso existe else
        // Gera o else com os comandos 
        if (ctx.SENAO() != null) {
            codigoC.append("else {");
            for (LaParser.CmdContext cmd : ctx.elseCmd) {
                visitCmd(cmd);
            }
            codigoC.append("}");
        }
        return null;
    }

    @Override
    public Void visitExpressao(LaParser.ExpressaoContext ctx) {
        // Traduz simbolos da expressao da linguagem LA para linguagem C 
        String exp = ctx.getText().replaceAll("<>", "!=").replaceAll(" e ", "&&").replaceAll(" ou ", "||");
        String expSaida = "";
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '=' && exp.charAt(i - 1) != '<' && exp.charAt(i - 1) != '>') {
                expSaida += "==";
            } else {
                expSaida += exp.charAt(i);
            }
        }
        codigoC.append(expSaida);
        return super.visitExpressao(ctx);
    }

    @Override
    public Void visitCmdCaso(LaParser.CmdCasoContext ctx) {
        // CmdCaso como switch
        // Gera o switch
        codigoC.append("switch(").append(ctx.exp_aritmetica().getText()).append(") {");
        // Items da seleção no formato: constantes ':' (cmd)* - pela gramatica
        // Cases do switch com seus comandos 
        visitSelecao(ctx.selecao());
        // comando default do switch
        if (!ctx.cmd().isEmpty()) {
            codigoC.append("default: ");
            for (LaParser.CmdContext cmd : ctx.cmd()) {
                visitCmd(cmd);
            }
        }
        codigoC.append("}\n");
        return null;
    }

    @Override
    public Void visitSelecao(LaParser.SelecaoContext ctx) {
        for (LaParser.Item_selecaoContext item : ctx.item_selecao()) {
            // Constantes com intervalo definido
            // Gera os cases
            if (item.constantes().intervalo.fim != null) {
                int inicio = Integer.parseInt(item.constantes().intervalo.inicio.getText());
                int fim = Integer.parseInt(item.constantes().intervalo.fim.getText());
                for (int i = inicio; i <= fim; i++) {
                    codigoC.append("case ").append(i).append(":\n");
                }
                // Case simples
            } else {
                codigoC.append("case ").append(item.constantes().getText()).append(":\n");
            }
            // Gera comandos dentro do case
            if (!item.cmd().isEmpty()) {
                for (LaParser.CmdContext cmd : item.cmd()) {
                    visitCmd(cmd);
                    codigoC.append("break;\n");
                }
            }
        }
        return null;
    }

    @Override
    public Void visitCmdPara(LaParser.CmdParaContext ctx) {
        // CmdPara como for
        String ident = ctx.IDENT().getText();
        // Inicio/fim da variavel 
        String expInicio = ctx.exp_aritmetica(0).getText();
        String expFim = ctx.exp_aritmetica(1).getText();
        codigoC.append("for(").append(ident).append("=").append(expInicio).append(";").append(ident).append("<=").append(expFim).append(";").append(ident).append("++) {\n");
        // Gera comandos dentro do for
        for (LaParser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        codigoC.append("}\n");
        return null;
    }

    @Override
    public Void visitCmdEnquanto(LaParser.CmdEnquantoContext ctx) {
        // CmdEnquanto como while
        // Traduz simbolos da expressao da linguagem LA para linguagem C
        String exp = ctx.expressao().getText().replaceAll("<>", "!=").replaceAll(" e ", "&&").replaceAll(" ou ", "||");
        codigoC.append("while (").append(exp).append(") {\n");
        // Gera comandos dentro do while
        for (LaParser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        codigoC.append("}\n");
        return null;
    }

    @Override
    public Void visitCmdFaca(LaParser.CmdFacaContext ctx) {
        // CmdFaca como do/while
        // Traduz simbolos da expressao da linguagem LA para linguagem C
        String exp = ctx.expressao().getText().replaceAll("<>", "!=").replaceAll("nao", "!").replaceAll("=", "==");
        codigoC.append("do {\n");
        // Gera comandos dentro do while
        for (LaParser.CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        // Expressao de parada
        codigoC.append("} while (").append(exp).append(");\n");
        return null;
    }

    @Override
    public Void visitCmdChamada(LaParser.CmdChamadaContext ctx) {
        // CmdChamada como chamada de função/procedimento
        // Gera a chamada
        codigoC.append(ctx.IDENT().getText()).append("(");
        // Imprime parametros de entrada se houver
        for (int i = 0; i < ctx.expressao().size(); i++) {
            visitExpressao(ctx.expressao(i));
            if (i != ctx.expressao().size() - 1) {
                codigoC.append(", ");
            }
        }
        codigoC.append(");\n");
        return null;
    }

    @Override
    public Void visitCmdRetorne(LaParser.CmdRetorneContext ctx) {
        // CmdRetorne como return
        codigoC.append("return ");
        visitExpressao(ctx.expressao());
        codigoC.append(";\n");
        return null;
    }

}
