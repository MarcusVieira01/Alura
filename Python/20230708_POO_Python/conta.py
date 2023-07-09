'''DOCSTRING do pacote'''
class ContaCorrente:
    '''DOCSTRING da classe'''
    # Construtor
    def __init__(self, numero, titular, saldo, limite):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.limite = limite

    def extrato(self):
        '''DOCSTRING do método extrato'''
        print(f"Saldo {self.saldo} do titular {self.titular}")

    def deposita(self, valor_depositado):
        '''DOCSTRING do método deposita'''
        self.extrato()
        self.saldo += valor_depositado
        self.extrato()

    def saca(self, valor_sacado):
        '''DOCSTRING do método saca'''
        self.extrato()
        self.saldo += valor_sacado
        self.extrato()
        