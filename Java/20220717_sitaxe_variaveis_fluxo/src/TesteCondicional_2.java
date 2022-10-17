public class TesteCondicional_2 {
    //
    public static void main(String[] args) {
        //
        int idade = 16;
        int quantidadePessoas = 2;

        //
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado!");
        }

        //
        idade = 16;
        quantidadePessoas = 2;

        //
        if(idade >= 18 && quantidadePessoas >= 2){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado!");
        }

        //
        idade = 16;
        boolean quantidadePessoasB = true;

        //
        if(idade >= 18 || quantidadePessoasB == true){
            System.out.println("Acesso liberado");
        }else{
            System.out.println("Acesso negado!");
        }

    }
}
