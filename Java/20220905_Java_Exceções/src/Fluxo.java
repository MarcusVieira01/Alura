public class Fluxo {
    //Declaração de método principal
    public static void main(String[] args) {
        System.out.println("Ini do main");
        //Declaração de estrutura try/cath para tratamento de exceção caso ocorra dentro do bloco try
        try{
            metodo1();
        //Declaração de estrutura catch usando operador lógico OR para declarar dois tipos de exceção
        }catch(ArithmeticException | NullPointerException | MinhaExcecao e){
            //Exibição concatenada de retorno do método .getMensage() do objeto com referência atribuída à variável e
            System.out.println("Excecao " + e.getMessage());
            //Evocação de método do objeto refernciado em e, que fará a impressão do stacktrace da exceção
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    
    //Declaração de métodos estáticos
    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        //Instanciação de novo objeto e atribuição de sua referência à variável exception e lançando via keyword throw
        throw new MinhaExcecao("Deu muito ruim!");

        //COMENTADO PARA A KEYWORD THROW PODER OCORRER
        //System.out.println("Fim do metodo2");
    }
}
