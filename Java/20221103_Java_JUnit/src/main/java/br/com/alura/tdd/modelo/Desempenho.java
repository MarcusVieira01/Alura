//Declaração de pacote
package br.com.alura.tdd.modelo;

//Importação de classes externas
import java.math.BigDecimal;

//Declaração de enumerator
public enum Desempenho {
    //Declaração de constantes com o método abstro implementado para cada situação
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            //Retorno de um objeto BigDecimal com o valor do reajuste
            return new BigDecimal("0.03");
        }
    }, 
    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            //Retorno de um objeto BigDecimal com o valor do reajuste
            return new BigDecimal("0.15");
        }
    }, 
    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            //Retorno de um objeto BigDecimal com o valor do reajuste
            return new BigDecimal("0.20");
        }
    },
    ESPETACULAR {
        @Override
        public BigDecimal percentualReajuste() {
            //Retorno de um objeto BigDecimal com o valor do reajuste
            return new BigDecimal("0.40");
        }
    };

    //Declaração de método abstrato
    public abstract BigDecimal percentualReajuste();
}
