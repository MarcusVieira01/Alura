package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodoReajuste implements ValidacaoReajuste {
    
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate ultimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();

        long mesesUltimoReajuste = ChronoUnit.MONTHS.between(ultimoReajuste, dataAtual);

        if (mesesUltimoReajuste < 6) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
    }
}
