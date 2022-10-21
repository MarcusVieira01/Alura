//Declaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Declaração de classe primária
public class TesteSerializacao {
    //Declaração de método principal
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Declaração de variável e atribuição do valor de inicialização. Como String é uma classe e não um primitivo, conseguimos testar os streams de serialização
        String nome = "Marcus";
        //Instanciação de objeto, de referência atribuída à variável oos, via construtor onde foi passado um novo objeto instanciado da classe FileOutputStream para definir como será a saída
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        //Método evocado para transformar o objeto de referência contida na variável nome em um fluxo binário, pelo objeto de referêncaia oos contida em oos
        oos.writeObject(nome);
        //Evocação de método para fechar o acesso ao objeto de referência contida em oos
        oos.close();

        //Instanciação de objeto, de referência atribuída à variável ois, via construtor onde foi passado um novo objeto instanciado da classe FileInputStream para definir como será a entrada
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        //Declaração de variável com atribuição do valor de retorno do método readObject() que retornará um objeto genérido. Sendo assim usamos o Cast para String para que seu valor de retorno seja do mesmo tipo da declaraão de variável; 
        String nomeLido = (String) ois.readObject();
        //Evocação de método para fechar o acesso ao objeto de referência contida em ois
        ois.close();
        //Exibição do valor atribuído à variável nomeLido
        System.out.println(nomeLido);
    }
}
