

public class CalculadorImposto{
    //Declaração de atributo privado
    private double totalImposto; 

    //Método que receberá um objeto do tipo Tributável e evocará o seu método getValorImposto(), atribuindo em uma variável
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    //Declaração de método getter para acessar o atributo privado totalImposto
    public double getTotalImposto() {
        return totalImposto;
    }
}
