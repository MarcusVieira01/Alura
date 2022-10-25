//Declaração de pacote
package br.com.alura;

//Importação de classes externas
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Declaração de classe primária
public class TestaCurso2 {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciamento de novo objeto da classe Curso via construtor e atribuição de sua referência à variável do tipo Curso
        Curso javaColecoes = new Curso("Dominando coleções", "Paulo Silveira");
        
        //Evocação do método .adiciona(arg) que adicionará um elemento à List aulas, com seu argumento sendo uma nova instancia da classe Aula via construtor
        javaColecoes.adiciona(new Aula("JavaUtil", 15));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

        //Evocação do método getter .getAulas() e atribuição do retorno à variável aulas, do tipo List e tipo de dado Aula
        List<Aula> aulasImutavel = javaColecoes.getAulas();

        //Exibição do valor da variável aulas
        System.out.println(aulasImutavel);

        //Instanciação de novo objeto advindo do construtor ArrayList<>(arg) que receberá uma lista imutável e realizara sua construção equivalente, mas mutável. O objeto construído possui referência atribuída a variável do litpo List e dados tipo Aula
        List<Aula> aulas = new ArrayList<>(aulasImutavel);

        //Ordenação via método .sort(obj) da classe Collections, onde o objeto passado deve implementar a interface Comparable e seu método .compareTo()
        Collections.sort(aulas);

        //Exibição do valor da variável aulas
        System.out.println(aulas);

        //Exibição do valor da variável aulas
        System.out.println("Tempo total de aulas: " + javaColecoes.getTempoTotal() + " minutos.");

        //Exibindo o retorno do método .toString()
        System.out.println(javaColecoes);
    }
}
