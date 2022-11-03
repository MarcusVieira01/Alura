//Declaração de pacote
package br.com.alura.tdd.java;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

//Importação de classes para teste
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

//Declaração de classe de teste
public class BonusServiceTest {
    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusDeveriaSerZeroSalarioAlto(){
        //Instanciação de objeto via construtor e atribuição do valor de refer~encia à variável declarada
        BonusService service = new BonusService();
        //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("25000")));
        //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
        assertEquals(new BigDecimal("0.00"), bonus);
    }

    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusDeveriaSerDezPorcentoSalario(){
        //Instanciação de objeto via construtor e atribuição do valor de refer~encia à variável declarada
        BonusService service = new BonusService();
        //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("2500")));
        //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusMaximo(){
        //Instanciação de objeto via construtor e atribuição do valor de refer~encia à variável declarada
        BonusService service = new BonusService();
        //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
        BigDecimal bonus = service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("10000")));
        //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
