//Declaração de pacote
package br.com.javautil.teste.util;

import java.util.ArrayList;
import java.util.List;

//Declarçaão da classe
public class TesteWrapperParse {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variável e atribuição de valor de inicialização
        int idade = 29;
        //Instanciação de objeto com referência atribuída à variável numeros do tipo List
        List<Integer> numeros = new ArrayList<Integer>();
        //Chamada de método que receberá um primitivo e retornara um objeto a ter sua referência atribuída à variável idadeRef, do tipo Integer
        Integer idadeRef = Integer.valueOf(idade);  //AutoBoxing
        //Evocação de método contido na referência idadeRef com exibição do valor contido em valor
        int valor = idadeRef.intValue();    //Unboxing
        System.out.println(valor);
        //Adição do valor da variável idadeRef na lista numeros
        numeros.add(idadeRef);

        //Declaração de variável e atribuição de seu valor inicial
        String s = "10";
        //Declaração de variável do tipo wrapper Integer e atribuição do valor de retorno de conversão de string para Integer
        Integer numero = Integer.valueOf(s);
        //Exibição do tipo e conteúdo da variável numero
        System.out.println(numero.getClass().getSimpleName());
        System.out.println(numero);
        //Declaração de variável do tipo primitiva int e atribuição do valor de retorno de conversão de string para int via método parseInt(arg)
        int numero2 = Integer.parseInt(s);
        //Exibição do conteúdo da variável numero2
        System.out.println(numero2);
    }
}
