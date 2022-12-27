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
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	/**
	 * Declaração de construtor
	 * @param nome
	 * @param cpf
	 * @param cargo
	 * @param salario
	 */
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	//Declaração dos métodos getter e setter para os atributos privados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
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
		this.salario = novoSalario;
		//Atribuição do valor de retorno do método .now() da classe LocalDate ao atributo dataUltimoReajuste
		this.dataUltimoReajuste = LocalDate.now();
	}
}
