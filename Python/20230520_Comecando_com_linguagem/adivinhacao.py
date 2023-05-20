# Imprime mensagem de boas vindas
print("Bem vindo ao jogo de adivinhação!")
# Defiçnição do número secreto à ser adivinhado
numeroSecreto = 42
# Evoca o método input e atribui seu valor de retorno à variável chute
chute = input("Digite o seu número: ")
# Condicional que exibirá a mensagem pertinente para cada situação
if numeroSecreto == int(chute):
    print("Você acertou! O número é " + str(numeroSecreto))
elif numeroSecreto > int(chute):
    print("O número secreto é maior que seu chute")
elif numeroSecreto < int(chute):
    print("O número secreto é menor que seu chute")

