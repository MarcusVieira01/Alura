//Declaração do pacote
package br.com.javautil.teste.util;

//Importação de pacotes externos
import java.util.ArrayList;
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;

//Declaração da classe principal
public class TesteArrayList {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciação de um objeto via construtor e armazenada sua referência na variável lista, do tipo ArrayList
        ArrayList<Conta> lista = new ArrayList<Conta>();
        //Instanciação de objetos via construtor e armazenadas suas referências nas variáveis cc1 e cc2, do tipo ArrayList
        Conta cc1 = new ContaCorrente(22, 111);
        Conta cc2 = new ContaCorrente(22, 222);
        Conta cc3 = new ContaCorrente(22, 333);
        //Inclusão das referências dentro do objeto referenciado em listas
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        //Exibição do tamanho do array
        System.out.println("Tamanho " + lista.size());
        //Atribuição de um elemento da lista em varável, a partir do índice e usando cast do elemento específico para Conta assim garantindo que seja atribuído o elemento de tipo correto
        Conta atribuido = lista.get(0);
        //Exibição do valor atribuído à variável atribuido
        System.out.println(atribuido);
        //Remoção de um elemento da lista
        lista.remove(2);
        //Exibição do tamanho do array
        System.out.println("Tamanho " + lista.size());
        //Forma mais nova e menos verborrágica de iterar uma lista, chamada for each
        for(Conta oRef : lista){
            System.out.println(oRef);
        }
    }
}
