public class TesteLacosEncadeados {
    //Declaração de método principal
    public static void main(String[] args) {
        //Loop for que a cada loop, definirá o multiplicando da tabuada
        for(int multiplicando = 1; multiplicando <= 10; multiplicando++){
            //Loop for que a cada loop, definirá o multiplicador da tabuada e fará a exibição do resultado da multiplicação
            for(int multiplicador = 0; multiplicador <= 10; multiplicador++){
                //Exibição dos valores das variáveis e do valor da expressão matemática de forma concatenada
                System.out.println(multiplicando + " X " + multiplicador + " = " + (multiplicando * multiplicador));
            }
            //Exibição de uma quebra de linha após o segundo loop for iterar
            System.out.println();
        }
    }
}
