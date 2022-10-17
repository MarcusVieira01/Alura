public class OpFatorial {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variável. Como o resultado de um fatorial é um numero grande, foi declarada a variável com o tipo long
        long fatorial = 1;

        //Loop for que calculará o valor do fatorial de 10, iterando resultados parciais e atribuíndo à variável fatorial até a iteração chegar na condição de parada
        for(int contador = 1; contador < 10; contador++){
            fatorial = fatorial * (contador + 1);
        }

        //Exibição do valor da variável fatorial de forma concatenada
        System.out.println("O fatorial de 10 e: " + fatorial);
    }
}
