//Declaração de pacote
package br.com.javautil.modelo;

//Declaração da classe
public class GuardadorDeContas {
    //Declaração de atributos 
    Conta[] referencias;
    private int posicao;//Variável auxiliar

    //Declaração de construtor
    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicao = 0;
    }

    //Declaração de metodo getter
    public int getQuantidadeElementos(){
        return this.posicao;
    }
    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }

    //Declaração de método que atribuiá um objeto ao objeto instanciado
    public void adiciona(Conta ref){
        //Atribui o valor da variável ref à variável referencias, onde por ser um array é passado o argumento sendo o valor contido na variável posicao
        this.referencias[this.posicao] = ref;
        //Incrementa 1 ao valor da variável posicao
        this.posicao++;
    }

}
