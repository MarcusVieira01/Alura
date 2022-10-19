//Declaração de pacote
package br.com.javaio.src.teste;
//Importação de classes externas
import java.io.FileWriter;
import java.io.IOException;

//Declaração de classe primária
public class TesteEscritaFileWriter {
    //Declaração de método principal
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com arquivo
        //Instanciação de objeto via construtor FileWriter e atribuição de sua refencia à variável fw de tipo FileWriter
        FileWriter fw = new FileWriter("lorem2.txt");

        //Evocação de método .write(string) que escreverá no arquivo. Para pular a linha usamos um caractere especial \n
        fw.write("Um arquivo escrito por Marcus Vieira");
        fw.write(System.lineSeparator());//Evocação de método .lineSeparator() que fará a quebra de linha independentemente do SO
        fw.write("Uma outra linha escrita");
        fw.write(System.lineSeparator());//Evocação de método .lineSeparator() que fará a quebra de linha independentemente do SO
        fw.write("Uma outra linha escrita");

        //Fechamento do acesso ao objeto de referência contida na variável fw
        fw.close();
    }
}
