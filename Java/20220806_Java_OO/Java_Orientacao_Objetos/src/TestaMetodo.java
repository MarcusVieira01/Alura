public class TestaMetodo {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciamento de novos objetos Conta via método contrutor Conta() e atribuídos às variáveis conta e contaMarcela
        Conta conta = new Conta(8, 36);
        Conta contaMarcela = new Conta(9, 74);
        //Exibição do valor do atributo .saldo do objeto conta
        System.out.println(conta.getSaldo());

        //Evocação do método .deposita(arg) e inserção de valor
        conta.deposita(250.53);
        //Exibição do valor do atributo .pegaSaldo() do objeto conta
        System.out.println(conta.getSaldo());

        //Evocação do método .saca(arg) do objeto instanciado conta e atribuição do seu valor de retorno à variável sacou
        boolean sacou = conta.saca(200.00);
        //Exibição do valor da variavel sacou de forma concatenada
        System.out.println("E possivel sacar 200,00 da conta? " + sacou + " O saldo ficou " + conta.getSaldo());

        //
        contaMarcela.deposita(1000.00);
        System.out.println("O saldo da Marcela e " + contaMarcela.getSaldo());
        //
        contaMarcela.transfere(100, conta);
        //
        System.out.println("O saldo da Marcela ficou " + contaMarcela.getSaldo() + " e a outra conta ficou " + conta.getSaldo());
    }
}
