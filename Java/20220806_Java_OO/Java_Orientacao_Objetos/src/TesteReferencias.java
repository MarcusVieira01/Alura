public class TesteReferencias {
    //
    public static void main(String[] args) {
        //
        Conta terceiraConta = new Conta(3, 69);
        //
        terceiraConta.setSaldo(300.00);
        //
        Conta quartaConta = terceiraConta;
        //
        System.out.println("Saldo terceira conta apos instanciamento e alteracao do valor do atributo: " + terceiraConta.getSaldo());
        System.out.println("Saldo da quarta conta apos atribuicao: " + quartaConta.getSaldo());
        //
        quartaConta.setSaldo(quartaConta.getSaldo() + 100);
        //
        System.out.println("Saldo da terceira conta " + terceiraConta.getSaldo());
        //
        System.out.println("Referencia terceira conta " + terceiraConta);
        System.out.println("Referencia quarta conta " + quartaConta);
    }
}
