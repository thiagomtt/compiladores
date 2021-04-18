package br.ufscar.dc.compiladores.geradornotafiscal;

import java.util.HashMap;

public class TabelaDeSimbolos {
    
    private final HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    public TabelaDeSimbolos(){
        this.tabelaDeSimbolos = new HashMap<>();
    }
    
    public void inserir(String nome, float valor, String descricao){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.valor = valor;
        etds.descricao = descricao;
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public EntradaTabelaDeSimbolos existe(String nome){
        return tabelaDeSimbolos.get(nome);
    }
    
}
