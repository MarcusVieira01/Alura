from ProgramaTV import ProgramaTV

class Filme(ProgramaTV):
    # Declaração do construtor
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.__duracao = duracao

    # Métodos públicos
    # Declaração de método que exibe os atributos no output
    def imprime(self):
        print(f"{self.nome} - {self.ano}  - {self.duracao} - {self.likes}")
        
    # Métodos getter e setter
    # Métodos getter
    @property
    def duracao(self):
        return self.__duracao
    
    # Métodos setter
    @duracao.setter
    def duracao(self, valor):
        self.__duracao = valor
