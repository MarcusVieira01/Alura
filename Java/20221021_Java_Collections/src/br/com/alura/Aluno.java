//Declaração de pacote
package br.com.alura;
//Declaração de classe primária
public class Aluno {
    //Declaração de atributos
    private String nome;
    private int matrícula;

    //Declaração de construtor
    public Aluno(String nome, int matrícula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser NULL!");//Tratamento de exceção para inserção null do nome
        }
        this.nome = nome;
        this.matrícula = matrícula;
    }

    //Sobreescrita do método toString()
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matrícula=" + matrícula + "]";
    }

    //Sobreescrita do método equals() com a regra dedicada para a classe
    @Override
    public boolean equals(Object obj) {
        //Declaração de variável e atribuição da referência do objeto
        Aluno outro = (Aluno) obj;
        //Retorno do valor booleano de retorno do método equals
        return this.nome.equals(outro.nome);
    }    

    //Sobrescrita do método hashCode() com a regra dedicada para a classe. Feito de forma simples para ser didático
    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }
}
