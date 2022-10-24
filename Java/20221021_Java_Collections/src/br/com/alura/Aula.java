//Declaração de pacote
package br.com.alura;
//Declaração de classe primária
public class Aula implements Comparable<Aula>{
    //Declaração de atributos
    private String titulo;
    private int tempo;

    //Declaração de contrutores
    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    //Declaraçao de métodos getter e setter
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    //Sobreescrita do método toString
    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", " + this.tempo + " minutos.";
    }

    //Sobreescrita de implementação do método da interface Comparable
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);//Redução das condições para o retorno do método compareTo()
    }
}
