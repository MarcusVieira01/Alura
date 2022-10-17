public class TestaCondicional {
    //
    public static void main(String[] args) {
        //
        int idade = 16;
        int quantidadePessoas = 2;

        //
        if (idade >= 18) {
            System.out.println("Voce tem mais de 18 anos!");
        }else if(quantidadePessoas >= 2){
            System.out.println("Acesso liberado com um adulto!");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
