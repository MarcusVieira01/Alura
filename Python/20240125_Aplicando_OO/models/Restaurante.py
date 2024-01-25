from models.Avaliacao import Avaliacao

# Classe que instancia objetos do tipo Restaurante
class Restaurante:
    # Declaração de atributo da classe, sem autoreferência
    restaurantes = []

    def __init__(self, nome, categoria):
        self._nome = nome.title()
        self._categoria = categoria.upper()
        self._avaliacao = []
        self._ativo = False
        # Método sem autoreferência e evocado pelo construtor
        Restaurante.restaurantes.append(self)
    def __str__(self):
        return f'Nome: {self._nome} | Categoria: {self._categoria} | Avaliação: {self._avaliacao} | Ativo: {self._ativo}'

    # Métodos getter
    @property
    def nome(self):
        return self._nome
    @property
    def categoria(self):
        return self._categoria
    @property
    def ativo(self):
        return 'Verdadeiro' if self._ativo else 'Falso'
    
    # Métodos setter
    def alternar_ativo(self):
        self._ativo = not self._ativo
    def receber_avaliacao(self, cliente, nota):
        # Instancia de Avaliação
        avaliacao = Avaliacao(cliente, nota)
        self._avaliacao.append(avaliacao)
        
    # Método da classe
    @classmethod
    def listar_restaurantes(cls):
        print(f'{"Nome do Restaurante".ljust(20)} | {"Categoria".ljust(20)} | {"Ativo"}')
        for restaurante in cls.restaurantes:
            print(f'{restaurante.nome.ljust(20)} | {restaurante.categoria.ljust(20)} | {restaurante.ativo.ljust(20)}')
