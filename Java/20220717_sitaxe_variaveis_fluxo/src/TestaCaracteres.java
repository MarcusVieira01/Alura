public class TestaCaracteres {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variáveis e atribuição de valor de inicialização
        char letra = 'a';
        char valorA = 66;
        String frase = "Teste de string";
        //Declaração de variável e atribuição do valor de resultado da expressão matemática, realizando casting do resultado para char
        char valorB = (char) (valorA + 1);
        //Exibição dos valores das variáveis letra, valorA, valorB e frase
        System.out.println(letra);
        System.out.println(valorA);
        System.out.println(valorB);
        System.out.println(frase);
    }
}
