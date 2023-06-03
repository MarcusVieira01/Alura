# Importação de pacotes externos
import random

# Imprime mensagem de boas vindas
print("Bem vindo ao jogo de adivinhação!")

# Definição do número secreto à ser adivinhado
numero_secreto = random.randint(1,50)
tentativas = 3

# Evoca o método input e atribui seu valor de retorno à variável chute
chute = int(input("Digite o seu número: "))

# Loop while que fara iterações enquanto a condição for true
for palpites in range(1, tentativas):
    palpites+=1
    # Condicional que exibirá a mensagem pertinente
    if chute == numero_secreto:
        print("Acertô mizerarvi!")
        break
    elif chute > numero_secreto:
        print(" Seu chute é maior que o número secreto!")
        chute = int(input(f"Digite o seu {palpites}º número: "))
    elif chute < numero_secreto:
        print(" Seu chute é menor que o número secreto!")
        chute = int(input(f"Digite o seu {palpites}º número: "))

# Condicional que exibirá a pensagem de jogo eprdido
if palpites >= 3:
    print(f"Erroooooou tudo! O número secreto é {numero_secreto}")
