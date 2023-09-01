class Playlist:
    # Declaração de construtor
    def __init__(self, nome, listaProgramas):
        self.__nome = nome
        self.__listaProgramas = listaProgramas

    # Declaração de métodos públicos
    # Declaração de método que retorna o tamanho da estrutura de dados listaProgramas
    def tamanho(self):
        return len(self.listaProgramas)
    
    # Declaração de métodos getter e setter conforme a necessidade
    #Métodos getter
    @property
    def nome(self):
        return self.__nome
    @property
    def listaProgramas(self):
        return self.__listaProgramas
