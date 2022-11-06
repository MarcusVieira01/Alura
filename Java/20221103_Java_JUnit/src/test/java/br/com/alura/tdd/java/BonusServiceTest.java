//Declaração de pacote
package br.com.alura.tdd.java;

//Importação de classes
import java.math.BigDecimal;
import java.time.LocalDate;

//Importação de classes para teste
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail; //COMENTADO PARA NÂO ENTRAR EM WARNING

//Declaração de classe de teste
public class BonusServiceTest {
    //Declaração de método de teste com a anotação @Test
    //TEST DECLARADO COMENTADO DEVIDO À NOVA IMPLEMENTAÇÃO DO CÁLCULO DO BONUS
    // @Test
    // void bonusDeveriaSerZeroSalarioAlto(){
    //     //Instanciação de objeto via construtor e atribuição do valor de refer~encia à variável declarada
    //     BonusService service = new BonusService();
    //     //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
    //     BigDecimal bonus = service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("25000")));
    //     //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
    //     assertEquals(new BigDecimal("0.00"), bonus);
    // }
    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusDeveriaSerZeroSalarioAlto(){
        //Instanciação de objeto via construtor e atribuição do valor de refer~encia à variável declarada
        BonusService service = new BonusService();
        //Evocação do método .calcularBonus(args) dentro do argumento do método assertThrows(args) que testará se o retorno do método evocado é a excessão desejada
        assertThrows(IllegalArgumentException.class, 
        () -> service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("25000"))));

        // //COMENTADO PARA NÃO EXECUTAR COMO ERRO
        // //Estrutura try-catch que tratará o lançamento de exceção conforme a lógica do método evocado no bloco try 
        // try{
        //     //Método .calcularBonus(args) evocado
        //     service.calcularBonus(new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal("25000")));
        //     //Método evocado para ocasionar falha deliberada no teste
        //     fail("Não executou a exception");
        // }catch(Exception e){
        //     assertEquals("Funcionário impossibilitado de receber bonus", e.getMessage());
        // }

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
