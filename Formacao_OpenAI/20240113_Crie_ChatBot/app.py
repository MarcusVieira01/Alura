from flask import Flask,render_template, request, Response
from time import sleep
import os, openai, dotenv, tiktoken

def bot(prompt, historico):
    maxima_repeticao = 1
    repeticao = 0
    while True:
        try:
            model='gpt-3.5-turbo'
            prompt_do_sistema = f"""
            Você é um chatbot de atendimento a clientes de um e-commerce.
            Você não deve responder perguntas que não sejam dados do ecommerce informado!
            ## Dados do ecommerce:
            {dados_ecommerce}
            ## Histórico:
            {historico}
            """
            tamanhoSaida = 2000
            totalTokensModelo = 4096
            if conta_tokens(prompt_do_sistema) >= totalTokensModelo - tamanhoSaida:
                model = 'gpt-3.5-turbo-16k'
                maxtoken = 10385
                print(model)
                print(f"Quantidade de tokens: {conta_tokens(prompt_do_sistema)}")
            else:
                model='gpt-3.5-turbo'
                maxtoken = 2096
                print(model)
                print(f"Quantidade de tokens: {conta_tokens(prompt_do_sistema)}")
            response = openai.ChatCompletion.create(
                messages=[
                    {
                        "role": "system",
                        "content": prompt_do_sistema
                    },
                    {
                        "role": "user",
                        "content": prompt
                    }
                ],
                stream = True,
                temperature=1,
                max_tokens=maxtoken,
                top_p=1,
                frequency_penalty=0,
                presence_penalty=0,
                model = model)
            return response
        except Exception as erro:
            repeticao += 1
            if repeticao >= maxima_repeticao:
                return "Erro no GPT3: %s" % erro
            print('Erro de comunicação com OpenAI:', erro)
            sleep(1)

def trataResposta(prompt, historico, nome_arquivo):
    respostaParcial = ''
    limiteTokens = 256
    historicoParcial = limita_historico(historico, limiteTokens)
    for resposta in bot(prompt, historicoParcial):
        pedacoResposta = resposta.choices[0].delta.get('content', '')
        if len(pedacoResposta):
            respostaParcial += pedacoResposta
            yield pedacoResposta
    conteudo = f"""
Histórico: {historicoParcial}
usuário: {prompt}
IA: {respostaParcial}
"""
    salva(nome_arquivo, conteudo)

def carrega(nome_arquivo):
    try:
        with open(nome_arquivo, 'r', encoding='utf-8') as arquivo:
            dados = arquivo.read()
            return dados
    except IOError as e:
        print(f"Erro no carregamento do arquivo: {e}")

def salva(nome_arquivo, conteudo):
    try:
        with open(nome_arquivo, 'w', encoding='utf-8') as arquivo:
            arquivo.write(conteudo)
    except IOError as e:
        print(f"Erro ao salvar o arquivo: {e}")

## Comentado para limitação do histórico funcionar
# def salva(nome_arquivo, conteudo):
#     try:
#         with open(nome_arquivo, 'a', encoding='utf-8') as arquivo:
#             arquivo.write(conteudo)
#     except IOError as e:
#         print(f"Erro ao salvar o arquivo: {e}")

def conta_tokens(prompt):
    codificador = tiktoken.encoding_for_model("gpt-3.5-turbo")
    lista_de_tokens = codificador.encode(prompt)
    contagem = len(lista_de_tokens)
    return contagem

def limita_historico(historico, limiteTokens):
    totalTokens = 0
    historicoParcial = ''
    for linha in reversed(historico.split('\n')):
        tokensLinha = conta_tokens(linha)
        totalTokens = totalTokens + tokensLinha
        if (totalTokens > limiteTokens):
            break
        historicoParcial += linha + historicoParcial
    return historicoParcial


app = Flask(__name__)
app.secret_key = 'alura'

dotenv.load_dotenv("D:/Repositorios/Alura/Formacao_OpenAI/20240113_Crie_ChatBot/.env")

openai.api_key = os.getenv("OPENAI_API_KEY")

dados_ecommerce = carrega('dados_ecommerce.txt')

print(f"Quantidade de tokens do arquivo dados_ecommerce: {conta_tokens(dados_ecommerce)}")

@app.route("/")
def home():
    return render_template("index.html")

@app.route("/chat", methods = ['POST'])
def chat():
    prompt = request.json['msg']
    nomeArquivo = 'historico.txt'
    historico = ''
    if os.path.exists(nomeArquivo):
        historico = carrega(nomeArquivo)
    return Response(trataResposta(prompt, historico, nomeArquivo), mimetype = 'text/event-stream')

    ## Com ativação do stream = True, o código abaixo ficou obsoleto
    # print(f"\nMensagem cliente: {request.json['msg']}\n")
    # resposta_chat = bot(request.json['msg']).choices[0].message.content
    # print(f"\nResposta do chatbot: {resposta_chat}\n")

    # return resposta_chat

@app.route('/limparhistorico', methods = ['POST'])
def limparhistorico():
    nomeArquivo = 'historico.txt'
    if os.path.exists(nomeArquivo):
        os.remove(nomeArquivo)
        print(f"Arquivo {nomeArquivo} removido!")
    else:
        print(f"Arquivo{nomeArquivo} não encontrado")
    return{}

if __name__ == "__main__":
    app.run(debug = True)
