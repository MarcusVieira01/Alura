//Declaração de pacote
package br.com.alura.rh.model;

//Importação de classe externa
import java.math.BigDecimal;

/**
 * @apiNote Classe que define um funcionário Terceirizado com herança da classe Funcionário
 */
public class Terceirizado{
    //Declaração de atributos privados
    private DadosPessoais dadosPessoais;
    private String empresa;

    /**
     * Declaração de construtor, instanciando um objeto DadosPessoais via construtor
     * @param nome
     * @param cpf
     * @param cargo
     * @param salario
     */
    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
    }
    /**
     * Implementação de métodos getter
     * @return
     */
    public String getEmpresa() {
        return empresa;
    }
    
    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
    
}
