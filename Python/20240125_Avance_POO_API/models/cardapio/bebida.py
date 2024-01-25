from models.cardapio.item_cardapio import ItemCardapio

class Bebida(ItemCardapio):
    def __init__(self, nome, preco, tamanho):
        # Evocação do construtor da superclasse para os atributos nome e preço
        super().__init__(nome, preco)
        self.tamanho = tamanho