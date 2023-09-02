from ContaCorrente import ContaCorrente
from ContaPoupanca import ContaPoupanca

conta16 = ContaCorrente(16)
conta17 = ContaPoupanca(17)

conta16.deposita(1000)

conta17.deposita(2123)

listaContas = [conta16, conta17]

for conta in listaContas:
    conta.passaMes()

for conta in listaContas:
    print(conta)
