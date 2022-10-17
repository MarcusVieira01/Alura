//Declaração de pacote
package br.com.bytebank.banco.teste;
//Importação das classes de outro pacote
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//Declaração de classe
public class TesteSaca {
    //Declaração de método main
    public static void main(String[] args) {
        //Instanciação de novo objeto Conta corrente, atribuindo sua referência à variável conta do tipo Conta. Por ser um tipo amis genérico, ou seja, a classe ContaCorrente estende Conta, não temos problemas de compilação
        Conta conta = new ContaCorrente(123, 456789);

        //Evocação de métodos do objeto da referencia conta que realizará um depósito de 200 e um saque de 195. Como a exceção pode ocorrer no método .saca(arg) é realizada bloco try/catch para melhorar a exibição do tratamento de exeção
        conta.deposita(200.00);
        try{
            conta.saca(200.00);//O método saca possui uma taxa de saque de 0.2 que será somada ao valor inserido no argumento
        }catch(SaldoInsuficienteException e){
            //Exibição do retorno método getMessage() do objeto exceção contido na referência e. Essa linha sobepujará a exibição do backtrace e ficará mais amigável ao usuário e a saída não erá abrupta.
            System.out.println(e.getMessage());
        }
        
        //Exibição concatenada do valor de retorno do método getter do objeto da referência conta
        System.out.println("O saldo da conta e: " + conta.getSaldo());
    }
}
