//Declaração de pacote
package br.com.alura.rh.service;

//Importação de classes externas
import java.math.BigDecimal;
import java.math.RoundingMode;
//Importação de classes internas
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Classe que realiza a reponsabilidade de validar um reajuste perante ao atributo salario de um funcionário 
 */
public class ReajusteService {
    /**
     * Método que realiza a validação de um reajuste salarial usando a comparação do valor do parametro reajuste com o valor do atributo saladia do objeto funcionário, também passado como parâmetro
     * @param funcionario
     * @param aumento
     */
	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        //Declaração de variável e atribuição do valor de retorno do mpétodo .getSalario() do objeto funcionário da classe Funcionário
		BigDecimal salarioAtual = funcionario.getSalario();

        //Declaração de variável e atribuição do valor de retorno do método divide(args) do objeto aumento, passado como parâmetro
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

		//Condicional que verifica se o reajuste está fora do permitido e caso true, lança exceção. Aplicado FAIL FAST
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}

        //Declaração de variável e atribuição do valor de retorno do método .add(args)
        BigDecimal salarioReajustado = salarioAtual.add(aumento);

		//Evocação de método da classe Funcionário, via objeto funcionario para realizar a alteração do valor do atributo salário
        funcionario.atualizarSalario(salarioReajustado);
	}
}
