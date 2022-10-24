//Declaração de pacote
package br.com.alura;

//Importação de classe externa
import java.util.ArrayList;
import java.util.Collections;

//Declaração da classe primária
public class TestandoListas {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variáveis e atribuição dos valores de inicialização
        String aula01 = "Conhecendo mais de listas";
        String aula02 = "Usando a classe Colections";
        String aula03 = "Trabalhando com cursos e sets";
        String aula04 = "Modelando a classe aula";

        //Declaração de variável do tipo ArrayList com dados do tipo String e atribuição da referência do objeto instanciado usando o construtor ArrayList()
        ArrayList<String> aulas = new ArrayList<>();

        //Inclusão de elementos no objeto da referência contida na variável aulas, via método .add(arg)
        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);
        aulas.add(aula04);

        //Usando o método .sort(colection) da classe auxiliar Collections
        Collections.sort(aulas);

        //Exibição do vaor atribuído à variável aulas
        System.out.println(aulas);

        //Template de um froeach que iterará a coleção aulas e fará a exibição de cada elemento
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //Usando o método .forEach(action) será iterada a coleção aulas e fará a exibição de cada elemento onde o action será um Consumer implementado por uma Lambda
        aulas.forEach(aula -> {
            System.out.println("Aula com Lambda " + aula);
        });

        //Remoção do elemento 0 via método remove(index)
        aulas.remove(3);

        //Exibição do vaor atribuído à variável aulas
        System.out.println(aulas);

        //Usando for normal para iterar a coleção e exibir seus elementos, mas desta vez usando o método .get(índice) da coleção
        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula " + aulas.get(i));
        }
    }
}
