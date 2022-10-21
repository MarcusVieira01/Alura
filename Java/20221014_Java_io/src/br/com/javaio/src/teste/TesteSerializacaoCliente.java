//Declaração de pacote
package br.com.javaio.src.teste;

//Importação de classes externas
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//Importação de classe interna ao projeto
import br.com.javaio.src.model.Cliente;

//Declaração de classe primária
public class TesteSerializacaoCliente {
    //Declaração de método principal
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Instanciação de objeto via construtor Cliente(args) da classe Cleinte com atribuição de sua referência à variável declarada do tipo Cliente
        Cliente cliente = new Cliente("Marcus Vieira", "123456789-41");

        //Instanciação de objeto, de referência atribuída à variável oos, via construtor onde foi passado um novo objeto instanciado da classe FileOutputStream para definir como será a saída
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clienteA.bin"));
        //Método evocado para transformar o objeto de referência contida na variável cliente em um fluxo binário, pelo objeto de referêncaia oos contida em oos
        oos.writeObject(cliente);
        //Evocação de método para fechar o acesso ao objeto de referência contida em oos
        oos.close();

        //Instanciação de objeto, de referência atribuída à variável ois, via construtor onde foi passado um novo objeto instanciado da classe FileInputStream para definir como será a entrada
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clienteA.bin"));
        //Declaração de variável com atribuição do valor de retorno do método readObject() que retornará um objeto genérido. Sendo assim usamos o Cast para Cliente para que seu valor de retorno seja do mesmo tipo da declaração de variável; 
        Cliente clienteLido = (Cliente) ois.readObject();
        //Evocação de método para fechar o acesso ao objeto de referência contida em ois
        ois.close();
        //Exibição do valor atribuído à variável cleinteLido
        System.out.println(clienteLido);
    }
}
