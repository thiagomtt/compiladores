package br.ufscar.dc.compiladores.geradornotafiscal;

import java.util.HashMap;

public class BancoDeDados {

    private final HashMap<String, EntradaBancoDeDados> bancoDeDados;

    public BancoDeDados() {
        this.bancoDeDados = new HashMap<>();
    }
    
    public HashMap<String, EntradaBancoDeDados> getBanco(){
        return this.bancoDeDados;
    } 

    // Cliente
    public void inserir(String cpfCnpj, String razaoSocial, String email,
            String logradouro, int numero, String bairro, String estado,
            String cep, String codigoCidade, String descricaoCidade) {

        EntradaBancoDeDados ebd = new EntradaBancoDeDados();
        ebd.cpfCnpj = cpfCnpj;
        ebd.razaoSocial = razaoSocial;
        ebd.email = email;
        ebd.logradouro = logradouro;
        ebd.numero = numero;
        ebd.bairro = bairro;
        ebd.estado = estado;
        ebd.cep = cep;
        ebd.codigoCidade = codigoCidade;
        ebd.descricaoCidade = descricaoCidade;
        bancoDeDados.put(cpfCnpj, ebd);
    }
    
    // Produto
    public void inserir(String produto, int codigo, String descricao, float valor, int quantidade){
        EntradaBancoDeDados ebd = new EntradaBancoDeDados();
        ebd.produto = produto;
        ebd.codigoProduto = codigo;
        ebd.descricaoProduto = descricao;
        ebd.valorProduto = valor;
        ebd.quantidade = quantidade;
        bancoDeDados.put(produto, ebd);
    }
    
    
    // Clientes
    public EntradaBancoDeDados existe(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj);
    }
    
    public String getRazaoSocial(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).razaoSocial;
    }
    
    public String getEmail(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).email;
    }
    
    public String getLogradouro(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).logradouro;
    }
    
    public int getNumero(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).numero;
    }
    
    public String getBairro(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).bairro;
    }
    
    public String getEstado(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).estado;
    }
    
    public String getCep(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).cep;
    }
    
    public String getCodigoCidade(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).codigoCidade;
    }
    
    public String getDescricaoCidade(String cpfCnpj){
        return bancoDeDados.get(cpfCnpj).descricaoCidade;
    }
    
    // Produtos
    public int getCodigoProduto(String produto){
        return bancoDeDados.get(produto).codigoProduto;
    }
    
    public String getDescricaoProduto(String produto){
        return bancoDeDados.get(produto).descricaoProduto;
    }
    
    public float getValorProduto(String produto){
        return bancoDeDados.get(produto).valorProduto;
    }
    
    public int getQuantidadeProduto(String produto){
        return bancoDeDados.get(produto).quantidade;
    }
    
    public void setQuantidadeProduto(String produto, int quantidade){
        bancoDeDados.get(produto).quantidade = quantidade;
    }
    
}
