//Declaração de pacote
package br.com.alura.tdd.java;

//Importação de classes externas
import java.math.BigDecimal;
import java.time.LocalDate;

//Importação de classes internas
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

//Importação de classes para teste
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail; //COMENTADO PARA NÂO ENTRAR EM WARNING

//Declaração de classe de teste
public class BonusServiceTest {
    //Declaração de atrubutos, para regatoração
    private BonusService service;
    private Funcionario funcionario;

    //Declaração de método onde serão instanciados os objetos pertinentes e atribuídas suas referências nos valores dos atributos pertinentes
    public void inicializar(String salario){
        this.service = new BonusService();
        this.funcionario = new Funcionario("Marcus Vieira", LocalDate.now(), new BigDecimal(salario));
    }

    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusDeveriaSerZeroSalarioAlto(){
        //Evocação de método para instaniação dos objetos necessários
        inicializar("25000");
        //Evocação do método .calcularBonus(args) dentro do argumento do método assertThrows(args) que testará se o retorno do método evocado é a excessão desejada
        assertThrows(IllegalArgumentException.class, 
        () -> service.calcularBonus(funcionario));
    }

    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusDeveriaSerDezPorcentoSalario(){
        //Evocação de método para instaniação dos objetos necessários com o valor do cenário
        inicializar("2500");
        //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
        BigDecimal bonus = service.calcularBonus(funcionario);
        //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    //Declaração de método de teste com a anotação @Test
    @Test
    void bonusMaximo(){
        //Evocação de método para instaniação dos objetos necessários com o valor do cenário
        inicializar("10000");
        //Declaração de variável com atribuição do valor de retorno do método .calcularBonus(args)
        BigDecimal bonus = service.calcularBonus(funcionario);
        //Evocação do método assert.Equals(args) para conferência do valor da variável bonus
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
