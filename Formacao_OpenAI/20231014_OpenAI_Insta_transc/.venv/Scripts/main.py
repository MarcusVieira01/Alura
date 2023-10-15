# Importação de bibliotecas externas
import openai
from dotenv import load_dotenv
import os

# Definição de função main
def main():
    # Chamada de função que carrega as variáveis de ambiente do arquivo .env
    load_dotenv()
    # Declaração de variáveis e atribuição de suas inicializações
    caminha_audio = ".venv/media/COLOCAR O ARQUIVO DE ÁUDIO.mp3"
    nome_arquivo = "PREFIXO DO ARQUIVOD E ÁUDIO"
    url = "https://www.hipsters.tech/testes-de-software-e-inteligencia-artificial-hipsters-154/"

    openai.api_key = os.getenv("OPENAI_API_KEY")

    





# Chamada para execução da função main automáticamente ao chamar o arquivo main
if __name__ == "__main__":
    main()
