from ProgramaTV import ProgramaTV

class Filme(ProgramaTV):
    # Declaração do construtor
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.__duracao = duracao

    # Métodos públicos
    # Declaração de método que exibe os atributos no output fazendo polimorfismo com a superclasse
    def __str__(self):
        return f"{self.nome} - {self.ano}  - {self.duracao} - {self.likes}"
    # Declaração de método que exibe os atributos em forma de representação de objeto
    def __repr__(self):
        return f"Filme nome={self.nome},ano={self.ano},duracao={self.duracao},likes{self.likes}"
        
    # Métodos getter e setter
    # Métodos getter
    @property
    def duracao(self):
        return self.__duracao
    
    # Métodos setter
    @duracao.setter
    def duracao(self, valor):
        self.__duracao = valor
