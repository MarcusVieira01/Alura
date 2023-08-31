from ProgramaTV import ProgramaTV

class Filme(ProgramaTV):
    # Declaração do construtor
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.__duracao = duracao

    # Métodos públicos
        
    # Métodos getter e setter
    # Métodos getter
    @property
    def duracao(self):
        return self.__duracao
    
    # Métodos setter
    @duracao.setter
    def duracao(self, valor):
        self.__duracao = valor
