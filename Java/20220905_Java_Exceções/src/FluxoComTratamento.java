public class FluxoComTratamento {
    //Declaração de método principal
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    
    //Declaração de métodos estáticos
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //Declaração de estrutura try/cath para tratamento de exceção caso ocorra dentro do bloco try
            try{
                //Implantação de exceções
                //int a = i / 0;//COMENTADO PARA O NULLPOINTEREXEPTION OCORRER

                //COMENTADO PARA SUMIR COM O ALERTA DO COMPILADOR
                //ClasseVazia vazia = null;
                
                //vazia.deposita();
            //Declaração de estrutura catch usando operador lógico OR para declarar dois tipos de exceção
            }catch(ArithmeticException | NullPointerException e){
                //Exibição concatenada de retorno do método .getMensage() do objeto com referência atribuída à variável e
                System.out.println("Deu ruim! " + e.getMessage());
                //Evocação de método do objeto refernciado em e, que fará a impressão do stacktrace da exceção
                e.printStackTrace();
            }
        }
        System.out.println("Fim do metodo2");
    }
}
