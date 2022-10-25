//Declaração de pacote
package br.com.alura;
//Importação de classes externas
import java.util.Collection;
import java.util.HashSet;

//Declaração de classe primária
public class Testealunos {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de objeto via construtor HashSet<>() e de referência atribuída à variável alunos de tipo genérico Collection e dados tipo String
        Collection<String> alunos = new HashSet<>();

        //Inserção de elementos via método .add(arg)
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Maurício Aniche");

        //Uso de método .contains(arg) que retornará um booleano e será atribuído à variável declarada
        boolean alunoContido = alunos.contains("Marcus Vieira");

        //Exibição concatenada do valor da variável alunoContido
        System.out.println("Marcus está na lista de alunos? " + alunoContido);

        //Exibição do objeto de referência contida na variável alunos
        System.out.println(alunos);

        //Uso do template foreach que iterará o objeto alunos via variável temporária aluno e exibirá seu conteúdo
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        //Exibição de separador
        System.out.println("___________________________");

        //Uso de método .forEach(action) com lambda para realizar a mesma ação acima
        alunos.forEach(aluno -> {System.out.println(aluno);});
    }
}
