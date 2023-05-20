# Imprime mensagem de boas vindas
print("Bem vindo ao jogo de adivinhação!")
# Defiçnição do número secreto à ser adivinhado
numeroSecreto = 42
# Evoca o método input e atribui seu valor de retorno à variável chute
chute = input("Digite o seu número: ")
# Condicional que exibirá a mensagem pertinente
if numeroSecreto == int(chute):
    print("Você acertou! O número é " + str(numeroSecreto))
else:
    print("ERRROOOOUUUU!")
