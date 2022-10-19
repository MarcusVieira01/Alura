//Declaração de pacote
package br.com.javaio.src.teste;
//Importação de classes externas
import java.io.File;
import java.util.Scanner;

//Declaração de classe primária
public class TesteLeituraCSV {
    //Declaração de método principal com lançamento de exceção necessiária para o construtor File()
    public static void main(String[] args) throws Exception {
        //Instanciamento de objeto, com atribuição de sua referência à variável scanner do tipo Scanner, via construtor que receberá outro construtor como parâmetro. Esse segundo construtor instanciará um objeto da classe File, que representa um arquivo. No caso o arquivo contas.csv
        Scanner scanner = new Scanner(new File("contas.csv"));

        //Loop while que, enquanto o retorno do método .hasNextLine() for true, atribui o valor da linha do arquivo à variável linha e exibe no console
        while(scanner.hasNextLine()){
            //Declaração de variável e atribuição do valor de retorno do método .nextLine() onde retornará a primeira linha do arquivo contido no objeto
            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        //Uso de método para fechamento do acesso ao objeto contido na referência scanner
        scanner.close();
    } 
}
