//Declaração de pacote
package br.com.alura.rh.serviceReajuste;

//Importação de classe externa 
import java.math.BigDecimal;
//Importação de classe interna
import br.com.alura.rh.model.Funcionario;

/**
 * @apiNote Interface de padronização para as validações
 */
public interface ValidacaoReajuste {
    /**
     * Método de validação abstrato a ser implementado em cada classe de validação
     * @param funcionario
     * @param aumento
     */
    void validar(Funcionario funcionario, BigDecimal aumento);
}
