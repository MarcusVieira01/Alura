//Importação das bibliotecas externas
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
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
        //Instanciamento de novo objeto advindo da classe GeradoraFigurinha
        var gerador = new GeradoraFigurinha();

        //Declaração de loop for, no template forEach, para exibição de cada valor de chaveselecionada
        for (Map<String,String> filme : listaFilmes) {
            //Declaração de variável e atribuição do valor de retorno do método .get(key) do objeto filme, sendo a URL da imagem fornecida pela API IMbD
            String urlImagem = filme.get("image");
            //Declaração de variável e atribuição do valor de retorno do método .get(key) do objeto filme, sendo o título do filme fornecido pela API IMbD
            String titulo = filme.get("title");
            //Declaração de variável que receberá a concatenação do conteúdo da variável titulo e a String
            String nomeArquivo = "D:/Repositórios/Alura/Imersão_Java_202207/Alura_Stickers_202207/saida/" + titulo + ".png";
            
            //Instanciamento de novo objeto advindo da classe URL com o conteúdo da variável urlImagem como endereço de localização da imagem e por se tratar de um InputStream, há necessidade de abertura do stream via método .opneStream
            InputStream inputStream = new URL(urlImagem).openStream();
            //Evocação do método .gerar do objeto gerador com o conteúdo da variável inputStream e a localização da saída do arquivo via String
            gerador.gerar(inputStream, nomeArquivo);

            System.out.println(filme.get("title"));
            //System.out.println(filme.get("image"));
            //System.out.println(filme.get("imDbRating"));
            System.out.println();
        }
    }
}
