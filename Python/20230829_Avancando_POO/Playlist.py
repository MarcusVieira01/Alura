class Playlist:
    # Declaração de construtor
    def __init__(self, nome, listaProgramas):
        self.__nome = nome
        self.__listaProgramas = listaProgramas

    # Declaração de métodos públicos
    # Declaração de método que forma um objeto iterável dentro da classe Playlist
    def __getitem__(self, item):
        return self.__listaProgramas[item]
    
    # Declaração de métodos getter e setter conforme a necessidade
    # Métodos getter
    @property
    def nome(self):
        return self.__nome
    @property
    def listaProgramas(self):
        return self.__listaProgramas
    @property
    def tamanhoLista(self):
        return len(self.__listaProgramas)
    
    # Métodos setter
    @nome.setter
    def nome(self, valor):
        self.__nome = valor
