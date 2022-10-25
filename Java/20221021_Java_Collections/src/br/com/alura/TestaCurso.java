//Declaração de pacote
package br.com.alura;

import java.util.List;

//Declaração de classe primária
public class TestaCurso {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciamento de novo objeto da classe Curso via construtor e atribuição de sua referência à variável do tipo Curso
        Curso javaColec = new Curso("Dominando coleções", "Paulo Silveira");
        
        //Evocação do método getter .getAulas() e atribuição do retorno à variável aulas, do tipo List e tipo de dado Aula
        List<Aula> aulas = javaColec.getAulas();

        //Exibição do valor da variável aulas
        System.out.println(aulas);
        
        //COMENTADO POIS COMO O RETORNO DE .getAula() É UNMODIFIEDLIST NÃO SE USA MAIS O MÉTODO EXTERNO .add()
        //Evocação do método .add(arg) que adicionará um elemento à List aulas, com seu argumento sendo uma nova instancia da classe Aula via construtor
        //aulas.add(new Aula("Trabalhando com ArrayList", 21)); 

        //Exibição do valor da variável aulas
        // System.out.println(aulas);

        //Evocação do método .adiciona(arg) que adicionará um elemento à List aulas, com seu argumento sendo uma nova instancia da classe Aula via construtor
        javaColec.adiciona(new Aula("JavaUtil", 15));
        javaColec.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColec.adiciona(new Aula("Modelando com coleções", 18));

        //Exibição do valor da variável aulas
        System.out.println(aulas);
    }
}
