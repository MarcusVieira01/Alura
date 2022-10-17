//Declaração de pacote
package br.com.javautil.teste.util;
//Importação de bibliotecas externas
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//Importação de classes externas
import br.com.javautil.modelo.Conta;
import br.com.javautil.modelo.ContaCorrente;
import br.com.javautil.modelo.ContaPoupanca;

//Declaração de classe
public class TesteSortComparator {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de novo objeto, com atribuição de sua referência à variável do tipo mais genérico e com uso de construtor com parâmetros
        Conta cc1 = new ContaCorrente(22, 33);
        Conta cc2 = new ContaPoupanca(22, 44);
        Conta cc3 = new ContaCorrente(22, 11);
        Conta cc4 = new ContaPoupanca(22, 22);
        //Evocção de método do objeto de referências contidas nas variáveis e passado valor no seu argumento
        cc1.deposita(333.0);
        cc2.deposita(444.0);
        cc3.deposita(111.0);
        cc4.deposita(222.0);
        //Instanciação de novo objeto do tipo List, com tipo de dado sendo objeto Conta e evocação de construtor ArrayList();
        List<Conta> lista = new ArrayList<>();
        //Evocção de método do objeto de referência contida na variável lista e passado objeto como valor no seu argumento
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        //Laço ForEach que imprimirá cada toString do objeto de referência contida na variável conta do tipo Conta
        for (Conta conta : lista) {
            System.out.println("Conta" + conta);
        }
        
        //Instanciação de objeto e atribuição do valor de referência à variável comparator, do tipo declarado NumeroContaComparator
        NumeroContaComparator comparator = new NumeroContaComparator();
        
        //Evocação do método .sort
        lista.sort(comparator);

        //Exibição de um separador de iteração
        System.out.println("_____________________");
        
        //Laço ForEach que imprimirá cada toString do objeto de referência contida na variável conta do tipo Conta
        for (Conta conta : lista) {
            System.out.println("Conta" + conta);
        }
    }
}

//Declaração de classe auxiliar para uso no método .sort
class NumeroContaComparator implements Comparator<Conta>{
    //Implementação do método com sobreescrição da interface
    @Override
    public int compare(Conta c1, Conta c2) {
        //O condicional aninhado definirá se o valor da conta 1 for maior que da conta 2, retornará um positivo. Se for menor, retornará um negativo. Se for igual, retornará 0;
        if(c1.getNumero() < c2.getNumero()){
            return -1;
        }else if(c1.getNumero() > c2.getNumero()){
            return 1;
        }else{
            return 0;
        }
    }

}
