import br.com.javautil.modelo.SaldoInsuficienteException;

public class TesteContas {
    //Declaração de método principal
    public static void main(String[] args) throws SaldoInsuficienteException{
        //Intancição de novos objetos advindos das classes ContaCorrente, ContaPoupanca, CalculadorImposto e SeguroVida, via construtor específico, e atribuição da referência à variável cc e cp
        ContaCorrente cc = new ContaCorrente(111, 2145);
        ContaPoupanca cp = new ContaPoupanca(111, 21455);
        SeguroVida sv = new SeguroVida();
        CalculadorImposto ci = new CalculadorImposto();

        //Evocação de método dos objetos com referências atribuídas à cc e cp
        cc.deposita(100.0);
        cp.deposita(200.0);
        cc.transfere(10.00, cp);//Como o método .transfere utiliza o método .saca, as regras são definidas na classe ContaCorrente vi @Override

        //Exibição dos valores de retorno do dos métodos evocados, de forma concatenada
        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        System.out.println("Saldo conta poupanca: " + cp.getSaldo());

        //Evocação do método da classe CalculadorImposto, passando as referências dos objetos contidas nas variáveis cc e sv
        ci.registra(cc);
        ci.registra(sv);

        //Exibição dos valores de retorno dos métodos de forma concatenada
        System.out.println("O imposto da conta corrente e: R$" + cc.getValorImposto());
        System.out.println("O imposto do seguro de vida e: R$" + sv.getValorImposto());
        System.out.println("O total dos impostos: R$" + ci.getTotalImposto());
    }
}
