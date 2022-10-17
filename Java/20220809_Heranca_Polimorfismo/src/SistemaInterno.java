public class SistemaInterno {

    //Declaração de atributos privados
    int senha = 2222;

    //Declaração de método que retornara uma mensagem específica conforma a condição
    public void autentica(Autenticavel fa){
        //Declaração de variável e atribuição do valor de retorno do método .autenticação(arg) pertencente ao objeto da referência atribuída em g
        boolean autenticou = fa.autenticacao(this.senha);

        //Condicional que, conforme o valor booleano da variável autenticou, exibirá mensagens pertinentes
        if(autenticou){
            System.out.println("Acesso liberado.");
        }else{
            System.out.println("Acesso negado.");
        }
    }
        
}
