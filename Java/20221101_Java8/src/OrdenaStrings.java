//Inportação de classes externas
import java.util.ArrayList;
//import java.util.Collections;//COMENTADO PARA QUE SEJA SUPRIMIDO O WARNING
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Declaração de classe principal
public class OrdenaStrings {
    //Declaração de método principal
    public static void main(String[] args) {
        
        //Declaração de variável com instanciamento de objeto via construtor ArrayList(), com atribuição de sua referência à variáveç declarada
        List<String> palavras = new ArrayList<>();

        //Evocação de método .add(str) onde serão adicionados elementos ao objeto de referência contida na variável palavras
        palavras.add("Alura online");
        palavras.add("Casa do Código");
        palavras.add("Caelum");

        //Declaração de variável do tipo Comparator<type> e atribuição da referência do objeto isntanciado via construtor ComparadorTamanho()
        Comparator<String> comparador = new ComparadorTamanho();

        //MODO ANTIGO PARA REALIZAR ORDENAÇÃ
        //Evocação de método .sort(obj), que consta na classe auxiliar Collections, que fará a ordenação lexográfica (alfabética)
        //Collections.sort(palavras, comparador);

        //Evocação do método .sort(arg) via a variável que possui a referência do objeto palavras, sem acesso á classe auxiliar Collections
        palavras.sort(comparador);
        
        //Exibição do conteúdo do objeto de referência atribuída à variável passada como argumento
        System.out.println(palavras);

        //Declaração de variável e atribuição da referência do objeto instanciado via construtor ImprimeLinha(), que implementa a interface Consumer
        Consumer<String> consumidor = new ImprimeLinha();

        //Evocação de método .forEach(consumer) do objeto de referência armazenada na variável palavras
        palavras.forEach(consumidor);
    }   
}

//Declaração de classe auxiliar
class ComparadorTamanho implements Comparator<String>{
    //Sobreescrita do método compare para definir a forma de comparação customizada
    @Override
    public int compare(String s1, String s2) {
        //Cadeia de condicionais que em cada caso de comparação do tamanho das strings, será retornado um número pertinente
        if(s1.length() < s2.length()){
            return -1;
        }
        if(s1.length() > s2.length()){
            return 1;
        }
        return 0;        
    }
}

//Declaração de classe auxiliar
class ImprimeLinha implements Consumer<String>{
    //Sobreescrita de método obrigatório, com a lógica que desejamos
    @Override
    public void accept(String t) {
        System.out.println(t);        
    }
}

