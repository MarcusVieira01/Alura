//Declaração de pacote
package br.com.javautil.modelo;
//Declaração de classe que define uma exceção
public class SaldoInsuficienteException extends Exception{
    //Declaração de construtor
    public SaldoInsuficienteException(String msg){
        super(msg);
    }  
}
