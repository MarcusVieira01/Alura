//Importação das bibliotecas externas
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
        //Fazer conexão HTTP e buscar o responde da API com os top 250 filmes
        //Declaração de variável com a URL de acesso HTTP à API IMDB. A URL oficial está fora do ar
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
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

        //Extrair (parsear) os dados relevantes (título, imagem, classificação)
        //Instanciamento de objeto da classe jsonParse
        JasonParser parser = new JasonParser();
        //Usando uma classe externa, serão separados is itens e valores do conteúdo da variávem body
        List<Map<String, String>> listaFilmes = parser.parse(body);
        //Exibição do valor de retorno do método nome_lista.size DEBUG
        //System.out.println(listaFilmes.size());
        //Retorno do valor de um elemento específico utilizando método get(index) DEBUG
        //System.out.println(listaFilmes.get(0));

        //Manipular e exibir os dados
        //Declaração de loop for, no template forEach, para exibição de cada valor de chava selecionada
        for (Map<String,String> filme : listaFilmes) {
            System.out.println(filme.get("title"));
            System.out.println(filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            System.out.println();
        }
    }
}
