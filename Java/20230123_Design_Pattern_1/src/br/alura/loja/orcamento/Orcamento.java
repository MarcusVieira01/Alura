//Declaração de pacote
package br.alura.loja.orcamento;
//Importação de classe externa
import java.math.BigDecimal;

/**
 * @apiNote Classe que abstrai um orçamento
 */
public class Orcamento {
    //Declaração de atributo privado
    private BigDecimal valor;

    /**
     * Declaração de construtor
     * @param valor
     */
    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    /**
     * Declaração de método getter
     * @return
     */
    public BigDecimal getValor() {
        return valor;
    }
}
