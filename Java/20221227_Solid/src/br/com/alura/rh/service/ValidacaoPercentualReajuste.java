package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        //Declaração de variável e atribuição do valor de retorno do mpétodo .getSalario() do objeto funcionário da classe Funcionário
        BigDecimal salarioAtual = funcionario.getSalario();
    
        //Declaração de variável e atribuição do valor de retorno do método divide(args) do objeto aumento, passado como parâmetro
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
    
        //Condicional que verifica se o reajuste está fora do permitido e caso true, lança exceção. Aplicado FAIL FAST
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }

    }
    
}
