//Importação das bibliotecas externas
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de variável com a URL de acesso HTTP à API IMDB. A URL oficial está fora do ar
        //String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

        //Declaração de variável com a URL de acesso HTTP à API APOD da Nasa. Uso do alternativo apenas por estar pronto
        String url = "hhttps://api.mocki.io/v2/549a5d8b/NASA-APOD";

        //*Conexão e atribuição do retorno do acesso HTTP
        //Instanciamento de novo objeto advindo ca classe ClienteHttp
        var http = new ClienteHttp();
        //Declaração de variável e atribuição do valor de retorno do método buscaDados(arg), com o valor da variável URL como argumento e atribuindo 
        String json = http.buscaDados(url);

        //*Extrair (parsear) os dados relevantes (título, imagem)
        //
        ExtratorConteudoNasa extrator = new ExtratorConteudoNasa();
        //
        extrator.extraiConteudo(json);


        //*Manipular e exibir os dados
        //Instanciamento de novo objeto advindo da classe GeradoraFigurinha
        var gerador = new GeradoraFigurinha();

        //Declaração de loop for, para exibição de cada valor de chave selecionada sendo o índice do método get a variável de controle i
        for (int i = 0; i < 10; i++) {
            //
            Map<String,String> conteudo = listaConteudos.get(i);
            //Declaração de variável e atribuição do valor de retorno do método .get(key) do objeto filme, sendo a URL da imagem fornecida pela API IMbD
            String urlImagem = conteudo.get("image");
            //Declaração de variável e atribuição do valor de retorno do método .get(key) do objeto filme, sendo o título do filme fornecido pela API IMbD
            String titulo = conteudo.get("title");
            //Declaração de variável que receberá a concatenação do conteúdo da variável titulo e a String
            String nomeArquivo = "D:/Repositórios/Alura/Imersão_Java_202207/Alura_Stickers_202207/saida/" + titulo + ".png";
            
            //Exibição do valor o elemento dado pela chave "title" do objeto conteúdo via método get. Trechos comentados foram usados para debugging
            System.out.println(conteudo.get("title"));
            //System.out.println(filme.get("image"));
            //System.out.println(filme.get("imDbRating"));
            System.out.println();

            //Instanciamento de novo objeto advindo da classe URL com o conteúdo da variável urlImagem como endereço de localização da imagem e por se tratar de um InputStream, há necessidade de abertura do stream via método .opneStream
            InputStream inputStream = new URL(urlImagem).openStream();
            //Evocação do método .gerar do objeto gerador com o conteúdo da variável inputStream e a localização da saída do arquivo via String
            gerador.gerar(inputStream, nomeArquivo);

        }
    }
}
