# Importação de bibliotecas externas
import openai, os, requests
from pydub import AudioSegment
from dotenv import load_dotenv
from PIL import Image

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
    # Exibição de mensagem
    print("Transcrição finalizada!")
    # Retorno do conteúdo da variável response como um texto
    return response.text

def openai_trasncrever_longo(caminho_audio_longo, nome_arquivo, openai, modelo):
    # Exibição de mensagem
    print("Cortando o áudio!")

    list_arquivos_audio = ferramenta_separar_audio(nome_arquivo, caminho_audio_longo)
    list_pedacos = []
    contador = 1
    
    for pedaco in list_arquivos_audio:
        print(f"Iniciando as transcrição {contador}!")
        # Declaração de referência ao objeto retornado pelo método open(args) sendo a representação do arquivo no path
        audio = open(f"D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv/media/{pedaco}", "rb")

        # Declaração de variável e atribuição do retorno do método openai.Audio.transcribe sendo a transcrição do áudio passado como atributo
        response = openai.Audio.transcribe(
            api_key = openai.api_key,
            model = modelo,
            file = audio        
        )
        list_pedacos.append(response.text)

        print(f"Transcrição {contador} finalizada!")

        contador += 1

    transcricao = "".join(list_pedacos)
    
    # Estrutura criada para salvar o conteúdo da variável response em um arquivo de texto
    with open(f".venv/{nome_arquivo}-transcricao.txt", "w", encoding="utf-8") as arquivo_transcrito:
        arquivo_transcrito.write(transcricao)
    # Exibição de mensagem
    print("Transcrição finalizada!")
    # Retorno do conteúdo da variável response como um texto
    return transcricao

# Definição de função que resumirá uma transcrição de áudio
def openia_gpt_resumir(nome_arquivo, transcricao, openai, modelo_gpt):
    # Exibição de mensagem
    print("Resumindo a transcrição!")
    # Declaração de variáveis e atribuição dos valores de prompt para o sistema e o usuário
    prompt_sistema = """
    Assuma que você é um digital influencer digital e que está construíndo conteúdos das áreas de tecnologia em uma plataforma de áudio (podcast).

    Os textos produzidos devem levar em consideração uma peresona que consumirá os conteúdos gerados. Leve em consideração:

    - Seus seguidores são pessoas super conectadas da área de tecnologia, que amam consumir conteúdos relacionados aos principais temas da área de computação.
    - Os textos serão utilizados para convidar pessoas do instagram para consumirem seu conteúdo de áudio
    - O texto deve ser escrito em português do Brasil.
    """
    prompt_usuario = """
    \n Reescreva a transcrição acima para que possa ser postado como uma legenda do Instagram. 
    Ela deve resumir o texto para chamada na rede social. Inclua hashtags.
    """
    # Declaração de variável e atribuição do valor de retorno do método openai.ChatCompletion.create(args)
    response_gpt = openai.ChatCompletion.create(
        model = modelo_gpt,
        messages=[
            {
                "role":"system",
                "content":prompt_sistema
            },
            {
                "role":"user",
                "content":transcricao + prompt_usuario
            }
        ],
        temperature=0.6
    )
    # Declaração de variável e atribuição do valor de retorno do conteúdo da variável response_gpt, extraindo uma das respostas
    resumo_inst = response_gpt["choices"][0]["message"]["content"]
    # Estrutura criada para salvar o conteúdo da variável response em um arquivo de texto
    with open(f".venv/{nome_arquivo}-resumo.txt", "w", encoding="utf-8") as arquivo_resumido:
        arquivo_resumido.write(resumo_inst)
    # Exibição de mensagem
    print("Resumo realizado!")
    # Retorno do conteúdo da variável
    return resumo_inst

def ferramenta_ler_arquivo(path_arquivo, nome_arquivo):
    try:
        with open(f'{path_arquivo}/{nome_arquivo}', 'r') as arquivo:
            return arquivo.read()
    except IOError as e:
        print(f'Erro no carregamento do arquivo {e}')


