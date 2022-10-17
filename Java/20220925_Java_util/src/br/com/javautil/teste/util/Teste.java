//Declaração de pacote
package br.com.javautil.teste.util;
//Importação de bibliotecas externas
import java.util.ArrayList;
import java.util.List;

//Importação de classes externas
import br.com.javautil.modelo.Cliente;
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;
import br.com.javautil.modelo.ContaPoupanca;

//Declaração de classe
public class Teste {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de objetos com atribuição de valores para os atributos
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        //Instanciação de objeto ArrayList via construtor, com atribuição da referência desse objeto à variávels do tipo List e dados do tipo Conta
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        //Laço ForEach que imprimirá cada toString do objeto de referência contida na variável conta do tipo Conta
        for (Conta conta : lista) {
                System.out.println(conta);
        }
        //COMENTADO PARA REMOÇÂO DO WARNING
        //Instanciação de objeto e atribuição do valor de referência à variável comparator, do tipo declarado TitularComparator
        //TitularComparator titComparator = new TitularComparator();

        //Evocação do método .sort compassagem do comparator via declaração de classe anônima e com lâmbdas
        lista.sort((Conta o1, Conta o2) -> {
                //Declaração de variáveis e atribuição de retorno da evocação dos métodos aninhados
                String nome1 = o1.getTitular().getNome();
                String nome2 = o2.getTitular().getNome();
        
                //Evocação de método de comparação que, se nome1 for maior que nome2, retornará 1. Se for menor retornará -1. Se for igual, retornará 0.
                int comparacao = nome1.compareTo(nome2);
        
                //Retorno do valor atribuído à variavel comparação
                return comparacao;
            }
        );

        //COMENTADO PARA REMOVER O WARNING
        //Atribuição da referência da instanciação de um objeto via classe anônima e com lâmbdas
        //Comparator<Conta> comp = (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero());

        //Exibição de um separador de iteração
        System.out.println("_________________");

        //Laço for via método que, necessita da implementação da interface Consumer e de seu método obrigatório accept. Dessa forma será iterado o conteúdo contido na variável lista e em cada iteração será executado o bloco dentro do método accept. Toda essa implementação pode ser removida via lambdas conforme implementado
        lista.forEach((conta) -> System.out.println(conta));
    }
}
