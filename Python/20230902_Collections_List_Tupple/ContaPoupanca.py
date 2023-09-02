from Conta import Conta

class ContaPoupanca(Conta):
    #
    def passaMes(self):
        self.saldo *= 1.01
        self.saldo -= 3