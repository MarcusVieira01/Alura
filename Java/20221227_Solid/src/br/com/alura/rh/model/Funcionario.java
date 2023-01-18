//Declaração de pacote
package br.com.alura.rh.model;

//Importação de bibliotecas externas
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @apiNote Declaração de classe que abstrai um Funcionário
 */
public class Funcionario {
	//Declaração de atributos privados
	DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	/**
	 * Declaração de construtor
	 * @param nome
	 * @param cpf
	 * @param cargo
	 * @param salario
	 */
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	//Declaração dos métodos getter e setter para os atributos privados
	public String getNome() {
		return this.dadosPessoais.getNome();
	}
	public String getCpf() {
		return this.dadosPessoais.getCpf();
	}
	public Cargo getCargo() {
		return this.dadosPessoais.getCargo();
	}
	public BigDecimal getSalario() {
		return this.dadosPessoais.getSalario();
	}
	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	/**
	 * Declaração de método que fará a alteração do atributo salario e dataUltimoReajuste
	 * @param novoSalario
	 */
	public void atualizarSalario(BigDecimal novoSalario) {
		//Atribuição do valor passado como parâmetro ao atributo salario do objeto instanciado
		this.dadosPessoais.setSalario(novoSalario);
		//Atribuição do valor de retorno do método .now() da classe LocalDate ao atributo dataUltimoReajuste
		this.dataUltimoReajuste = LocalDate.now();
	}

	/**
	 * Realiza a modificação do valor do atributo cargo
	 * @param novoCargo
	 */
	public void promover(Cargo novoCargo){
		this.dadosPessoais.setCargo(novoCargo);
	}
}
