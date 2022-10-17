public class ControleBonificacao {
    //Declaração de atributo privado
    private double soma;

    //Declaração de método público que receberá um objeto do tipo Funcionario e de referência f, somará o valor de retorno do método getBonificacao() advido dessa classe Funcionario ao valor do atributo soma
    public void registra(Funcionario f){
        //Declaração de variável e atribuição do valor de retorno do método getBonificacao() do objeto gerente, que será passado como parâmetro
        double boni = f.getBonificacao();
        
        //Atribuição do valor de resultado da expressão matemática ao atributo autoreferenciado soma
        this.soma = this.soma + boni;
    }
    
    /*Código comentado para que seja criado acima um método único, evidenciando polimorfismo */
    // //Declaração de método público que receberá um objeto do tipo Gerente e de referência g, somará o valor de retorno do método getBonificacao() advido dessa classe Gerente ao valor do atributo soma
    // public void registraGerente(Gerente g){
    //     //Declaração de variável e atribuição do valor de retorno do método getBonificacao() do objeto gerente, que será passado como parâmetro
    //     double boni = g.getBonificacao();

    //     //Atribuição do valor de resultado da expressão matemática ao atributo autoreferenciado soma
    //     this.soma = this.soma + boni;
    // }

    // //Declaração de método público que receberá um objeto do tipo Funcionario e de referência f, somará o valor de retorno do método getBonificacao() advido dessa classe Funcionario ao valor do atributo soma
    // public void registraEditorVideo(EditorVideo ed){
    //     //Declaração de variável e atribuição do valor de retorno do método getBonificacao() do objeto gerente, que será passado como parâmetro
    //     double boni = ed.getBonificacao();
    
    //     //Atribuição do valor de resultado da expressão matemática ao atributo autoreferenciado soma
    //     this.soma = this.soma + boni;
    // }

    //Método getter manual
    public double getSoma(){
        return this.soma;
    }
}
