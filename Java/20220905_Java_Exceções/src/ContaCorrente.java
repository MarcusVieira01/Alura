public class ContaCorrente extends Conta implements Tributavel{
    //Declaração de construtor específico da classe
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    //Sobrecarga do método saca, herdado da classe conta. Como evoca um método que possui exceção checkd, há necessidade de incluir a declaração de lançamento de exceção
    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        //Declaração de variável e atribuição do valor de resultado da expressão matemática
        double valorSacar = valor + 0.2;
        //Evocação do método .saca(arg) da superclasse Conta, com inserção da variável valorSacar como argumento
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
