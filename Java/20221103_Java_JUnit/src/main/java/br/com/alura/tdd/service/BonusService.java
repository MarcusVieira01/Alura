//Classe carregada do treinamento

package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		//Condicional que lançará uma exceção caso o bonus calculado exceda R$1000,00
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário impossibilitado de receber bonus");
		}
		//Modificado o valor de retorno para que seja arredondado para duas casas decimais
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
