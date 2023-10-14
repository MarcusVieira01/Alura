# Importação de bibliotecas externas
import openai
import dotenv
import os

# Chamada da função load_dotenv() para carga das variáveis de ambiente
dotenv.load_dotenv()

# Chamada de atributo e atribuição do valor da API key da OpenAI retornada pelo método getenv()
openai.api_key = os.getenv("OPENAI_API_KEY")
# Chamada de atributo e atribuição do valor da ORGANIZATION cadastrada dentro do OpenAI
openai.organization = os.getenv("ORGANIZATION")

# Atribuição de uma longstring à variável sendo o prompt de configuração do sistema
prompt_sistema = """ 
                    Você é um caracterizador de produtos, onde deve escolher uma categoria abaixo:
                    ###Lista de categorias###
                    1. Beleza
                    2. Entreterimento
                    3. Esportes
                    4. Outros
                    ###Exemplo###
                    Bola de tênis
                    Esportes
                 """

# Criação, usando o objeto ChatCompletion, de um chat com a IA da OpenAI
response = openai.ChatCompletion.create(
    # Definição do modelo de IA a ser usado
    model = "gpt-3.5-turbo",
    # Definição de um array de dicionários com os parâmetros de configuração
    messages = [
        {
            "role":"system",
            "content":prompt_sistema
        },
        # Definição de dicionário para o prompt do usuário
        {
            "role":"user",
            "content":"Tablet"
        }
    ],
    # Declaração dos parâmetros de configuração da resposta
    temperature = 1,
    max_tokens = 256,
    top_p = 1,
    frequency_penalty = 0,
    presence_penalty = 0,
    n = 5
)

for i in range(0, 5):
    print(response.choices[i].message.content)
    print("-------")

print(f"Tokens usados:{response.usage.total_tokens}")
