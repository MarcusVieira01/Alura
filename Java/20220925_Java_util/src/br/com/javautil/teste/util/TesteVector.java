//Declaração do pacote
package br.com.javautil.teste.util;

//Importação de pacotes externos
import java.util.List;
import java.util.Vector;

import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;

//Declaração da classe principal
public class TesteVector {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciação de um objeto via construtor e armazenada sua referência na variável lista, do tipo ArrayList
        List<Conta> lista = new Vector<Conta>();
        //Instanciação de objetos via construtor e armazenadas suas referências nas variáveis cc1 e cc2, do tipo ArrayList
        Conta cc1 = new ContaCorrente(22, 111);
        Conta cc2 = new ContaCorrente(22, 222);
        Conta cc3 = new ContaCorrente(22, 222);
        //Inclusão das referências dentro do objeto referenciado em listas
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        //Uso do método .contains(arg) para verificar se o valor do argumento consta dentro da lista e atribuição do valor de retorno
        Boolean contem = lista.contains(cc3);
        //Exibição do conteúdo de contem
        System.out.println("Existe o valor? " + contem);
        //Comparação == e via equals()
        Boolean comparsion = cc2 == cc3;
        System.out.println("São == cc2 e cc3? " + comparsion);
        Boolean equals = cc2.equals(cc3);
        System.out.println("São equals cc2 e cc3? " + equals);
        //Forma mais nova e menos verborrágica de iterar uma lista, chamada for each
        for(Conta oRef : lista){
            System.out.println(oRef);
        }
    }
}
