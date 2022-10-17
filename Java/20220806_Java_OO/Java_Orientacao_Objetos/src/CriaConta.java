public class CriaConta {
    //Declaração do método principal
    public static void main(String[] args) {
        //Instanciação de novos objetos advindos da classe Conta
        Conta primeiraConta = new Conta(2, 56);
        Conta segundaConta = new Conta(3, 54);

        //Atribuição de valores nos atributos dos objetos instanciados
        primeiraConta.setSaldo(200.00);
        segundaConta.setSaldo(50.00);
        segundaConta.setAgencia(146);
        
        //Exibição do valor dos atributos alterados
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        System.out.println("Agencia da segunda conta: " + segundaConta.getAgencia());

        //Exibição do valor da variável total via método getter
        System.out.println("Quantidade de contas: " + Conta.getTotal());
    }
}
