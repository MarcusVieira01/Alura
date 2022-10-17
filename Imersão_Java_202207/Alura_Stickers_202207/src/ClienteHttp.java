import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp {
    
    //Declaração de método que ...
    public String buscaDados(String url){
        //Tratamento de exceções via template try catch
        try{
            //Criação de uma URI com base em uma url
            URI endereço = URI.create(url);
            //Instanciamento de um novo cliente de request via HTTP
            HttpClient client = HttpClient.newHttpClient();
            //Instanciamento de um request com argumento sendo o valor da variável URI endereço, realizando o método GET para adquirir os dados
            HttpRequest request = HttpRequest.newBuilder(endereço).GET().build();
            //Evocação de método .send interno do objeto client, que enviará o conteúdo da variável request e usasará a classe BodyHandlers para tratar a string, atribuindo o valor de resposta à variável
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            //Atribuição do corpo do conteúdo da resposta à variável body
            String body = response.body();
            //Exibição no console do valor da variável body DEBUG
            //System.out.println(body);
            //Retorno do valor da variável body
            return body;
         
        //Captura das excessões declaradas e atribuídas à variável ex
        }catch(IOException | InterruptedException ex){
            //Lançamento da exceção capturada pelo catch(tipos) como uma RuntimeException exibindo qual exceção é, via instanciamento do throw
            throw new RuntimeException(ex);
        }






    }



}
