//Declaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//Declaração da classe primária
public class TesteTecladoOutConsole {
    //Declaração de método main com lançamento de exceção
    public static void main(String[] args) throws IOException {
        //Decorator para input do arquivo
        //Instanciação de objetos que farão a leitura dos bytes input do console, conversão para char e saída
        InputStream fis = System.in;//Objeto que receberá a sequencia de bytes escrita via console
        Reader isr = new InputStreamReader(fis);//Objeto que conterá a cadeia de char convertida de byte 
        BufferedReader br = new BufferedReader(isr);//Objeto que conterá o bufer das cadeias de char

        //Decorator para output do arquivo
        //Instanciação de objetos que farão a escrita no console, conversão para char e saída
        OutputStream fos = System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //Leitura das linhas do arquivo lorem.txt e escrita no arquivo loremCopiado.txt
        //Declaração de variável e atribuioçao do retorno do método .readLinte() com o conteúdo da primeira linha do arquivo
        String linha = br.readLine();
        //Loop while verificará se a linha é diferente null e se o retorno booleano do método isEmpty() não é true. Caso satisfaça será escrita a linha, pulada uma linha, exibida mensagem, exibido o retorno do método .flush() que descarregará o que foi armazenado no BufferedWriter e realizada nova leitura
        while(linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            // COMENTADO PARA REMOVER O RETORNO DIRETO
            // System.out.print("O que foi escrito: ");
            // bw.flush();
            linha = br.readLine();
        }

        //Fechamento do acesso ao objeto bw e br
        bw.close();
        br.close();
    }
}
