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

//Declaração de classe de teste
public class ReajusteServiceTest {
    //Declaração de método de teste para realiste com desempenho a desejar
    @Test
    public void reajusteTresPorcentoDesejar(){
        //Declaraçãod e ariável e atribuiçãod o valor de referência do objeto instanciado via construtor
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Marcus", LocalDate.now(), new BigDecimal("1000.00"));
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.A_DESEJAR
        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    //Declaração de método de teste para realiste com desempenho bom
    @Test
    public void reajusteQuinzePorcentoBom(){
        //Declaraçãod e ariável e atribuiçãod o valor de referência do objeto instanciado via construtor
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Marcus", LocalDate.now(), new BigDecimal("1000.00"));
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.BOM
        service.concedeReajuste(funcionario, Desempenho.BOM);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    //Declaração de método de teste para realiste com desempenho excelente
    @Test
    public void reajusteVintePorcentoeXCELENTE(){
        //Declaraçãod e ariável e atribuiçãod o valor de referência do objeto instanciado via construtor
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Marcus", LocalDate.now(), new BigDecimal("1000.00"));
        //Evocação do método .concedeReajuste(args) da classe ReajusteService, que fará o reajuste conforme o desempenho dado pelo valor do emum Desempenho.OTIMO
        service.concedeReajuste(funcionario, Desempenho.OTIMO);
        //Evocação de método assertEquals(args) que validará se o retorno do método da classe testada, no caso ReajusteService, é o esperado
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
