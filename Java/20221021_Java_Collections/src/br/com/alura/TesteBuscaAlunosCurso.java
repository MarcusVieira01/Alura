//declaração de pacote
package br.com.alura;
//Declaração de classe primária
public class TesteBuscaAlunosCurso {
    //Declaração de método principal
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

        //Exibição de mensagem
        System.out.println("Qual é o aluno 34673?");

        //Declaração de variável e atribuição do valor de retorno do método buscaMatrícula(arg), onde seu argumento passado é o número da matrícula
        Aluno aluno = javaColecao.buscaMatricula(346731);

        //Exibição do conteúdo da variável aluno
        System.out.println(aluno);
    }
}
