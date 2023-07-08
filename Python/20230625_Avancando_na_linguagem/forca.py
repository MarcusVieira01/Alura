'''Descrição do módulo: Jogo de forca'''
def jogar():
    '''Descrição da função jogar: Definição de função com a lógica do jogo de forca'''
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    # Declaração de variáveis e suas inicializações
    palavra_secreta = "banana"
    enforcou = False
    acertou = False
    letras_acertadas = ["_","_","_","_","_","_"]

    #
    print(letras_acertadas,)

    # Loop que executará a lógica do jogo
    while(not enforcou and not acertou):
        # Captura o input do usuário e atribui à variável executando limpeza de dados
        chute = input("Qual a letra?")
        chute = chute.lower()
        chute = chute.strip()
        # Declaração de variável local ao loop while
        index = 0
        # Loop que varrerá a variável palavra_secreta e executará o condicional que exibirá qual a
        # letra chutada e o índice na palavra secreta, caso seja true
        for letra in palavra_secreta:
            # Condicional que verificará se o chute tem mesmo valor da letra no lacço for
            if chute == letra:
                letras_acertadas[index] = letra
            # Incremento unitário na variável index
            index += 1
        # 
        print(letras_acertadas)





    print("Fim do jogo")

# Condicional que verificará se a variável interna do Python possui um valor específico, onde caso true executará a função.
if __name__ == "__main__":
    jogar()
