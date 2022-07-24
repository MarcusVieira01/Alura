import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorConteudoIMDB {
    //Declaração de método público que recebe um JSON e retorna uma lista de conteúdos
    public List<Conteudo> extraiConteudo(String json){
        //Instanciamento de objeto da classe jsonParse
        JasonParser parser = new JasonParser();
        //Usando uma classe externa, serão separados os itens e valores do conteúdo da variávem body
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        //Instanciamento de novo objeto advindo da classe ArrayList()
        List<Conteudo> conteudos = new ArrayList<>();

        //Loop for que varrerá o mapa de string string (chave VS valor) e irerará o código para cada elemento
        for (Map<String, String> atributos : listaDeAtributos) {
            //Declaração de variáveis e atribuição dos valores de retorno do método get(chave)
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("image");//A chave é a única coisa que altera entre os dois extratores
            //Instanciamento de novo objeto advindo da classe Conteúdo, passando os dois parâmetros de construção
            Conteudo conteudo = new Conteudo(titulo, urlImagem);
            //Inclusão do valor do objeto conteúdo à lista conteúdos conteudos (Não seria melhor chamar de listaConteúdos?)
            conteudos.add(conteudo);
        }
        //Retorno do valor da lista de conteúdos
        return conteudos;
    }
}
