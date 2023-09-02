from ContaCorrente import ContaCorrente
from ContaPoupanca import ContaPoupanca
from ContaInvestimento import ContaInvestimento

conta16 = ContaCorrente(16)
conta17 = ContaPoupanca(17)
conta18 = ContaInvestimento(18)


conta16.deposita(1000)

conta17.deposita(2123)

listaContas = [conta16, conta17, conta18]

for conta in listaContas:
    conta.passaMes()

for conta in listaContas:
    print(conta)
