//Declaração de pacote
package br.com.javaio.src.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//Declaração de classe primária
public class TesteEscrita {
    //Declaração de método principal
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com arquivo
        //Instanciação de objeto, via construtor que receberá o nome do arquivo como parâmetro, com atribuição da referência à variável fos, do tipo FileOutputStream. Esse objeto armazenará os bytes do arquivo escrito
        OutputStream fos = new FileOutputStream("loremEscrito.txt");//Tipo de dado InputStream mais genérico

        //Fluxo de leitura do fluxo de entrada
        //Instanciação de objeto, via construtor que receberá a referência do objeto FileOutputStream armazenada na variável fis como parâmetro, com atribuição da referência à variável isr, do tipo OutputStreamWriter. Esse objeto conterá a conversão de char para bytes
        Writer osr = new OutputStreamWriter(fos);//Tipo de dado Reader mais genérico

        //Instanciação de objeto, via construtor que receberá a referência do objeto InputStreamReader armazenada na variável isr como parâmetro, com atribuição da referência à variável br, do tipo BufferedReader. O objeto conterá o buffer do stream de dados;
        BufferedWriter bw = new BufferedWriter(osr);//Tipo mais específico pois a classe Reader não possui o método .readLine()

        //Evocação de método .write(string) que escreverá no arquivo e o método .nweLine() fará uma nova linha para posterior escrita novamente
        bw.write("Um arquivo escrito por Marcus Vieira");
        bw.newLine();
        bw.write("Uma outra linha escrita");
        bw.newLine();
        bw.write("Uma outra linha escrita");

        //Fechamento do acesso ao objeto de referência contida na variável br
        bw.close();
    }
}
