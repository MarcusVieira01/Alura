from ProgramaTV import ProgramaTV

class Serie(ProgramaTV):
    # Declaração do construtor
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome, ano)
        self.__temporadas = temporadas

    # Métodos públicos
    # Declaração de método que exibe os atributos no output fazendo polimorfismo com a superclasse
    def __str__(self):
        return f"{self.nome} - {self.ano}  - {self.temporadas} - {self.likes}"
    # Declaração de método que exibe os atributos em forma de representação de objeto
    def __repr__(self):
        return f"Serie nome={self.nome},ano={self.ano},temporadas={self.temporadas},likes{self.likes}"

    # Métodos getter e setter
    # Métodos getter"
    @property
    def temporadas(self):
        return self.__temporadas
    
    # Métodos setter
    @temporadas.setter
    def temporadas(self, valor):
        self.__temporadas = valor
