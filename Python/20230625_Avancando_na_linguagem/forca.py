'''Descrição do módulo: Jogo de forca'''
#
import random

def jogar():
    '''Descrição da função jogar: Definição de função com a lógica do jogo de forca'''
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    # Abertura do arquivo txt como apenas leitura e atribuição à variável arquivo com uso de with, para fechamento automático do arquivo
    with open("./palavras.txt", "r", encoding="utf-8") as arquivo:

        # Declaração de lista vazia
        palavras = []

        # Loop que iterará o arquivo e atribuirá cada valor de sua linha à lista palavras
        for linha in arquivo:
            linha = linha.strip()
            palavras.append(linha)

    # Atribuição à variável indice o valor pseudorandômico de retorno da função randrange(args)
    indice = random.randrange(0,len(palavras),1)

    # Atribuição do valor do elemento dado pelo conteúdo da variável indice
    palavra_secreta = palavras[indice].upper()

    # Declaração de variáveis e suas inicializações
    enforcou = False
    acertou = False
    erros = 0

    # Loop interno à lista para geração de _ para cada caractere do conteúdo da variável palavra_secreta
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
