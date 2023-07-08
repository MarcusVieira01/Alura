'''Descrição do módulo: Jogo de forca'''
def jogar():
    '''Descrição da função jogar: Definição de função com a lógica do jogo de forca'''
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    # Declaração de variáveis e suas inicializações
    palavra_secreta = "banana".upper()
    enforcou = False
    acertou = False
    erros = 0
    #
    letras_acertadas = ["_" for letra in palavra_secreta]

    # Exibe a sequencia contida na lista letras_acertadas
    print(letras_acertadas)

    # Loop que executará a lógica do jogo
    while(not enforcou and not acertou):
        # Captura o input do usuário e atribui à variável executando limpeza de dados
        chute = input("Qual a letra?")
        chute = chute.strip().upper()
        # Condicional define se a letra chutada está dentro da cadeia contida em palavra_secreta. Caso false, soma 1 no acumulador de erros
        if chute in palavra_secreta:
            # Declaração de variável local ao loop while
            index = 0
            # Loop que varrerá a variável palavra_secreta e executará o condicional que exibirá qual a letra chutada e o índice na palavra secreta, caso seja true
            for letra in palavra_secreta:
                # Condicional que verificará se o chute tem mesmo valor da letra no lacço for
                if chute == letra:
                    letras_acertadas[index] = letra
                # Incremento unitário na variável index
                index += 1
        else:
            erros += 1
        # Atribuição do valor de retorno da comparação lógica para definir se o jogador perdeu
        enforcou = erros == len(palavra_secreta)
        # Atribuição do valor de retorno da comparação lógica para definir se o jogador ganhou
        acertou = "_" not in letras_acertadas
        # Exibição da última atualização do conteúdo da variáveç letras_acertadas
        print(letras_acertadas)
    # Exibição de mensagem
    print("Fim do jogo")

# Condicional que verificará se a variável interna do Python possui um valor específico, onde caso true executará a função.
if __name__ == "__main__":
    jogar()
