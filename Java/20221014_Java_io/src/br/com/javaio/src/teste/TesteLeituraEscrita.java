//Declaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//Declaração da classe primária
public class TesteLeituraEscrita {
    //Declaração de método main
    public static void main(String[] args) throws IOException {
        //Decorator para input do arquivo
        //Instanciação de objetos que farão a leitura dos bytes do arquivo, conversão para char e saída
        InputStream fis = new FileInputStream("lorem.txt");//Objeto que conterá a sequência de bytes do arquivo
        Reader isr = new InputStreamReader(fis);//Objeto que conterá a cadeia de char convertida de byte 
        BufferedReader br = new BufferedReader(isr);//Objeto que conterá o bufer das cadeias de char

        //Decorator para output do arquivo
        //Instanciação de objetos que farão a escrita dos bytes do arquivo, conversão para char e saída
        OutputStream fos = new FileOutputStream("loremCopiado.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //Leitura das linhas do arquivo lorem.txt e escrita no arquivo loremCopiado.txt
        //Inclusão de linha indicativa de cópia do arquivo
        bw.write("Cópia do arquivo:");
        bw.newLine();
        //Declaração de variável e atribuioçao do retorno do método .readLinte() com o conteúdo da primeira linha do arquivo
        String linha = br.readLine();
        //Loop while que pulará uma linha, fará a escrita da linha no arquivo loremCopia.txt e fará nova leitura da próxima linha do arquivo lorem.txt
        while(linha != null){
            bw.newLine();
            bw.write(linha);
            linha = br.readLine();
        }

        //Fechamento do acesso ao objeto bw e br
        bw.close();
        br.close();

        //Exibição de mensagem
        System.out.println("Arquivo copiado");
    }
}
