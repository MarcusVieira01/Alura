
public class ContaCorrente extends Conta implements Tributavel{
    //Declaração de construtor específico da classe
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    //Sobrecarga do método saca, herdado da classe conta
    @Override
    public void saca(double valor){
        //Declaração de variável e atribuição do valor de resultado da expressão matemática
        double valorSacar = valor + 0.2;
        //Retorno do valor boleando de retorno do método evocado
        super.saca(valorSacar);
    }

    //Implementação de método abstrado herdado que receberá um argumento sendo o valor a ser depositado e incrementará ao valor do atributo saldo do objeto
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

    //Implementação do método da interface implementada
    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }    
}
