from abc import ABCMeta, abstractmethod
from functools import total_ordering

@total_ordering
class Conta(metaclass=ABCMeta):
    ## Declaração de dunder methods
    # Declaração de construtor
    def __init__(self, codigo):
        self.__codigo = codigo
        self.__saldo = 0
    # Declaração de método que fará a representação textual do objeto
    def __str__(self):
        return f'Conta (codigo={self.codigo}, saldo={self.__saldo})'
    # Declaração de método que retorna a comparação entre atributos de 
    # objetos diferentes, podendo ser ordenado
    def __lt__(self, other):
        return self.saldo < other.saldo
    
    # Declaração de método abstrado
    @abstractmethod
    def passaMes(self):
        pass

    ## Declaração de métodos getter e setter
    # Getter
    @property
    def codigo(self):
        return self.__codigo
    @property
    def saldo(self):
        return self.__saldo
    #Setter
    @saldo.setter
    def saldo(self, valor):
        self.__saldo = valor
    
    ## Declaração de métodos públicos
    # Declaração de método que fará a ação de depositar um valor na conta corrente
    def deposita(self, valorDepositado):
        self.saldo = self.saldo + valorDepositado
        
