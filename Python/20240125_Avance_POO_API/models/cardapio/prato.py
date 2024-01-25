from models.cardapio.item_cardapio import ItemCardapio

class Prato(ItemCardapio):
    def __init__(self, nome, preco, descricao):
        # Evocação do construtor da superclasse para os atributos nome e preço
        super().__init__(nome, preco) 
        self.descricao = descricao
        
