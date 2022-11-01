//Inportação de classes externas
import java.util.ArrayList;
import java.util.List;

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

        //MODO ANTIGO PARA REALIZAR ORDENAÇÃO
        //Evocação de método .sort(obj), que consta na classe auxiliar Collections, que fará a ordenação lexográfica (alfabética)
        //Collections.sort(palavras, comparador);

        //Evocação do método .sort(arg) via a variável que possui a referência do objeto palavras, sem acesso á classe auxiliar Collections e implementando a interface Comparator via lâmbda. Evocação do método .compare(args) da classe wrapper Integer, que fará a comparação dos retornos dos métodos .length() e retornará -1 caso s2 seja maior, 1 caso s1 seja maior e 0 caso sejam iguais
        palavras.sort((s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
        
        //Exibição do conteúdo do objeto de referência atribuída à variável passada como argumento
        System.out.println(palavras);

        //Evocação de método .forEach(consumer) do objeto de referência armazenada na variável palavras onde é passado um LAMBDA de uma interface que, como o método .forEach orbigatóriamente precisa receber um Consumer, sua implementão é implícita. LAMBDA COMPLETO
        palavras.forEach((String s) -> {
            System.out.println(s);
        });

        //Evocação de método .forEach(consumer) do objeto de referência armazenada na variável palavras onde é passado um LAMBDA de uma interface que, como o método .forEach orbigatóriamente precisa receber um Consumer, sua implementão é implícita. LAMBDA sem as partes opcionais por ter apenas uma variável e um statement
        palavras.forEach(s -> System.out.println(s));
    }   
}
