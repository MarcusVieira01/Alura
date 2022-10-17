public class TestaSomatoriaWhile {
    //Declaração de método
    public static void main(String[] args) {
        //Declaração de veriáveis, controle do loop e acumuladora, e atribuído o valor de inicialização
        int contador = 0;
        int soma = 0;
        //Loop while que fará a soma em 10 iterações
        while(contador <= 10){
            //Atribuição do valor de resultado da expressão matemática, via contração
            soma += contador;
            //Incremento de 1 ao valor da variável de controle
            contador++;
            //Exibição do valor da variável soma
            System.out.println(soma);
        }
    }
}
