///Importação de classes externas
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Declaração de classe primária
public class Data {
    //Declaração do método main
    public static void main(String[] args) {
        //Declaração de variável e atribuição do valor de retorno do método .now(), que retorna a data atual, da classe LocalDate
        LocalDate hoje = LocalDate.now();

        //Exibição do valor da variável hoje e de um separador
        System.out.println(hoje);
        System.out.println("-----------------------");

        //Declaração de variável e atribuição do valor de retorno do método .of(Y,M,D) onde o ano, mês e dia são inseridos como parâmetros
        LocalDate olimpiadasRJ = LocalDate.of(2016, Month.JUNE, 5);

        //Declaração de variável e atribuição do valor de resultado da expressão matemática, onde cada membro é o retorno do método .year() de cada objeto
        int anos = hoje.getYear() - olimpiadasRJ.getYear();

        //Declaração de variável e atribuição do valor de retorno do método .betwaeen(daraA, dataB), da classe Period
        Period anosClass = Period.between(olimpiadasRJ, hoje); 

        //Exibição dos valores da variável ano e o retorno do método .getYear() do objeto de referência atribuída à variável anosClass
        System.out.println("Passaram " + anos + " anos das olimpiadas");
        System.out.println("Passaram " + anosClass.getYears() + " anos das olimpiadas");

        //Exibição de separador
        System.out.println("-----------------------");

        //Declaração de variável e atribuição da referência do objeto de retorno do método .ofPattern(pattern). Esse retorno será o formato de data definido pelo argumento passado. Método oriundo da classe DateTimeFormatter. Repetido para a variável formatadorHora, mas para formatar a hora 
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");

        //Exibição do valor de retorno do método .plusYears(int) e aninhamento com o método .format() para que seja formatada a saída no formato de data desejado
        System.out.println("As próximas olimpiadas serão em " + olimpiadasRJ.plusYears(4).format(formatadorData));
        
        //Exibição de separador
        System.out.println("-----------------------");

        //Exibição do valor de retorno do método .now() da classe LocalDateTime, que retornará o horário atual, e aninhamento com o método .format() para que seja formatada a saída no formato de hora desejado
        System.out.println("Data e hora atual " + LocalDateTime.now().format(formatadorHora));

        //Exibição de separador
        System.out.println("-----------------------");
    }
}
