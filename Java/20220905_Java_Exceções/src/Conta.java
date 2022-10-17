//Declaração de classe abstrata
public abstract class Conta {
    //Declaração de atributos com seus respectivos tipos
    private static int total;
    protected double saldo;//Transformado em protected para uso nas classes herdeiras
    private int agencia;
    private int numero;

    //Declaração de construtor
    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        //
        total++;
        //
        System.out.println("Temos " + total + " contas abertas!");
    }

    //Declaração de método abstrato, que será implementado pelas classes filhas
    public abstract void deposita(double valor);

    //Declaração de método que efetuará o saque da conta instnaciada. Possui tratamento de exceções e como evoca um método que possui exceção checkd, há necessidade de incluir a declaração de lançamento de exceção
    public void saca(double valor)throws SaldoInsuficienteException{
        //COndicional que testará se existe valor do atributo saldo pertinente para realizar a operação. Caso false, atingirá o tratamento de exceção com exibição de mensagem pertinente 
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saque nao ocorreu. Saldo: " + this.saldo + ". Valor a sacar: " + valor);
        }
        //Caso não haja exceção, será decrescentado o conteúdo da variável valor no atributo saldo
        this.saldo -= valor + 0.2;//O valor somado de 0.2 será uma taxa de saque
    }

    //Declaração de método que realizará transferência de valores entre contas, onde a validação de saldos ocorre dentro do método .saca(arg). Método este que possui tratamento de exceção. Como evoca um método que possui exceção checkd, há necessidade de incluir a declaração de lançamento de exceção
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        //Evocação de método que fará um decremento do conteúdo atribuído à variável valor no saldo do objeto de referência contida na variável destino. O método saca possui tratamento de exceção e em caso de ocorrÊncia, não executará o depósito
        this.saca(valor);
        //Evocação de método que fará um incremento do conteúdo atribuído à variável valor no saldo do objeto de referência contida na variável destino
        destino.deposita(valor);
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
}
