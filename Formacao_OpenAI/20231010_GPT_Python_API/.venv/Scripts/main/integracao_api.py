# Importação de bibliotecas externas
import openai

# Chamada de atributo e atribuição do valor da API key da OpenAI
openai.api_key = "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"


# Criação, usando o objeto ChatCompletion, de um chat com a IA da OpenAI
response = openai.ChatCompletion.create(
    # Definição do modelo de IA a ser usado
    model="gpt-3.5-turbo",
    # Definição de um array de dicionários com os parâmetros de configuração
    messages=[
        # Definição de dicionário para a caixa System do Playground
        {
            "role":"system",
            "content":"Gere nomes de produtos fictícios sem descrição de acordo com a requisição do usuário."
        },
        # Definição de dicionário para o prompt do usuário
        {
            "role":"user",
            "content":"Gere 5 produtos"
        }
    ]
)

print(response)
