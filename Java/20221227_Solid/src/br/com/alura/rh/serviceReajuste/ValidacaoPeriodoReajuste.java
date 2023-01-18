//Declaração de pacote
package br.com.alura.rh.serviceReajuste;

//Importaão de classes externas
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//Importação de classes internas
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Classe que implementa a interface ValidacaoReajuste e define o método de validação sobre o período de reajuste
 */
public class ValidacaoPeriodoReajuste implements ValidacaoReajuste {
    /**
     * Método que realiza a validação do período de reajuste
     */
    public void validar(Funcionario funcionario, BigDecimal aumento){
        //Declaração de variável local e atribuição do valor de retorno do método Getter do objeto Funcionário
        LocalDate ultimoReajuste = funcionario.getDataUltimoReajuste();
        //Declaração de variável local e atribuição do valor de retorno do método .now() da classe LocalDate
        LocalDate dataAtual = LocalDate.now();
        //Declaração de variável e atribuição do valor de retorno do método between(args) da classe ChronoUnit usando o enumerador MONTH para definir qual dado será retornado
        long mesesUltimoReajuste = ChronoUnit.MONTHS.between(ultimoReajuste, dataAtual);
        //Implementação de condição failfast, que lançará uma exceção em caso do período calculado ser menor que o valor pertinenta
        if (mesesUltimoReajuste < 6) {
			throw new ValidacaoException("Reajuste nao pode ser realizado devido a data do último reajuste!");
		}
    }
}
