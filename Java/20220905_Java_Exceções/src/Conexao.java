public class Conexao implements AutoCloseable{
    //Declaração de construtor
    public Conexao(){
        //Exibição de mensagem pertinente
        System.out.println("Abrindo conexao!");
    }
    //Declaração de método de leitura de dados
    public void leDados(){
        //Exibição de mensagem pertinente
        System.out.println("Recebendo dados!");
        //Lançamento de exceção
        throw new IllegalStateException("Objeto invalido! ");//Exceção lançada neste ponto de forma direta para simular um erro
    }
    //Sobrescrita do método close para implementação da interface AutoClosable definindo o método de fechamento de conexão
    @Override
    public void close(){
        //Exibição de mensagem pertinente
        System.out.println("Conexao fechada!");        
    }    
}
