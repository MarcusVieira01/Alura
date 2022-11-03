//Importação de classe externa de teste
import org.junit.Assert;
import org.junit.jupiter.api.Test;

//Declaração de pacote
public class CalculadoraTest {
    //Anotação criada para definir o método como um método de teste e utilizar o JUnit Jupiter
    @Test
    //Declaração de método com a lógica do teste
    public void deveriaSomarDoisNumerosPositivos(){
        //Instanciação de novo objeto com atribuição do valor de referência à variável declarada
        Calculadora calc = new Calculadora();
        //Declaração de variável e atribuição do valor de retorno do método .somar(args)
        int soma = calc.somar(3, 7);
        //Evocação do método .assertEquals(valor_esperado, valor_retorno) da classe Asster do pacote JUnit. Este método fará a verificação se o que esperamos foi igual (usando Equals posis são objetos) ao retorno do método evocado
        Assert.assertEquals(10, soma);
    }
}
