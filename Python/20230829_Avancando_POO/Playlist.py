class Playlist(list):
    # Declaração de construtor
    def __init__(self, nome, listaProgramas):
        super().__init__(listaProgramas)
        self.__nome = nome

    # Declaração de métodos públicos
    
    
    # Declaração de métodos getter e setter conforme a necessidade
    # Métodos getter
    @property
    def nome(self):
        return self.__nome
    
    # Métodos setter
    @nome.setter
    def nome (self, valor):
        self.__nome = valor
