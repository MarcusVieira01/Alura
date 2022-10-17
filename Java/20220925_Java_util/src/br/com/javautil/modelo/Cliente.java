package br.com.javautil.modelo;

public class Cliente implements Autenticavel{
    //Declaração de atributos
    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil util;

    //Declaração de construtor padrão com intanciação de objeto advindo da classe AutenticacaoUtil, com sua referencia armazenda na variável util. Essa variável foi incluída como atributo e autoreferenciada com a keyword this
    public Cliente(){
        this.util = new AutenticacaoUtil();
    }

    //Declaração de métodos getter e setter devido ao encapsulamento dos atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    //Implementação dos métodos abstratos da interface Autenticavel, sendo que há necessidade de sobrecarga dos métodos
    @Override
    public void setSenha(int senha) {
        // this.senha = senha; // COMENTADO PARA QUE SEJA CHAMADA A PORÇÃO DE CÓDIGO DOOBJETO UTIL
        this.util.setSenha(senha);        
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.util.autenticacao(senha);
        
        // COMENTADO PARA QUE SEJA CHAMADA A PORÇÃO DE CÓDIGO DOOBJETO UTIL
        // if(this.senha == senha){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}
