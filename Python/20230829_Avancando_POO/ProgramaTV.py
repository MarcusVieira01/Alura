class ProgramaTV:
    def __init__(self, nome, ano):
        self.__nome = nome
        self.__ano = ano
        self.__likes = 0
    
    # Declaração de métodos públicos
    # Declaração de método que incrementa um ao atributo like
    def darLike(self):
        self.__likes += 1
    # Declaração de método que exibe os atributos no output
    def __str__(self):
        return f"{self.nome} - {self.ano} - {self.likes}"
    
    def __repr__(self) -> str:
        return f"Programa nome={self.nome},ano={self.ano},likes={self.likes}"

    # Declaração de métodos setter e getter
    # Getters
    @property
    def nome(self):
        return self.__nome
    @property
    def ano(self):
        return self.__ano
    @property
    def likes(self):
        return self.__likes
    
    #Setters
    @nome.setter
    def nome(self, valor):
        self.__nome = valor
    @ano.setter
    def ano(self, valor):
        self.__ano = valor
    @likes.setter
    def likes(self, valor):
        self.__likes = valor