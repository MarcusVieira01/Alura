//Importação de classes externas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        //Exibição de separação
        System.out.println("--------------------------------");

        //Aninhamento de métodos que, em resumo, fará a filtragem de objetos da classe Curso que possuirem o valor do atributo alunos maior que 100, será evocado o método .findAny() que retornará qualquer elemento da filtragem e após será evoado o método .ifPresent(consumer) que se houver um elemento retornado eplo método .findAny(), será executado o consumer
        cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(System.out::println);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Declaração de variável lista onde cada elemento será a referência de um objeto retornado pelo aninhamento dos métodos .filter(predicate), que filtrará os objetos com o valor do atributo alunos maior que 100, e o método .collect(collector) que recebe como argumento o método .toList() da classe Collectors. Esse método captura cada objeto retornado pelo método .filter(predicate) e insere em uma lista. Essa é a variável declarada
        List<Curso> coletado = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

        //Exibição do conteúdo da vaiável coletado
        System.out.println(coletado);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Concatenação de métodos onde .filter(predicate), que filtrará os objetos com o valor do atributo alunos maior que 100, .collect(collecteor) recebe o método da classe Collectos .toMap(key_function, value_function) que recebe dois method reference para gerar a chave-valor do mapa onde seu retorno é atribuído à variável mapaCursoAlunos, declarada como classe Map e tipo String(chave) e Integer(valor)
        Map<String, Integer> mapaCursoAlunos = cursos.stream().filter(c -> c.getAlunos() >= 100)
        .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));

        //Exibição do valor da variável mapaCursoAlunos
        System.out.println(mapaCursoAlunos);

        //Exibição de separação
        System.out.println("--------------------------------");

        //Concatenação de métodos onde .filter(predicate), que filtrará os objetos com o valor do atributo alunos maior que 100, .collect(collecteor) recebe o método da classe Collectos .toMap(key_function, value_function) que recebe dois method reference para gerar a chave-valor do mapa. É evocado o método .forEach(biconsumer) que recebe um biconsumer para a chave e valor além da ação. Ação no caso a exibição concatenada dos valores do par chave-valor nome e aluno
        cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
        .forEach((nome, alunos) -> System.out.println("O curso " + nome + " tem " + alunos + " alunos matriculados"));
        
        //Exibição de separação
        System.out.println("--------------------------------");
    }
}
