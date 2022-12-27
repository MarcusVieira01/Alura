//Declaração de pacote
package br.com.alura.rh.model;

//Importação de bibliotecas externas
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
//Importação de bibliotecas internas
import br.com.alura.rh.ValidacaoException;

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
	/**
	 * Declaração de método que reajusta salário conforme validação sobre o percentual do reajuste perante o valor do atributo salario
	 * @param aumento
	 */
	public void reajustarSalario(BigDecimal aumento) {
		//Declaração de variável e atribuição do valor de retorno do método divide(args) do objeto aumento, passado como parâmetro
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
		//Condicional que verifica se o reajuste está fora do permitido e caso true, lança exceção
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		//Atribuição do valor do salario com aumento via método .add(args) do atributo salario
		this.salario = this.salario.add(aumento);
		//Atribuição do valor de retorno do método .now() da classe LocalDate
		this.dataUltimoReajuste = LocalDate.now();
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
}
