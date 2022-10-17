//Declaração de pacote
package br.com.javautil.teste;

//Declaração de classe
public class TesteArrayPrimitivo {
    //Declaração de método main
    public static void main(String[] args) {
        //Declaração de variáveis e atribuição de valor inicial
        int idade1 = 29;
        int idade2 = 19;
        int idade3 = 49;
        int idade4 = 59;
        int idade5 = 39;

        //Instanciamento de um array
        int idade[] = new int[5];

        //Atribuição de valor para cada element do array
        idade[0] = idade1;
        idade[1] = idade2;
        idade[2] = idade3;
        idade[3] = idade4;
        idade[4] = idade5;

        //Exibição dos elementos do array
        System.out.print(idade[0] + " ");
        System.out.print(idade[1] + " ");
        System.out.print(idade[2] + " ");
        System.out.print(idade[3] + " ");
        System.out.println(idade[4] + " ");
        System.out.println("O tamanho do array e: " + idade.length);

        //laço for para varredura do array
        for(int i = 0; i < idade.length; i++){
            System.out.println("O elemento " + i + " do array e: " + idade[i]);
        }
    }
}
