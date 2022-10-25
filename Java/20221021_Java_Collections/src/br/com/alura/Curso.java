//Declaração de pacote
package br.com.alura;
//Importação de classe externa
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Declaração de classe primária
public class Curso {
    //Declaração de atributos
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

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

    //Declaração de método que fará adilção de um a Aula à lista de aulas
    public void adiciona(Aula aula){
        //Evocação de método que fará a adição de elemento à lista aulas
        this.aulas.add(aula);
    }
}
