import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
//import java.io.FileInputStream; //Comentado pois o a linha de FileInputStream está comentada
//import java.net.URL;

import javax.imageio.ImageIO;



public class GeradoraFigurinha {
    public void gerar(InputStream inputStream, String nomeArquivo) throws Exception{
        //Leitura da imagem
        //Declaração de variável e atribuição de nova instancia de objeto, advinda da classe FileInputStream com o path da imagem
        //InputStream inputStream = new FileInputStream("D:/Repositórios/Alura/Imersão_Java_202207/Alura_Stickers_202207/entrada/filme.jpg");

        //Declaração de variável e atribuição de nova instancia de objeto, advinda da classe URL com endereço como argumento e solicitação de abertura de fluxo de dados via método .openStream()
        //InputStream inputStream = new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg").openStream();

        //Executa a leitura do arquivo de imagem via classe ImageIO e método .read, instanciando um novo objeto File que será uma representação do local do arquivo da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        //Cria nova imagem em memória com transparencia e com tamanho novo
        //Declaração de varipaveis e atribuição do valor de retorno dos métodos getWidth() e getHeigth() do objeto imagemOriginal 
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        //Declaração de variável e atribuição da nova altura da imagem gerada
        int novaAltura = altura + 200;
        //Instanciamento de novo objeto da classe BufferedImage com a largura original e a nova altura, com tipo de imagem transparente no trecho ainda sem conteúdo
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
        
        //Copiar a imagem original para nova imagem em memória
        //Atribuição do retorno do metodo .getGraphics() do objeto novaImagem
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        //Criação da nova imagem incluindo a imagem original, na posição inicial (x,y) 0,0 
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //Configurar fonte de texto
        //Instanciamento de novo objeto advindo da classe Font com arguntentos de configuração
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        //Evocação do método .setFont do objeto graphics, com argumento o objeto anterior instanciado, 
        graphics.setFont(fonte);
        //Evocação do método .setColor do objeto graphics, com argumento sendo a cor da fonte 
        graphics.setColor(Color.CYAN);

        //Frase na imagem
        //Evocação do método drawString, do objeto graphics
        graphics.drawString("TOPZERA", 100, novaAltura - 100);

        //Escrever a nova imagem em um arquivo
        //Evocação do método da classe ImageIO fazendo que o conteúdo da variável nova imagem seja arquivado no path selecionado e com o formato especificado
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
    }
    
    //Declaração de classe main para testes
    public static void main(String[] args) throws Exception {
        // //Instancimento de novo objeto da classe GeradoraFigurinha DEBUG
        // var geradora = new GeradoraFigurinha();
        // //Evocação de método do objeto instanciado para geração da figurinha DEBUG
        // geradora.gerar();




    }
}
