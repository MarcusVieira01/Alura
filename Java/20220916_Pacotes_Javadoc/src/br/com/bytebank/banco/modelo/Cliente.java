//Declaração do pacote
package br.com.bytebank.banco.modelo;

/**
 * Esta classe representa a abstração de um cliente, com atributos definidos nome, cpf e profissão. Não possui métodos e o construtor é padrão, sem parâmetros
 * @author Marcus Vieira
 * @version 0.1
 */

public class Cliente /*implements Autenticavel*/    /*COMENTADO PARA FUNCIONAMENTO DENTRO DA AULA*/{
    //Declaração de atributos
    private String nome;
    private String cpf;
    private String profissao;
    //private AutenticacaoUtil util;//COMENTADO PARA FUNCIONAMENTO DENTRO DA AULA

    //COMENTADO PARA FUNCIONAMENTO DENTRO DA AULA
    //Declaração de construtor padrão com intanciação de objeto advindo da classe AutenticacaoUtil, com sua referencia armazenda na variável util. Essa variável foi incluída como atributo e autoreferenciada com a keyword this
    // public Cliente(){
    //     this.util = new AutenticacaoUtil();
    // }

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
    /**
     * Método que popula o atributo profissao, que deve ser uma string
     * @param profissao
     * @return void
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    //COMENTADO PARA FUNCIONAMENTO DENTRO DA AULA
    // //Implementação dos métodos abstratos da interface Autenticavel, sendo que há necessidade de sobrecarga dos métodos
    // @Override
    // public void setSenha(int senha) {
    //     // this.senha = senha; // COMENTADO PARA QUE SEJA CHAMADA A PORÇÃO DE CÓDIGO DOOBJETO UTIL
    //     this.util.setSenha(senha);        
    // }

    // @Override
    // public boolean autenticacao(int senha) {
    //     return this.util.autenticacao(senha);
        
    //     // COMENTADO PARA QUE SEJA CHAMADA A PORÇÃO DE CÓDIGO DOOBJETO UTIL
    //     // if(this.senha == senha){
    //     //     return true;
    //     // }else{
    //     //     return false;
    //     // }
    // }
}
