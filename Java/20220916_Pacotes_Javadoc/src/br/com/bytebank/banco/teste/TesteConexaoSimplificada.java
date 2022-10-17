//Declaração de pacote
package br.com.bytebank.banco.teste;
//Importação da classe de outro pacote
import br.com.bytebank.banco.modelo.Conexao;

//declaração de classe
public class TesteConexaoSimplificada {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de estrutura de tratamento de exceções, apenas com bloco catch e usando interface implementada na classe Conexão
        try(Conexao con = new Conexao()){
            //Evocação de métodos do objeto de referência atribúida à variável con
            con.leDados();
        }catch(IllegalStateException e){
            //Exibição de mensagem pertinente
            System.out.println("Erro de conexao! " + e.getMessage());
        }

        //COMENTADO PARA SIMPLIFICAÇÂO
        // //Declaração de variável global
        // Conexao con = null;
        // //Declaralção de estrutura try/catch para tratamento de exceções
        // try{
        //     //Instanciação de novo objeto via construtor, com atribuição de sua referência à variável con
        //     con = new Conexao();
        //     //Evocação de métodos do objeto de referência atribúida à variável con
        //     con.leDados();
        // }catch(IllegalStateException e){
        //     //Exibição de mensagem pertinente
        //     System.out.println("Erro de conexao! " + e.getMessage());
        // //Trecho finally SEMPRE será executado, tendo exceção ou não
        // }finally{
        //     con.fecha();
        // }
    }
}
