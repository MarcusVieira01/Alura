//Declaração de pacote
package br.com.javaio.src.model;
//Declaração de classe primária
public class Cliente implements java.io.Serializable{
    //Declaração de atributos
    private String nome;
    private String cpf;
    private String profissao;
    private static final long serialVersionUID = 1L;//Declaração de variável que fará o versionamento da serialização do objeto

    //Declaração de construtor padrão com intanciação de objeto advindo da classe AutenticacaoUtil, com sua referencia armazenda na variável util. Essa variável foi incluída como atributo e autoreferenciada com a keyword this
    public Cliente(String name, String cpf){
        this.nome = name;
        this.cpf = cpf;
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
    //Sobreescrita co método toString
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profissao=" + profissao + "]";
    }
    
}
