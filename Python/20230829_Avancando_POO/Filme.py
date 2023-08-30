class Filme:
    # Declaração do construtor
    def __init__(self, nome, ano, duracao):
        self.__nome = nome
        self.__ano = ano
        self.__duracao = duracao
        self.likes = 0

    # Métodos públicos
    # Método que adiciona um like
    def darLike(self):
        self.likes += 1

    # Métodos getter e setter
    # Métodos getter
    @property
    def nome(self):
        return self.__nome
    @property
    def ano(self):
        return self.__ano
    @property
    def duracao(self):
        return self.__duracao
    
    # Métodos setter
    @nome.setter
    def nome(self,valor):
        self.__nome = valor
    @ano.setter
    def ano(self, valor):
        self.__ano = valor
    @duracao.setter
    def duracao(self, valor):
        self.__duracao = valor