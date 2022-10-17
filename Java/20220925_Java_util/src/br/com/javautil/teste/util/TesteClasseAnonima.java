//Declaração de pacote
package br.com.javautil.teste.util;
//Importação de bibliotecas externas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Importação de classes externas
import br.com.javautil.modelo.Cliente;
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;
import br.com.javautil.modelo.ContaPoupanca;

//Declaração de classe
public class TesteClasseAnonima {
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

        //Evocação do método .sort compassagem do comparator via declaração de classe anônima
        lista.sort(new Comparator<Conta>(){
            //Implementação do método com sobreescrição da interface
            @Override
            public int compare(Conta o1, Conta o2) {
                //Declaração de variáveis e atribuição de retorno da evocação dos métodos aninhados
                String nome1 = o1.getTitular().getNome();
                String nome2 = o2.getTitular().getNome();
        
                //Evocação de método de comparação que, se nome1 for maior que nome2, retornará 1. Se for menor retornará -1. Se for igual, retornará 0.
                int comparacao = nome1.compareTo(nome2);
        
                //Retorno do valor atribuído à variavel comparação
                return comparacao;
            }
        });

        //Exibição de um separador de iteração
        System.out.println("_________________");

        //Laço ForEach que imprimirá cada toString do objeto de referência contida na variável conta do tipo Conta
        for (Conta conta : lista) {
                System.out.println(conta);
        }
    }
}

//Declaração de classe auxiliar para uso no método .sort
class NumeroContaComparator implements Comparator<Conta>{
    //Implementação do método com sobreescrição da interface
    @Override
    public int compare(Conta c1, Conta c2) {
        //O método retorno do método evocado da classe Integer retorna retornará um positivo se o valor da conta 1 for maior que da conta 2. Se for menor, retornará um negativo. Se for igual, retornará 0;
        return Integer.compare(c1.getNumero(), c2.getNumero());

        //COMENTADO PARA NOVA IMPLEMENTAÇÂO
        //O condicional aninhado definirá se o valor da conta 1 for maior que da conta 2, retornará um positivo. Se for menor, retornará um negativo. Se for igual, retornará 0;
        // if(c1.getNumero() < c2.getNumero()){
        //     return -1;
        // }else if(c1.getNumero() > c2.getNumero()){
        //     return 1;
        // }else{
        //     return 0;
        // }
    }
}
