//Declaração de pacote
package br.com.alura.tdd.service;

import java.math.BigDecimal;

//Importação de classes internas
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

//Declaração de classe de serviço
public class ReajusteService {
    //Declaração de método para conceder reajuste conforme desempenho
	public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
        //Condicional que fará o reajuste, via evocação do método .reajuste da classe funcionário, conforme o parâmetro passado de desempenho, dado pelo enum Desempenho
        if(desempenho == Desempenho.A_DESEJAR){
            //Aninhamento de métodos que calculará o reajuste
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            //Evocação de método .reajuste(arg) da classe Funcionário, que fará o incremento do valor do argumento no salário
            funcionario.reajuste(reajuste);
        }else if(desempenho == Desempenho.BOM){
            //Aninhamento de métodos que calculará o reajuste
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
            //Evocação de método .reajuste(arg) da classe Funcionário, que fará o incremento do valor do argumento no salário
            funcionario.reajuste(reajuste);
        }else if(desempenho == Desempenho.OTIMO){
            //Aninhamento de métodos que calculará o reajuste
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
            //Evocação de método .reajuste(arg) da classe Funcionário, que fará o incremento do valor do argumento no salário
            funcionario.reajuste(reajuste);
        }

	}
}
