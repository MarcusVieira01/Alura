from models.restaurante import Restaurante
from models.cardapio.bebida import Bebida
from models.cardapio.prato import Prato

bebida_suco       = Bebida('Melancia', 2.45, '350ml')
prato_paozinho    = Prato('Paozinho', 2.00, 'Paozinho francês')

restaurante_praca = Restaurante('praça gourmet', 'gourmet')

restaurante_praca.adiciona_no_cardapio(bebida_suco)
restaurante_praca.adiciona_no_cardapio(prato_paozinho)

def main():
    restaurante_praca.exibe_cardapio()

if __name__ == '__main__':
    main()
