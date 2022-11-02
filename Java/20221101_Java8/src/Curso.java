//Declaração de classe primária
public class Curso {
    //Declaração de atributos privados
    private String nome;
    private int alunos;

    //Declaração de construtor
    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    //Declaração de métodos getter
    public String getNome() {
        return nome;
    }
    public int getAlunos() {
        return alunos;
    }
    
    //Sobreescrita do método toString
    @Override
    public String toString() {
        return "Curso [nome=" + nome + ", alunos=" + alunos + "]";
    }  
}
