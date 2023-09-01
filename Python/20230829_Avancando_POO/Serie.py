from ProgramaTV import ProgramaTV

class Serie(ProgramaTV):
    # Declaração do construtor
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome, ano)
        self.__temporadas = temporadas

    # Métodos públicos
    # Declaração de método que exibe os atributos no output
    def imprime(self):
        print(f"{self.nome} - {self.ano} - {self.temporadas} - {self.likes}")

    # Métodos getter e setter
    # Métodos getter
    @property
    def temporadas(self):
        return self.__temporadas
    
    # Métodos setter
    @temporadas.setter
    def duracao(self, valor):
        self.__temporadas = valor
