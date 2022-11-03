//Declaração de pacote
package br.com.alura.tdd;
//Declaração de classe
public class TesteCalculadora {
    public static void main(String[] args) {
        //Instanciação de objeto via construtor Calculadora() e atribuição de sua referênciana variável calc
        Calculadora calc = new Calculadora();

        //Declaração de variável e atribuição do valor de retorno do método .somar()
        int soma = calc.somar(3, 7);

        //Exibição do valor da variável soma
        System.out.println(soma);
    }
}
