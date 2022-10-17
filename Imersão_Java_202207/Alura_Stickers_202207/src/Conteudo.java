public class Conteudo {
    
    //Declaração de variáveis privadas e finais, imutáveis após isntanciamento
    private final String titulo;
    private final String urlImagem;

    //Declaração de método construtor
    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    //Declaração de métodos Getters
    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }
}
