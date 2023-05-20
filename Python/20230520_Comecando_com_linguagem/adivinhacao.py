# Imprime mensagem de boas vindas
print("Bem vindo ao jofo de adivinhação!")
# Defiçnição do número secreto à ser adivinhado
numeroSecreto = 42
# Evoca o método input e atribui seu valor de retorno à variável chute
chute = input("Digite o seu número: ")
# Condicional que exibirá a mensagem pertinente
if numeroSecreto == chute:
    print("Você acertou! O número é " + numeroSecreto)
else:
    print("ERRROOOOUUUU!")

