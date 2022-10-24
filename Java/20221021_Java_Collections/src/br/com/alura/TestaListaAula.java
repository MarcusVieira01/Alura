//Declaração de pacote
package br.com.alura;
//Importação de classes externas
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Declaração de classe primária
public class TestaListaAula {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciamento de objetos via construtor e com atribuiçção de referências às variáveis declaradas
        Aula a1 = new Aula("Revisitando as arraylists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento entre listas e objetos", 15);

        //Instanciamento de objeto via construtor e atribuição de referência à variável declarada do tipo ArrayList com tipo de dado sendo a classe Aula
        ArrayList<Aula> aulas = new ArrayList<>();

        //Evocação do método .add(obj) advindo da classe ArrayList
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //Exibição do conteúdo do objeto de referência atribuída à variável aulas
        System.out.println(aulas);

        //Evocação do método .sort(obj) advindo da classe Collections, já com o método compareTo() declarado na classe Aula, que dá origem ao objeto de referência contida na variável aulas
        Collections.sort(aulas);

        //Exibição do conteúdo do objeto de referência atribuída à variável aulas
        System.out.println(aulas);

        //Evocação do método .sort() sendo que o segundo argumento é um comparator, com evocação do método .comparing(). Esse método recebe um extractor, que será o nome do método que será evocado para extrair o valor para que seja comaprado e retornado para ordenação
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        //Exibição do conteúdo do objeto de referência atribuída à variável aulas
        System.out.println(aulas);

        //Evocação do método oriundo da superclasse Object .sort() que receberá um Comparator como argumento. Possui mesmo efeito de chamar o .sort() da classe Collections
        aulas.sort(Comparator.comparing(Aula::getTempo));

        //Exibição do conteúdo do objeto de referência atribuída à variável aulas
        System.out.println(aulas);
    }
}
