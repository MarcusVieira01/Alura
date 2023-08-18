class personagem:
    def __init__(self, nome, idade, forca, destreza, vitalidade, arma):
        self.__nome = nome
        self.__idade = idade
        self.__forca = forca
        self.__destreza = destreza
        self.__vitalidade = vitalidade
        self.__arma = arma
    
    def atacar(self, jogada_dado):
        fator_ataque = self.__forca / jogada_dado


    def receber_dano(self,jogada_dado, dano_oponente):
        fator_esquiva = jogada_dado / self.__destreza
        dano = dano_oponente * fator_esquiva
        ## Implementar método setter para vitalidade
        

    