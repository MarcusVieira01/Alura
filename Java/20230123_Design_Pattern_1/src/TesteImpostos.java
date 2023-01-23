import java.math.BigDecimal;

import br.alura.loja.imposto.CalculadoraImposto;
import br.alura.loja.imposto.TipoImposto;
import br.alura.loja.orcamento.Orcamento;

//
public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadora = new CalculadoraImposto();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));

    }
}
