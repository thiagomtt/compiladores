package br.ufscar.dc.compiladores.la.semantico;

import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {

    private final HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos() {
        this.tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String nome, String tipo, boolean pointer) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.tipo = tipo;
        etds.pointer = pointer;
        tabelaDeSimbolos.put(nome, etds);
    }

    public void inserir(String nome, String tipo, String valor) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.tipo = tipo;
        etds.valor = valor;
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, String tipo, String nomeRegistro, TabelaDeSimbolos subTabela){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.tipo = tipo;
        etds.nomeRegistro = nomeRegistro;
        etds.subTabela = subTabela;
        tabelaDeSimbolos.put(nome, etds);
    }
    
    public void inserir(String nome, String tipo, String tipoEntrada, List<String> parametros){
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.nome = nome;
        etds.tipo = tipo;
        etds.tipoEntrada = tipoEntrada;
        etds.parametros = parametros;
        tabelaDeSimbolos.put(nome, etds);
    }

    public EntradaTabelaDeSimbolos existe(String nome) {
        return tabelaDeSimbolos.get(nome);
    }
    
    public String tipo(String nome){
        return tabelaDeSimbolos.get(nome).tipo;
    }
    
    public TabelaDeSimbolos subTabela(String nome){
        return tabelaDeSimbolos.get(nome).subTabela;
    }
    
    public boolean isPointer(String nome){
        return tabelaDeSimbolos.get(nome).pointer;
    }
    
    public List<String> parametros(String nome){
        return tabelaDeSimbolos.get(nome).parametros;
    }
    
    public String retorno(String nome){
        return tabelaDeSimbolos.get(nome).tipoEntrada;
    }
    
    public String nomeRegistro(String nome){
        return tabelaDeSimbolos.get(nome).nomeRegistro;
    }

}
