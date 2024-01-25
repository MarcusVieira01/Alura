'''Importação de classe externa'''
from models.avaliacao import Avaliacao

class Restaurante:
    '''Classe que abstrai o conceito de restaurante'''
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
        return f'Nome: {self._nome} | Categoria: {self._categoria} | Ativo: {self._ativo}'

    # Métodos getter
    @property
    def nome(self):
        '''Método getter para o atributo nome'''
        return self._nome

    @property
    def categoria(self):
        '''Método getter para o atributo categoria'''
        return self._categoria
    @property
    def ativo(self):
        '''Método getter para o atributo ativo, após validação'''
        return 'Verdadeiro' if self._ativo else 'Falso'
    
    # Métodos setter
    def alternar_ativo(self):
        '''Método setter para o atributo ativo'''
        self._ativo = not self._ativo
    def receber_avaliacao(self, cliente, nota):
        '''Método setter para o atributo avaliacao, que fará validação do valor da nota limitando-a em 0 ou 5'''
        if nota > 5:
            nota = 5
        elif nota < 0:
            nota = 0
        avaliacao = Avaliacao(cliente, nota)
        self._avaliacao.append(avaliacao)

    # Método da classe
    @classmethod
    def listar_restaurantes(cls):
        '''Imprime a lista de restaurantes com seu atributos formatados, onde o atributo Avaliação será a média das 
        avaliações recebidas'''
        print(f'{"Nome do Restaurante".ljust(20)} | {"Categoria".ljust(20)} | {"Avaliação".ljust(20)} | {"Ativo"}')
        for restaurante in cls.restaurantes:
            print(f'{restaurante.nome.ljust(20)} | {restaurante.categoria.ljust(20)} | {str(restaurante.media_avaliacoes).ljust(20)} | {restaurante.ativo.ljust(20)}')
    
    # Métodos próprios
    @property
    def media_avaliacoes(self):
        '''Método que realiza validação se o restaurante possui avaliações, retornando uma string caso não possua e a 
        média arredondada para uma casa decimal caso possua'''
        if not self._avaliacao:
            return 'Sem Avaliações'
        else:
            return round(sum(avaliacao.nota for avaliacao in self._avaliacao) / len(self._avaliacao), 1)
