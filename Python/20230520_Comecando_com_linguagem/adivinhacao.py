# Imprime mensagem de boas vindas
print("Bem vindo ao jogo de adivinhação!")

# Definição do número secreto à ser adivinhado
numeroSecreto = 42
tentativas = 3

# Evoca o método input e atribui seu valor de retorno à variável chute
chute = int(input("Digite o seu número: "))

# Loop while que fara iterações enquanto a condição for true
for palpites in range(1, tentativas):
    palpites+=1
    # Condicional que exibirá a mensagem pertinente
    if chute == numeroSecreto:
        print("Acertô mizerarvi!")
        break
    elif chute > numeroSecreto:
        print(" Seu chute é maior que o número secreto!")
        chute = input("Digite o seu {}º número: ".format(palpites))
    elif chute < numeroSecreto:
        print(" Seu chute é menor que o número secreto!")
        chute = input("Digite o seu {}º número: ".format(palpites))
        
# Condicional que exibirá a pensagem de jogo eprdido
if palpites >= 3:
    print("Erroooooou tudo!")