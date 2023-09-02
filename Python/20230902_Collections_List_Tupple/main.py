from ContaCorrente import ContaCorrente
from ContaPoupanca import ContaPoupanca
from ContaInvestimento import ContaInvestimento

conta16 = ContaCorrente(16)
conta17 = ContaPoupanca(17)
conta18 = ContaInvestimento(18)
conta19 = ContaCorrente(19)

conta17.deposita(1000)
conta18.deposita(1234)

listaContas = [conta16, conta17, conta18, conta19]

for conta in listaContas:
    conta.passaMes()

for conta in listaContas:
    print(conta)

print("Ordenação:")
for conta in sorted(listaContas):
    print(conta)
