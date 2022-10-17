//Declaração de pacote
package br.com.javautil.teste;

//Importação de classes externas
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;
import br.com.javautil.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    //Declaração de método main
    public static void main(String[] args) {
        //Declaração de array que armazenará 5 referências de objetos, com declaração de tipo genérico, ou seja, com a superclasse
        /*Podemos gerar referências genéricas declarando o tipo como a superclasse Object, porém para utilizar os métodos das classes Conta, 
        ContaCorrente ou ContaPoupança, precisamos fazer um cast, na evocação do método, para uma classe mais especializada*/
        Conta[] contas = new Conta[5];

        //Instanciamento de objetos e armazenamento de sua referência nas variáveis
        ContaCorrente cc1 = new ContaCorrente(111, 1111);
        ContaPoupanca cc2 = new ContaPoupanca(111, 22220);
        ContaCorrente cc3 = new ContaCorrente(111, 3333);
        ContaPoupanca cc4 = new ContaPoupanca(111, 44440);
        ContaCorrente cc5 = new ContaCorrente(111, 4444);

        //Atribuição do valor da referência aos elementos do array
        contas[0] = cc1;
        contas[1] = cc2;
        contas[2] = cc3;
        contas[3] = cc4;
        contas[4] = cc5;

        //Exibição dos valores de retorno dos métodos getNumero e toString dos elementos do array
        System.out.println("Numero da conta: " + contas[0].getNumero());
        System.out.println("Numero da conta: " + contas[1].getNumero());
        System.out.println("Numero da conta: " + contas[2].getNumero());
        System.out.println("Numero da conta: " + contas[3].getNumero());
        System.out.println("Numero da conta: " + contas[4].getNumero());
        System.out.println(contas[0].toString());
        System.out.println(contas[1].toString());
        System.out.println(contas[2].toString());
        System.out.println(contas[3].toString());
        System.out.println(contas[4].toString());
    }
}
