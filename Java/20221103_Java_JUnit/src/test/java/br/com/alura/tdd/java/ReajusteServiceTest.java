//Declaração de pacote
package br.com.alura.tdd.java;

//Importação de classe externa
import java.math.BigDecimal;
import java.time.LocalDate;

//Importação de classe interna
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import br.com.alura.tdd.modelo.Desempenho;

//Importação de classes para teste
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

//Declaração de classe de teste
public class ReajusteServiceTest {
    //Declaração de atrb=ibutos privados
    private ReajusteService service;
    private Funcionario funcionario;

    //Uso da anotação @BeforeEach para que este método seja instanciando antes de todos os métodos de teste
    @BeforeEach
    //Declaração de método onde serão instanciados os objetos pertinentes e atribuídas suas referências nos valores dos atributos pertinentes
    public void inicialiar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Marcus", LocalDate.now(), new BigDecimal("1000.00"));
    }

    //Declaração de método de teste para realiste com desempenho a desejar
    @Test
    public void reajusteTresPorcentoDesejar(){
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.A_DESEJAR
        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    //Declaração de método de teste para realiste com desempenho bom
    @Test
    public void reajusteQuinzePorcentoBom(){
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.BOM
        service.concedeReajuste(funcionario, Desempenho.BOM);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    //Declaração de método de teste para realiste com desempenho excelente
    @Test
    public void reajusteVintePorcentoExelente(){
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.OTIMO
        service.concedeReajuste(funcionario, Desempenho.OTIMO);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

    //Declaração de método de teste para realiste com desempenho excelente
    @Test
    public void reajusteVintePorcentoEspetacular(){
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.OTIMO
        service.concedeReajuste(funcionario, Desempenho.ESPETACULAR);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1400.00"), funcionario.getSalario());
    }
}
