//Decllaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

//Declaração de classe primária
public class TesteUnicodeEncoding {
    //Declaração de método principal
    public static void main(String[] args) throws UnsupportedEncodingException {
        //Declaração de variável e atribuição do seu valor de inicialização
        String s = "C";

        //Exibição concatenada do valor atribuído à variável s e do retorno do método .codePpointAt(índice) que retornará o valor do codepoint do Unicode referente ao caractere
        System.out.println("A string " + s + " possui o codepoint " + s.codePointAt(0));
        //Declaração de variável e atribuição do valor de retorno do método .defaultCharset(), sendo esse retorno o encode usado
        Charset set = Charset.defaultCharset();
        //Exibição concatenada do valor de retorno do método .name() que retornará o nome do encode usado
        System.out.println("O charset padrão é: " + set.name());

        //Declaração de variável do tipo bytes e sendo um array e atribuição do valor de retorno do método getBytes(), que recebe como argumento o nome de um charset a realizar o encoding
        byte[] bytes = s.getBytes("UTF_16");
        //Exibição concatenada do conteúdo da variável bytes e seu tamanho
        System.out.println("Os bytes são " + bytes + ", o tamanho é " + bytes.length + " usando charset UTF-16");

        //Declaração de variável do tipo bytes e sendo um array e atribuição do valor de retorno do método getBytes(), que recebe como argumento o nome de um charset a realizar o encoding. No caso seria a evocação de um atributo de uma classe denominada StandardCharset
        byte[] bytes2 = s.getBytes(StandardCharsets.US_ASCII);
        //Exibição concatenada do conteúdo da variável bytes e seu tamanho
        System.out.println("Os bytes são " + bytes2 + ", o tamanho é " + bytes2.length + " usando charset ASCII");

        //Instanciação de objeto via construtor String recebendo como parâmetro o valor da variável bytes e o charset a ser usado
        String sNovo = new String(bytes,"UTF-8");
        //Exibição concatenada do valro da variável sNovo
        System.out.println(sNovo + " - Há erro pois usamos UFT-8 na instanciação do sNovo e a cadeia de bytes foi encodada via UTF-16. Os erros são ??");

        //Instanciação de objeto via construtor String recebendo como parâmetro o valor da variável bytes e o charset a ser usado
        String sNovo2 = new String(bytes,"UTF-16");
        //Exibição concatenada do valro da variável sNovo2
        System.out.println(sNovo2 + " - Não há erro pois usamos UFT-16 na instanciação do sNovo2 e a cadeia de bytes també usa UTF-16");
    }
}
