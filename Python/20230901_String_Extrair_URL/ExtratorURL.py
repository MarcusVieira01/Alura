class ExtratorURL:
    # Declaração de construtor
    def __init__(self, url):
        self.__url = self.sanitizaURL(url)
        self.__urlValidada = self.validaURL()

    # Declaração de métodos
    # Realiza a limpeza da URL no quesito espaços em branco e caracteres especiais
    def sanitizaURL(self, url):
        return url.strip()
    
    # Retorna a URL base
    def getURLBase(self):
        return self.url[0 : self.url.find("?")]
    
    # Retorna URL com os parâmetros
    def getURLParametros(self):
        return self.url[self.url.find("?") + 1 : len(self.url)]
    
    # Retorna o valor do Parâmetro da URL inserido
    def getValorParametro(self, parametro):
        # Atribui o split no caractere "&" do retorno do método getURLParametros()
        arrayParametros = self.getURLParametros().split("&")
        # Loop FOR que splita no caractere "=" cada elemento do arrayParametros e faz insere no condicional, 
        # que verifica se o elemento de índice 0 é igual ao valor do parametro buscado, retornando o elemento de 
        # índice 1 caso True
        for elemento in arrayParametros:
            # Split no caractere "=" do array elemento
            elemento = elemento.split("=")
            # Condicional que realiza a verificação entre o valor do paramentro buscado e o valor do elemento de índice 0
            if elemento[0] == parametro:
                # Se True, retorna o elemento de índice 1
                return elemento[1]
            else:
                continue
    
    # Declaração de método que realiza a validação da UL+RL
    def validaURL(self):
        if self.url == "":
            raise ValueError("A URL está vazia!")
        else:
            return True

    # Declaração de métodos getter e setter para os atributos
    # Declaração de métodos getter
    @property
    def url(self):
        return self.__url
    @property
    def urlValidada(self):
        return self.__urlValidada
    