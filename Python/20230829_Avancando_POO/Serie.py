class Serie:
    # Declaração do construtor
    def __init__(self, nome, ano, temporadas):
        self.__nome = nome
        self.__ano = ano
        self.__temporadas = temporadas
        self.__likes = 0

    # Métodos públicos
    # Método que adiciona um like
    def darLike(self):
        self.__likes += 1

    # Métodos getter e setter
    # Métodos getter
    @property
    def nome(self):
        return self.__nome
    @property
    def ano(self):
        return self.__ano
    @property
    def temporadas(self):
        return self.__temporadas
    @property
    def likes(self):
        return self.__likes
    
    # Métodos setter
    @nome.setter
    def nome(self,valor):
        self.__nome = valor
    @ano.setter
    def ano(self, valor):
        self.__ano = valor
    @temporadas.setter
    def duracao(self, valor):
        self.__temporadas = valor
    @likes.setter
    def likes(self, valor):
        self.__likes = valor
