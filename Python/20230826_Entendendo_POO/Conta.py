#Classe que abstrai o conceito de conta bancária com os atributos numero de iedentificação, titular, saldo atual e limite de crédito"
class Conta:
    # Declaração de construtor com os atributos da classe
    def __init__(self, numero, titular, saldo, limite):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.limite = limite
    # Declaração de método que exibe o titular e o saldo da conta
    def extrato(self):
        print("O saldo da conta {} é R${}.".format(self.titular, self.saldo))
    # Declaração de método que fará o incremento de um valor ao atributo saldo
    def deposita(self, valorDeposita):
        self.saldo += valorDeposita
    # Declaração de método que fará o decréscimo de um valor ao atributo saldo
    def saca(self, valorSaca):
        self.saldo -= valorSaca

    