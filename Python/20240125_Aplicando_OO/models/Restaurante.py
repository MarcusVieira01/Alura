# Classe que instancia objetos do tipo Restaurante
class Restaurante:
    def __init__(self, nome, categoria):
        self.nome = nome
        self.categoria = categoria
        self.ativo = False
    def __str__(self):
        return f"Nome: {self.nome} | Categoria: {self.categoria}"

