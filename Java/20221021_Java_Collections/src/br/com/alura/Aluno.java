//Declaração de pacote
package br.com.alura;
//Declaração de classe primária
public class Aluno {
    //Declaração de atributos
    private String nome;
    private int matrícula;

    //Declaração de construtor
    public Aluno(String nome, int matrícula) {
        this.nome = nome;
        this.matrícula = matrícula;
    }

    //Sobreescrita do método toString()
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matrícula=" + matrícula + "]";
    }
}
