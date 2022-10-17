package br.com.Java_lang;

public class TesteString {
    public static void main(String[] args) {
    //Declaração de variável e atribuiçao de valor inicial
    String nome = "Alura";//Boa prática
    //String nome = new String("Alura");//Má prática
    //Exibição do valor da referência nome
    System.out.println(nome);
    //Evocação de método que alterará a letra A para a, no objeto contido na referência nome
    nome.replace("A", "a");//Falha na modificação de nome pois não está sendo atribuído em outra referência
    //Exibição de resultado
    System.out.println(nome);
    //Exibição dentro do método de println, que ocasionará em modificação de conteúdo. Essa modificação ocorre apenas pois o que é exibido em println é uma nova string
    System.out.println(nome.replace("A", "a"));
    }
}
