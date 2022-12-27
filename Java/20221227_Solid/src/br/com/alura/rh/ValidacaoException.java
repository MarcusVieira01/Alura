//Declaração de pacotes
package br.com.alura.rh;
/**
 * @apiNote Classe que realiza uma exceção
 */
public class ValidacaoException extends RuntimeException {
	/**
	 * Declaração de atributo para serialização
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Construtor da exceção
	 * @param mensagem
	 */
	public ValidacaoException(String mensagem) {
		super(mensagem);
	}
}
