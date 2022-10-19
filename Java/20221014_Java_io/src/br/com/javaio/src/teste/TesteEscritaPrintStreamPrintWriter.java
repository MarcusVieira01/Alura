//Declaração de pacote
package br.com.javaio.src.teste;
//Importação de classes externas
import java.io.IOException;
import java.io.PrintStream;

//Declaração de classe primária
public class TesteEscritaPrintStreamPrintWriter {
    //Declaração de método principal
    public static void main(String[] args) throws IOException {
        //Declaração de variável e atribuição de retorno do método .currentTimeMillis()
        long inicio = System.currentTimeMillis();

        //Fluxo de entrada com arquivo
        //Instanciação de objeto via construtor PrintStream e atribuição de sua refencia à variável ps de tipo PrintStream
        PrintStream ps = new PrintStream("lorem3.txt");

        //Evocação de método .write(string) que escreverá no arquivo. Para pular a linha usamos um caractere especial \n
        ps.println("Um arquivo escrito por Marcus Vieira");
        ps.println();//Cria uma linha vazia
        ps.println("Uma outra linha escrita");
        ps.println("Uma outra linha escrita");

        //Fechamento do acesso ao objeto de referência contida na variável ps
        ps.close();
        
        //Declaração de variável e atribuição de retorno do método .currentTimeMillis()
        long fim = System.currentTimeMillis();

        //Declaração de variável e atribuição do valor de resultado da expressão matemática
        double delta = fim - inicio;

        //
        System.out.println("Demorou " + delta + " milisegundos para o código executar.");
    }
}
