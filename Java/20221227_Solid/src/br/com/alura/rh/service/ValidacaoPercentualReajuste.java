//Declaração de pacote
package br.com.alura.rh.service.reajuste;

//Importação de classes externas
import java.math.BigDecimal;
import java.math.RoundingMode;
//Importação de classes internas
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Declaração de classe que implementa a interface ValidacaoReajuste e define o método de validação para o % de reajuste
 */
public class ValidacaoPercentualReajuste implements ValidacaoReajuste{
    /**
     * Método que realiza a validação da % de reajust
     */
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        //Declaração de variável e atribuição do valor de retorno do mpétodo .getSalario() do objeto funcionário da classe Funcionário
        BigDecimal salarioAtual = funcionario.getSalario();
    
        //Declaração de variável e atribuição do valor de retorno do método divide(args) do objeto aumento, passado como parâmetro
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
    
        //implementação de fail fast via condicional que verifica se o reajuste está fora do permitido e caso true, lança exceção
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
