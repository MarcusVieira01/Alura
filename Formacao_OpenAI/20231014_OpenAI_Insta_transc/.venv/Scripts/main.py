# Importação de bibliotecas externas
import openai, os
from dotenv import load_dotenv

# Definição de método que fará a transcrição do áudio selecionado usando a biblioteca OpenAI
def openai_trasncrever(caminho_audio, nome_arquivo, openai, modelo):
    # Exibição de mensagem
    print("Executando a transcrição!")
    # Declaração de referência ao objeto retornado pelo método open(args) sendo a representação do arquivo no path
    audio = open(caminho_audio, "rb")
    # Declaração de variável e atribuição do retorno do método openai.Audio.transcribe sendo a transcrição do áudio passado como atributo
    response = openai.Audio.transcribe(
        api_key = openai.api_key,
        model = modelo,
        file = audio        
    )
    # Estrutura criada para salvar o conteúdo da variável response em um arquivo de texto
    with open(f".venv/{nome_arquivo}-transcricao.txt", "w", encoding="utf-8") as arquivo_transcrito:
        arquivo_transcrito.write(response.text)
    # Retorno do conteúdo da variável response como um texto
    return response.text


# Definição de função main
def main():
    # Chamada de função que carrega as variáveis de ambiente do arquivo .env
    load_dotenv()
    # Declaração de variáveis e atribuição de suas inicializações
    caminho_audio = ".venv/media/teste_ia.mp3"
    nome_arquivo = "teste_ia"
    url_podcast = "https://www.hipsters.tech/testes-de-software-e-inteligencia-artificial-hipsters-154/"
    # Definição de qual modelo do Whisper será usado
    modelo_whisper = "whisper-1"
    # Atribuição do valor capturado da variável de ambiente ao objeto openai.api_key, representando a chave da API
    openai.api_key = os.getenv("OPENAI_API_KEY")
    # Declaração de variável e atribuição do valor de retorno do método openai_transcrever
    transcricao = openai_trasncrever(caminho_audio, nome_arquivo, openai, modelo_whisper)
    





# Chamada para execução da função main automaticamente ao chamar o arquivo main
if __name__ == "__main__":
    main()