def openai_gpt_criar_hashtag(nome_arquivo,resumo, openai, modelo_gpt):
    print('Gerando hashtag com OpenAI!')

    prompt_sistema = """
    Assuma que você é um digital influencer digital e que está construíndo conteúdos das áreas de tecnologia em uma plataforma de áudio (podcast).

    Os textos produzidos devem levar em consideração uma peresona que consumirá os conteúdos gerados. Leve em consideração:

    - Seus seguidores são pessoas super conectadas da área de tecnologia, que amam consumir conteúdos relacionados aos principais temas da área de computação.
    - Você deve utilizar o gênero neutro na construção do seu texto
    - Os textos serão utilizados para convidar pessoas do instagram para consumirem seu conteúdo de áudio
    - O texto deve ser escrito em português do Brasil.
    - A saída deve conter 5 hashtags.

    """

    prompt_usuario =f'Aqui está um resumo de um texto "{resumo}". Por favor, gere 5 hashtags que sejam relevantes para este texto e que possam ser publicadas no Instagram.  Por favor, faça isso em português do Brasil '

    # Declaração de variável e atribuição do valor de retorno do método openai.ChatCompletion.create(args)
    response_gpt = openai.ChatCompletion.create(
        model = modelo_gpt,
        messages=[
            {
                "role":"system",
                "content":prompt_sistema
            },
            {
                "role":"user",
                "content":prompt_usuario
            }
        ],
        temperature=0.6
    )
    # Declaração de variável e atribuição do valor de retorno do conteúdo da variável response_gpt, extraindo uma das respostas
    hashtags = response_gpt["choices"][0]["message"]["content"]

    # Estrutura criada para salvar o conteúdo da variável response em um arquivo de texto
    with open(f".venv/{nome_arquivo}_hashtags.txt", "w", encoding="utf-8") as arquivo_resumido:
        arquivo_resumido.write(hashtags)
    # Exibição de mensagem
    print("Hashtag realizado!")
    # Retorno do conteúdo da variável
    return hashtags

def openai_gpt_texto_imagem(nome_arquivo, resumo, modelo_gpt, openai):
    print("Gerando a saida de texto para criacao de imagens com o GPT!")

    prompt_sistema = """

    - A saída deve ser uma única, do tamanho de um tweet, que seja capaz de descrever o conteúdo do texto para que possa ser transcrito como uma imagem.
    - Não inclua hashtags

    """

    prompt_usuario =  f'Reescreva o texto a seguir, em uma frase, para que descrever o texto abaixo em um tweet: {resumo}'

    # Declaração de variável e atribuição do valor de retorno do método openai.ChatCompletion.create(args)
    response_gpt = openai.ChatCompletion.create(
        model = modelo_gpt,
        messages=[
            {
                "role":"system",
                "content":prompt_sistema
            },
            {
                "role":"user",
                "content":prompt_usuario
            }
        ],
        temperature=0.6
    )
    # Declaração de variável e atribuição do valor de retorno do conteúdo da variável response_gpt, extraindo uma das respostas
    resumido = response_gpt["choices"][0]["message"]["content"]

    # Estrutura criada para salvar o conteúdo da variável response em um arquivo de texto
    with open(f".venv/{nome_arquivo}resumo_imagem.txt", "w", encoding="utf-8") as arquivo_resumido:
        arquivo_resumido.write(resumido)
    # Exibição de mensagem
    print("Resumo para imagem realizado!")
    # Retorno do conteúdo da variável
    return resumido

def openai_dalle_gerar_imagem(resolucao, resumo_imagem, qtd_imagens, openai):
    print("Criando imagem via DALL-E")

    prompt_user = f"Uma pintura ultra futurista, textless, 3d que retrate: {resumo_imagem}"
    # prompt_user = "Cena épica de um reino montanhoso, com anões guerreiros em formação de batalha na vanguarda, dragões alados lançando fogo do céu e humanos magos, com seus cajados brilhantes, fortalecendo a defesa."

    response_dalle = openai.Image.create(
        prompt = prompt_user,
        n = qtd_imagens,
        size = resolucao
    )
    
    payload = response_dalle['data']

    print(f"{qtd_imagens} geradas!")

    return payload

def ferramenta_download_imagem(nome_arquivo, imagem_gerada, qtd_imagens):
    lista_nome_imagens = []
    try:
        for contador_imagens in range(0,qtd_imagens):
            print(f"Baixando imagem {contador_imagens + 1}")
            caminho = imagem_gerada[contador_imagens].url
            imagem = requests.get(caminho)

            with open(f"D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv/media/{nome_arquivo}imagem_dalle_{contador_imagens}.png", "wb") as arquivo_imagem:
                arquivo_imagem.write(imagem.content)

            lista_nome_imagens.append(f"{nome_arquivo}imagem_dalle_{contador_imagens}.png")
        return lista_nome_imagens
    except:
        print("Ocorreu um erro!")
        return  None
    finally:
        print("Pocesso de download concluído!")
    
