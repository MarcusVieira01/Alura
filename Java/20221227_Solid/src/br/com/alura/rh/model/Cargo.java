//Declaração de pacote
package br.com.alura.rh.model;
/**
 * Declaração de um enumerador
 */
public enum Cargo {
	/**
	 * Declaração de constantes e implementação do método abstrato
	 */
	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	/**
	 * Método abstrado para retornar o próximo cargo
	 * @return
	 */
    public abstract Cargo getProximoCargo();
}
