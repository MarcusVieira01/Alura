public class Conta {
    //Declaração de atributos com seus respectivos tipos
    private static int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;//Declaração do atributo que será do tipo de uma Classe, gerando associação entre classes e tipode atributo como referência

    //Declaração de construtor
    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        //
        total++;
        //
        System.out.println("Temos " + total + " contas abertas!");
    }

    //Declaração de método público, que incrementará um valor ao atributo saldo
    public void deposita(double valor){
        //Referencia via this ao objeto instanciado e atribuição do valor de resultado da expressão matemática
        this.saldo += valor;
    }
    /*Declaração de método público que caso o saldo do objeto instanciado possua valor maior ou igual ao valor de saque, retorna true e diminui esse valor do saldo. 
      Caso false, retorna false
    */
    public boolean saca(double valor){
        //Condicional que validará qual booleano retornar
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }        
    }
    /*Declaração de método público que fará a transferência do valor do argumento da conta que evocou o método para um objeto do tipo Conta de destino. 
      Será retornado true e realizada a transferência via validação de condicional. Caso false serpa retornado false
    */
    public boolean transfere(double valor, Conta destino){
        //Condicional que realiza a transferência caso true e retorno true. Caso false, retorna false
        if(this.saldo >= valor){
            //Evocação de método anteriormente declarado para otimizar a codificação e termos uma separação de responsabilidades
            this.saca(valor);//Uso do this pois o saque deve ocorrer do objeto que evoca o método
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }

    //Declaração de método getter devido ao encapsulamento dos atributos
    public double getSaldo(){
        return this.saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public static int getTotal(){
        return Conta.total;
    }

    //Declaração de método setter devido ao encapsulamento dos atributos
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}
