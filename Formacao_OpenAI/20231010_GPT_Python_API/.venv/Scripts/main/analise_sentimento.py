# Importação de bibliotecas externas
import os
import openai
import dotenv

# Definição de função que carrega o conteúdo do arquivo desejado na variável dados, com lançamento de exceção 
def carrega(nome_do_arquivo):
    try:
        with open(nome_do_arquivo, "r") as arquivo:
            dados = arquivo.read()
            return dados
    except IOError as e:
        print(f"Erro no carregamento de arquivo: {e}")

# Definição de função que salva um conteúdo em um arquivo de texto, com lançamento de exceção
def salva(nome_do_arquivo, conteudo):
    try:
        with open(nome_do_arquivo, "w", encoding="utf-8") as arquivo:
            arquivo.write(conteudo)
    except IOError as e:
        print(f"Erro ao salvar arquivo: {e}")

# Carretamento das variáveis de ambiente
dotenv.load_dotenv()
# Atribuiçã do valor da variável de ambiente OPENAI_API_KEY ao atributo api_key
openai.api_key = os.getenv("OPENAI_API_KEY")

# Declaração de variável e atribuição de valor
nome_do_produto = "Tapete de yoga"

# Declaração de variável que representará o prompt do sistema e atribuição de prompt
prompt_sistema = """
Você é um analisador de sentimentos de avaliações de produtos.
Escreva um parágrafo com até 50 palavras resumindo as avaliações e depois atribua qual o sentimento geral para o produto.
Identifique também 3 pontos fortes e 3 pontos fracos identificados a partir das avaliações.

#### Formato de saída

Nome do produto: 
Resumo das avaliações:
Sentimento geral: [AQUI DEVE SER POSITIVO, NEGATIVO E NEUTRO]
Pontos fortes: [3 BULLET POINTS]
Pontos fracos: [3 BULLET POINTS]
"""

# Declaração de variável que representará o prompt do usuário e atribuição do conteúdo de 
# retorno da função de carregamento de arquivo
prompt_usuario = carrega(f".venv/gpt-python-1-dados/avaliacoes-{nome_do_produto}.txt")

# Construção de um chat com modelo fixo, sem parâmetros
response = openai.ChatCompletion.create(
    # Declaração de variável e atribuição de valor do modelo escolhido
    model = "gpt-3.5-turbo",
    # Declaração de variável tipo lista de dicionários com os papéis e prompts
    messages = [
        {
            "role": "system",
            "content": prompt_sistema
        },
        {
            "role": "user",
            "content": prompt_usuario
        }
    ]
)

# Chamada de função que cria um arquivo com os dados de retorno do chat
salva(f".venv/Scripts/main/analise-{nome_do_produto}.txt", response.choices[0].message.content)