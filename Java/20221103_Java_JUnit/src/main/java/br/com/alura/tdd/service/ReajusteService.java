//Declaração de pacote
package br.com.alura.tdd.service;

//Declaração de classes externas
import java.math.BigDecimal;

//Importação de classes internas
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

//Declaração de classe de serviço
public class ReajusteService {
    //Declaração de método para conceder reajuste conforme desempenho
	public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
        //Declaração de variável e atribuição do valor de retorno do método .percentualReajuste()
        BigDecimal percentualReajuste = desempenho.percentualReajuste();
        //Declaração de variável e atribuição do valor de retorno do aninhamento de métodos
        BigDecimal reajuste = funcionario.getSalario().multiply(percentualReajuste);
        //Declaração de variável e atribuição do valor de retorno do método .reajuste()
        funcionario.reajuste(reajuste);
	}
}
