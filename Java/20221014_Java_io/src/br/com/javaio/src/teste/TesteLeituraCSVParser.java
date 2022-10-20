//Declaração de pacote
package br.com.javaio.src.teste;
//Importação de classes externas
import java.io.File;
import java.util.Locale;
//import java.util.Arrays; //COMENTADO PARA IMPLEMENTAÇÂO VIA SCANNER
import java.util.Scanner;

//Declaração de classe primária
public class TesteLeituraCSVParser {
    //Declaração de método principal com lançamento de exceção necessiária para o construtor File()
    public static void main(String[] args) throws Exception {
        //Instanciamento de objeto, com atribuição de sua referência à variável scanner do tipo Scanner, via construtor que receberá outro construtor como parâmetro. Esse segundo construtor instanciará um objeto da classe File, que representa um arquivo. No caso o arquivo contas.csv
        Scanner scanner = new Scanner(new File("contas.csv"));

        //Loop while que, enquanto o retorno do método .hasNextLine() for true, atribui o valor da linha do arquivo à variável linha e exibe no console
        while(scanner.hasNextLine()){
            //Declaração de variável e atribuição do valor de retorno do método .nextLine() onde retornará a primeira linha do arquivo contido no objeto
            String linha = scanner.nextLine();
            //Exibição no console o conteúdo da variável linha
            System.out.println(linha);
            //COMENTADO PARA UMA IMPLEMENTAÇÂO VIA SCANNER MAIS SIMPLES
            // //Evocação de método .split(regex) que fará a secção do objeto string, via delimitador ,
            // String [] valores = linha.split(",");
            // //Exibição no console o conteúdo da variável valores, com evocação de método .toString() da classe auxiliar Arrays
            // System.out.println(Arrays.toString(valores));

            //Instanciação de objeto da classe Scanner via construtor que recebe uma String source e com referência atribuída à variável linhaScanner do tipo Scanner
            Scanner linhaScanner = new Scanner(linha);
            //Evocação do método .useLocale(locale) que fará as regras de decimais serem seguidas como a declaração e não pelo SO
            //Evocação do método .useDelimiter(pattern) que seccionará o objeto pelo padrão de delimitação declarado
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            //Atribuição de valor de retorno do método .next() que fará o acesso à próxima linha do objeto
            String valorStr = linhaScanner.next();
            int valorInt = linhaScanner.nextInt();
            int valorInt2 = linhaScanner.nextInt();
            String nome = linhaScanner.next();
            double valorDoub = linhaScanner.nextDouble();
            //Uso de método para realizar o fechamento do acesso ao objeto linhaScanner
            linhaScanner.close();
            //Exibição concatenada do valor atribuído à variável valor
            System.out.println("O valor do elemento 0 e: " + valorStr);
            System.out.println("O valor do elemento 1 e: " + valorInt);
            System.out.println("O valor do elemento 2 e: " + valorInt2);
            System.out.println("O valor do elemento 3 e: " + nome);
            System.out.println("O valor do elemento 4 e: " + valorDoub);
        }

        //Uso de método para fechamento do acesso ao objeto contido na referência scanner
        scanner.close();
    } 
}
