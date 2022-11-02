//Importação de classes externas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Declaração de classe primária
public class TesteCurso {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variável e atribuição do objeto instanciado via constrututor ArrayList com elementos do tipo Curso
        List<Curso> cursos = new ArrayList<Curso>();

        //Inclusão de elementos via evocação do método .add e instanciamento de objeto via construtor Cursos(args), passado como parâmetro de .add(arg)
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //Ordenação dos elementos do objeto de referência contida na variável cursos via evocação de método .sort(Comparator), onde o comparator foi passado via evocação do método .comparing da classe Comparator e seu argumento foi passado como um method reference da classe Curso evocando o método getAlunos
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //Evocação do método .forEach(consumer) quue iterará cada elemento do objeto de referência atribuída à variável cursos e evocará o método println da classe System e atributo out, via method reference
        cursos.forEach(System.out::println);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Aninhamento de métodos que, em resumo, fará a filtragem de objetos da classe Curso que possuirem o valor do atributo alunos maior que 100 e serão exibidos. Foi usado lambdas e method reference além dos métodos .stream(), que manipula um fluxo de dados dos objetos, e o método .filter() que fará a segregação conforme seu critério. Usado o método .forEach(consumer) que fará a iteração de cada elemento filtrado e exibirá
        cursos.stream().filter(curso -> curso.getAlunos() >= 100).forEach(System.out::println);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Aninhamento de métodos que, em resumo, fará a filtragem de objetos da classe Curso que possuirem o valor do atributo alunos maior que 100 e serão exibidos apenas os valores da variável alunos que sobrarem da filtragem. Foi usado lambdas e method reference além dos métodos .stream(), que manipula um fluxo de dados dos objetos, e o método .filter() que fará a segregação conforme seu critério. Usado o método .map(function) que mapeará os objetos com uma função declarada via metod reference, onde serpa capturado o valor do atributo aluno, e usado o método .forEach(consumer) que fará a iteração de cada elemento filtrado e exibirá
        cursos.stream().filter(curso -> curso.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Aninhamento de métodos que, em resumo, fará a filtragem de objetos da classe Curso que possuirem o valor do atributo alunos maior que 100, será mapeado para int cada valor do atributo aluno e somado via método .sum()
        int soma = cursos.stream().filter(curso -> curso.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();

        //Exibição concatenada do valor da variável soma
        System.out.println("O total de alunos é " + soma);
    }
}
