from flask import Flask,render_template, request, Response
from time import sleep
import os, openai, dotenv

def bot(prompt):
    maxima_repeticao = 1
    repeticao = 0
    while True:
        try:
            model='gpt-3.5-turbo-16k'
            prompt_do_sistema = f"""
            Você é um chatbot de atendimento a clientes de um e-commerce.
            Você não deve responder perguntas que não sejam dados do ecommerce informado!
            """
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
                # stream = True,
                temperature=1,
                max_tokens=256,
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


app = Flask(__name__)
app.secret_key = 'alura'

dotenv.load_dotenv("D:/Repositorios/Alura/Formacao_OpenAI/20240113_Crie_ChatBot/.env")

openai.api_key = os.getenv("OPENAI_API_KEY")

@app.route("/")
def home():
    return render_template("index.html")

@app.route("/chat", methods = ['POST'])
def chat():
    print(f"\nMensagem cliente: {request.json['msg']}\n")
    resposta_chat = bot(request.json['msg']).choices[0].message.content
    print(f"\nResposta do chatbot: {resposta_chat}\n")

    return resposta_chat

if __name__ == "__main__":
    app.run(debug = True)
