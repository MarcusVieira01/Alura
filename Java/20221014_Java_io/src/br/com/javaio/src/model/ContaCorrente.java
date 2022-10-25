<<<<<<< HEAD
//Declaração de pacote
package br.com.javaio.src.model;
//Declaração de classe primária
public class ContaCorrente implements java.io.Serializable{
    //Declaração de atributos privados
    //private transient Cliente titular; //COMENTADO PARA REMOVER A DEMONSTRAÇÂO DA NÃO SERIALIZAÇÃO DESSE 
    private Cliente titular;
    private int conta;
    private int agencia;
    private double saldo;
    private static final long serialVersionUID = 2L;

    //Declaração de contrutor não padrão
    public ContaCorrente(int conta, int agencia){
        this.conta = conta;
        this.agencia = agencia;
    }

    //Declaração de métodos Setter e Getter
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Sobreescrita do método toString
    @Override
    public String toString() {
        return "ContaCorrente [titular=" + titular + ", conta=" + conta + ", agencia=" + agencia + ", saldo=" + saldo
                + "]";
    }

    //
    public void deposita(double valor){
        this.setSaldo(valor + getSaldo());
        System.out.println("Foi depositado R$" + valor);
    }

}
=======
//Declaração de pacote
package br.com.javaio.src.model;
//Declaração de classe primária
public class ContaCorrente implements java.io.Serializable{
    //Declaração de atributos privados
    //private transient Cliente titular; //COMENTADO PARA REMOVER A DEMONSTRAÇÂO DA NÃO SERIALIZAÇÃO DESSE ATRIBUTO
    private Cliente titular;
    private int conta;
    private int agencia;
    private double saldo;
    private static final long serialVersionUID = 2L;

    //Declaração de contrutor não padrão
    public ContaCorrente(int conta, int agencia){
        this.conta = conta;
        this.agencia = agencia;
    }

    //Declaração de métodos Setter e Getter
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Sobreescrita do método toString
    @Override
    public String toString() {
        return "ContaCorrente [titular=" + titular + ", conta=" + conta + ", agencia=" + agencia + ", saldo=" + saldo
                + "]";
    }

    //
    public void deposita(double valor){
        this.setSaldo(valor + getSaldo());
        System.out.println("Foi depositado R$" + valor);
    }

}
>>>>>>> 1ab255a6a20714b1af0144289e7191c52d8025a5