def ferramenta_separar_audio(nome_arquivo, caminho_arquivo_longo):
    audio = AudioSegment.from_mp3(caminho_arquivo_longo)

    # Conversão de mils para minutos
    dez_minutos = 10 * 60 * 1000
    
    contador_pedaco = 1
    arquivos_exportados = []

    while len(audio) > 0:
        print(f"Cortando pedaço {contador_pedaco}")
        pedaco = audio[:dez_minutos]
        nome_pedaco_audio = f"{nome_arquivo}_parte_{contador_pedaco}.mp3"
        pedaco.export(f"D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv/media/{nome_pedaco_audio}", format="mp3")
        arquivos_exportados.append(nome_pedaco_audio)
        audio = audio[dez_minutos:]
        contador_pedaco += 1

    return arquivos_exportados

def selecionar_imagem(lista_nome_imagens):
    return lista_nome_imagens[int(input("Qual o número do nome da imagem gerada que deseja?"))]

def ferramenta_converter_png_jpg(caminho_imagem_escolhida, nome_arquivo):
    img_png = Image.open(f"D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv/media/{caminho_imagem_escolhida}") 
    final_arquivo = caminho_imagem_escolhida.split(".")[0]+".jpg"
    img_png.save(f"D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv/media/{final_arquivo}") 

    return caminho_imagem_escolhida.split(".")[0] + ".jpg"


# Definição de função main
def main():
    # Chamada de função que carrega as variáveis de ambiente do arquivo .env
    load_dotenv()
    # Declaração de variáveis e atribuição de suas inicializações
    caminho_audio = ".venv/media/teste_ia.mp3"
    caminho_audio_longo = ".venv/media/hipsters_364_nvidia.mp3"
    nome_arquivo = "teste_ia"
    nome_arquivo_longo = "364_longo"
    url_podcast = "https://www.hipsters.tech/testes-de-software-e-inteligencia-artificial-hipsters-154/"
    # Definição de qual modelo do Whisper e o GPT serão usados
    modelo_whisper = "whisper-1"
    # modelo_gpt = 'gpt-3.5-turbo'
    modelo_gpt="gpt-3.5-turbo-16k"
    # Atribuição de valor da resolução à variável
    resolucao_imagem = '1024x1024'
    # Atribuição de valor da quantidade de imagens desejada à variável
    qtd_imagens = 4
    # Atribuição do valor capturado da variável de ambiente ao objeto openai.api_key, representando a chave da API
    openai.api_key = os.getenv("OPENAI_API_KEY")

    ## Implementação para redução de custo de token
    # Leitura e atribuição do conteúdo dos arquivos teste_ia-transcricao.txt e teste_ia-resumo.txt
    # transcricao   = ferramenta_ler_arquivo('D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv', 'teste_ia-transcricao.txt')
    # resumo_inst   = ferramenta_ler_arquivo('D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv', 'teste_ia-resumo.txt')
    # hashtag       = ferramenta_ler_arquivo('D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv', 'hashtag.txt')
    # resumo_imagem = ferramenta_ler_arquivo('D:/Repositorios/Alura/Formacao_OpenAI/20231014_OpenAI_Insta_transc/.venv', 'resumo_imagem.txt')
    
    # Declaração de variável e atribuição do valor de retorno do método openai_transcrever
    # transcricao = openai_trasncrever(caminho_audio, nome_arquivo, openai, modelo_whisper)
    transcricao = openai_trasncrever_longo(caminho_audio_longo, nome_arquivo_longo, openai, modelo_whisper)
    # Declaração de variável e atribuição do valor de retorno do método openia_gpt_resumir
    resumo_inst = openia_gpt_resumir(nome_arquivo_longo, str(transcricao), openai, modelo_gpt)
    # Chamada da função para criação do arquivo de hashtag
    openai_gpt_criar_hashtag(nome_arquivo_longo, resumo_inst, openai, modelo_gpt)
    # # Chamada de função que gera um resumo curto para usarmos no promp de geração de imagem
    resumo_imagem = openai_gpt_texto_imagem(nome_arquivo_longo, resumo_inst, modelo_gpt, openai)
    #
    imagem_gerada = openai_dalle_gerar_imagem(resolucao_imagem, resumo_imagem, qtd_imagens, openai)
    #
    lista_imagens_geradas = ferramenta_download_imagem(nome_arquivo_longo, imagem_gerada, qtd_imagens)
    #
    caminho_imagem_escolhida = selecionar_imagem(lista_imagens_geradas)
    #
    caminho_imagem_convertida = ferramenta_converter_png_jpg(caminho_imagem_escolhida, nome_arquivo)

# Chamada para execução da função main automaticamente ao chamar o arquivo main
if __name__ == "__main__":
    main()
