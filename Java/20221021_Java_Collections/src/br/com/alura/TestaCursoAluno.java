//Declaração de pacote
package br.com.alura;
//Declaração de classe primária
public class TestaCursoAluno {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciamento de novo objeto da classe Curso via construtor e atribuição de sua referência à variável do tipo Curso
        Curso javaColecao = new Curso("Dominando coleções", "Paulo Silveira");

        //Evocação do método .adiciona(arg) que adicionará um elemento à List aulas, com seu argumento sendo uma nova instancia da classe Aula via construtor
        javaColecao.adiciona(new Aula("JavaUtil", 15));
        javaColecao.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecao.adiciona(new Aula("Modelando com coleções", 18));

        //Instanciamento de objetos via construtor Aluno coma tribuição de suas referências às variáveis declaradas de tipo Aluno
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 34673);
        Aluno a3 = new Aluno("Maurício Aniche", 346747);

        //Evocação de método que incluirá o objeto de referência passada via variável aos elementos do objeto evocado 
        javaColecao.matricula(a1);
        javaColecao.matricula(a2);
        javaColecao.matricula(a3);

        //Exibe mensagem no console
        System.out.println("Alunos matriculados: ");

        //Via template foreach e uso de lambda, será iterado o objetojavaColecao e exibido cada elemento de retorno do método .getAlunos()
        javaColecao.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        //Exibição do valor de retorno do método.estaMatriculado(obj) que retornará um boleano para cada caso, se consta no objeto evocado ou não
        System.out.println("O aluno a1 está matriculado? " + javaColecao.estaMatriculado(a1));

        //Instanciação de objeto via construtor Aluno(args) e atribuição de sua referência à variável declarada do tipo aluno
        Aluno turini = new Aluno("Rodrigo Turini", 34672);

        //Exibição do valor de retorno do método.estaMatriculado(obj) que retornará um boleano para cada caso, se consta no objeto evocado ou não
        System.out.println("O turini está matriculado?" + javaColecao.estaMatriculado(turini));

        //Exibição do retorno do método .equals()
        System.out.println("a1 equals turini?" + a1.equals(turini));
    }
}
