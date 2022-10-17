//Declaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//Declaração de classe primária
public class TesteLeitura {
    //Declaração de método principal
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com arquivo
        //Instanciação de objeto, via construtor que receberá o nome do arquivo como parâmetro, com atribuição da referência à variável fis, do tipo FileInputStream. Esse objeto armazenará os bytes do arquivo
        InputStream fis = new FileInputStream("lorem.txt");//Tipo de dado InputStream mais genérico

        //Fluxo de leitura do fluxo de entrada
        //Instanciação de objeto, via construtor que receberá a referência do objeto FileInputStream armazenada na variável fis como parâmetro, com atribuição da referência à variável isr, do tipo InputStreamReader. Esse objeto conterá a conversão de bytes para char
        Reader isr = new InputStreamReader(fis);//Tipo de dado Reader mais genérico

        //Instanciação de objeto, via construtor que receberá a referência do objeto InputStreamReader armazenada na variável isr como parâmetro, com atribuição da referência à variável br, do tipo BufferedReader. O objeto conterá o buffer do stream de dados;
        BufferedReader br = new BufferedReader(isr);//Tipo mais específico pois a classe Reader não possui o método .readLine()

        //Uso do método .ready() para verificar se o arquivo está ok par aleitura
        System.out.println("Arquivo pronto para leitura? " + br.ready() + "\n");

        //Declaração de variável e atribuição do retorno do método evocado .readLine();
        String linha = br.readLine();

        //Loop while que enquanto o conteúdo da variável linha não for null, exibirá seu conteúdo no output
        while(linha != null){
            //Exibição do conteúdo da variável linha
            System.out.println(linha);
            //Atribuição de novo conteúdo da próxima linha do arquivo
            linha = br.readLine();
        }

        //Fechamento do acesso ao objeto de referência contida na variável br
        br.close();
    }
}
