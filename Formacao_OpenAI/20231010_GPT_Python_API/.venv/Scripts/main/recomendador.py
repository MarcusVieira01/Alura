# Importação de bibliotecas externas
import os
import openai
import dotenv
import json

# Definição de função que carrega os dados de um arquivo em uma variável, com tratamento de exceção
def carrega(nome_do_arquivo):
    try:
        with open(nome_do_arquivo, "r") as arquivo:
            dados = arquivo.read()
            return dados
    except IOError as e:
        print(f"Erro no carregamento de arquivo: {e}")

# Definição de função que salva um conteúdo em um arquivo, com tratamento de exceção
def salva(nome_do_arquivo, conteudo):
    try:
        with open(nome_do_arquivo, "w", encoding="utf-8") as arquivo:
            arquivo.write(conteudo)
    except IOError as e:
        print(f"Erro ao salvar arquivo: {e}")

# Definição de função que identifica perfis de clientes construindo um chat e remetendo uma request 
# com os prompts de sistema e usuário
def identifica_perfis(lista_de_compras_por_cliente):
    prompt_sistema = """
    Identifique o perfil de compra para cada cliente a seguir.

    O formato de saída deve ser em JSON:

    {
        "clientes":"[
            {
                "nome":"nome do cliente",
                "perfil":"descreva o perfil do cliente em 3 palavras"
            }
        ]
    }
    """
    # Construção de um chat com os papéis e prompts de sistema e usuário, atribuindo a mensagem de 
    # resposta à variável
    resposta = openai.ChatCompletion.create(
        # Declaração de variável com atribuição do modelo de GPT escolhido
        model="gpt-3.5-turbo",
        # Declaração de variável e atribuição de uma lista de dicionários com os prompts e papeis 
        # de sistema e usuário
        messages=[
            {
                "role": "system",
                "content": prompt_sistema
            },
            {
                "role": "user",
                "content": lista_de_compras_por_cliente
            }
        ]
    )
    # Retorno do valor de retorno do chat
    return resposta.choices[0].message.content
    
# Carregamento das variáveis de ambiente
dotenv.load_dotenv()
# Atribuição do valor da variável de ambiente OPENAI_API_KEY ao atributo api_key
openai.api_key = os.getenv("OPENAI_API_KEY")

# Declaração de variável e atribuição dos dados de retorno da função carrega()
lista_de_compras_por_cliente = carrega(".venv/gpt-python-1-dados/lista_de_compras_10_clientes.csv")

# Declaração de variável e atribuição do valor de retorno da função identifica_perfis
conteudo = identifica_perfis(lista_de_compras_por_cliente)

# Exibição do valor da varikável conteudo
print(conteudo)