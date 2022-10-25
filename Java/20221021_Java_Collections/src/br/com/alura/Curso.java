//Declaração de pacote
package br.com.alura;
//Importação de classe externa
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Declaração de classe primária
public class Curso {
    //Declaração de atributos
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    //Declaração de construtor
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }    
    
    //Declaração de métodos getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getInstrutor() {
        return instrutor;
    }
    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);//O método unmodifiableList fará com que seja retornado uma lista que não seja alterável, ou seja, imutável
    }
    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);//O método unmodifiableSet fará com que seja retornado um set que não seja alterável, ou seja, imutável
    }
    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    //Sobrescrita do método toString
    @Override
    public String toString() {
        return "Curso nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas;
    }
    
    //Declaração de método que fará adilção de um a Aula à lista de aulas
    public void adiciona(Aula aula){
        //Evocação de método que fará a adição de elemento à lista aulas
        this.aulas.add(aula);
    }
    
    //Declaração de método que retornará um int sendo o total da somatória dos atributos tempo dos elementos do objeto
    public int getTempoTotal(){
        //Decalração de variável e inicialização de valor
        int tempoTotal = 0;
        //Template foreach que iterará o atributo aulas via variável temporária aula do tipo Aula
        for (Aula aula : aulas) {
            //Incremento do valor de retorno ao valor da variável tempoTotal
            tempoTotal += aula.getTempo();
        }
        //Retorno do valor da variável tempoTotal
        return tempoTotal;
    }

    //Declaração de método que recebe um objeto Aluno e inclui como elemento do objeto alunos
    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
