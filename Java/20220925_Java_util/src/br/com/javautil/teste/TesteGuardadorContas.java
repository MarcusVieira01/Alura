//Declaração de pacote
package br.com.javautil.teste;

//importação de classes externas
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;
import br.com.javautil.modelo.GuardadorDeContas;

//Declaração de classe
public class TesteGuardadorContas {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de objeto e atribuição de sua referência na variável guardador
        GuardadorDeContas guardador = new GuardadorDeContas();

        //Instanciação de objetos e atribuição de suas referências nas variáveis cc1 e cc2
        Conta cc1 = new ContaCorrente(111, 11111);
        Conta cc2 = new ContaCorrente(111, 11112);

        //Evocação de método par adicionar uma referência de objeto ao objeto armazenado na referência guardador
        guardador.adiciona(cc1);
        guardador.adiciona(cc2);

        //Exibição do valor de retorno do método evocado
        System.out.println(guardador.getQuantidadeElementos());

        //Exibição do valor de um elemento do objeto contido na referência guardador
        System.out.println(guardador.getReferencia(1));

        //Exibição do atributo numero, via operador de referência .
        System.out.println(guardador.getReferencia(1).getNumero());
    }
}
