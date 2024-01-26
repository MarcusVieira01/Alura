from models.restaurante import Restaurante
from models.cardapio.bebida import Bebida
from models.cardapio.prato import Prato

restaurante_praca = Restaurante('praça gourmet', 'gourmet')
bebida_suco       = Bebida('Melancia', 2.45, '350ml')
prato_paozinho    = Prato('Paozinho', 2.00, 'Paozinho francês')

def main():
    print(bebida_suco)
    print(prato_paozinho)

if __name__ == '__main__':
    main()
