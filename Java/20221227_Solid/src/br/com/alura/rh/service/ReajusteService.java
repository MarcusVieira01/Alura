//Declaração de pacote
package br.com.alura.rh.service;

//Importação de classes externas
import java.math.BigDecimal;
import java.util.List;

//Importação de classes internas
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Classe que realiza a reponsabilidade de validar um reajuste perante ao atributo salario de um funcionário 
 */
public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }

    /**
     * Método que realiza a validação de um reajuste salarial usando a comparação do valor do parametro reajuste com o valor do atributo saladia do objeto funcionário, também passado como parâmetro
     * @param funcionario
     * @param aumento
     */
	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        //Declaração de variável e atribuição do valor de retorno do método .add(args)
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);

		//Evocação de método da classe Funcionário, via objeto funcionario para realizar a alteração do valor do atributo salário
        funcionario.atualizarSalario(salarioReajustado);
	}
}
