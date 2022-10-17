public class TesteLacosBreak {
    //Declaração de método principal
    public static void main(String[] args) {
        //Loop for que a cada loop, definirá o multiplicando da tabuada
        for(int linha = 0; linha < 10; linha++){
            //Loop for que a cada loop, definirá o multiplicador da tabuada e fará a exibição do resultado da multiplicação
            for(int coluna = 0; coluna < 10; coluna++){
                //Condicional que caso true interromperá o loop e em caso false exibirá o caractere específico
                if(coluna > linha){
                    //
                    break;
                }else{
                    //
                    System.out.print('*');
                }
            }
            //Exibição de uma quebra de linha após o segundo loop for iterar
            System.out.println();
        }
    }
}
