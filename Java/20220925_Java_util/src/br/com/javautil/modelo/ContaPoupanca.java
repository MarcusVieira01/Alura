//Declaração de pacote
package br.com.javautil.modelo;

//Declaração de classe
public class ContaPoupanca extends Conta{
    //Declaração de construtor específico da classe
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    //Implementação de método abstrado herdado que receberá um argumento sendo o valor a ser depositado e incrementará ao valor do atributo saldo do objeto
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    } 
}
