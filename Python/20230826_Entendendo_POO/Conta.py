# Classe que abstrai o conceito de conta bancária com os atributos __numero de iedentificação, titular, saldo atual e limite de crédito"
class Conta:
    # Declaração de construtor com os atributos da classe
    def __init__(self, numero, titular, saldo, limite):
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite
        self.__codigoBanco = "001"

    # Métodos públicos
    # Declaração de método que exibe o titular e o saldo da conta
    def extrato(self):
        print("O saldo da conta {} é R${}.".format(self.__titular, self.__saldo))
    # Declaração de método que fará o incremento de um valor ao atributo saldo
    def deposita(self, valorDeposita):
        self.__saldo += valorDeposita
    # Declaração de método que fará o decréscimo de um valor ao atributo saldo
    def saca(self, valorSaca):
        if(self.__verificaLimite(valorSaca)):
            self.__saldo -= valorSaca
        else:
            print("Valor requisitado maior do que a soma do saldo e do limite!")
    # Declaração de método que fará a transferência de valor entre a conta origem (evocadora do método) e a conta de destino
    def transfere(self, destino, valor):
        self.saca(valor)
        destino.deposita(valor)
    
    # Métodos Privados
    # Método auxiliar que fará a validação se há saldo para realizar o saque
    def __verificaLimite(self, valorSacado):
        return valorSacado <= (self.__saldo + self.__limite)
    
    # Métodos estáticos
    #
    @staticmethod
    def codigoBanco():
        return {'BB': '001', 'Caixa': '104', 'Bradesco':'237'}
            
    #Declaração de métodos getter e setter usando annotations
    # Métodos getter
    @property
    def numero(self):
        return self.__numero
    @property
    def titular(self):
        return self.__titular
    @property
    def saldo(self):
        return self.__saldo
    @property
    def limite(self):
        return self.__limite
    @property
    def codigoBancoConta(self):
        return self.__codigoBanco
    # Métodos setter
    @limite.setter
    def limite(self, valor):
        self.__limite = valor

        
    