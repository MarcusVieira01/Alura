class Conta:
    # Declaração de classe construtora
    def __init__(self, numero, titular, saldo, limite):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.limite = limite

    def extrato(self):
        print("O saldo da conta {} é R${}.".format(self.titular, self.saldo))

    def deposita(self, valorDeposita):
        self.saldo += valorDeposita

    def saca(self, valorSaca):
        self.saldo -= valorSaca

    