public enum Prioridade {
    //Declaração dos nomes dos objetos e o conteúdo deles
    MIN(1),NORMAL(5),MAX(10);

    //Declaração de atributo privado
    private int valor;

    //Declaração de construtor
    Prioridade(int valor){
        this.valor = valor;
    }

    //Declaração de método getter
    public int getValor(){
        return this.valor;
    }
}
