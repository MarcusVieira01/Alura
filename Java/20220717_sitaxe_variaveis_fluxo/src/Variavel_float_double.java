public class Variavel_float_double {
    public static void main (String [] args){
        //Declaração de variável e atribuição de valor inicial
        int numeroB = 2;
        double numeroA = 5;
        float salarioFloat = (float)6525.8; //A conversão para float, mesmo declarando como float foi exigência do Java 18
        double salarioDouble = 9852.36;
        double resultado = numeroA / numeroB;

        //Exibição concatenada do valor das variáveis
        System.out.println("O salario float e " + salarioFloat);
        System.out.println("O salario double e " + salarioDouble);
        System.out.println("O valor de divisao com resultado real e " + resultado);
    }
}
