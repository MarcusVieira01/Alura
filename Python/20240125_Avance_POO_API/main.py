from fastapi import FastAPI, Query
import requests, json

app = FastAPI()

@app.get('/api/hello')
def hello_word():
    '''
    Endpoint que exibe a primeira mensagem que todo programador deverá ler
    '''
    return {'Hello':'World!'}

@app.get('/api/restaurantes/')
def get_restaurantes(restaurante: str = Query(None)):
    '''
    Endpoint para listar o cardápio de um restaurante passado como argumento, ou de todos restaurantes quando não se passa nenhum argumento
    '''
    url = 'https://guilhermeonrails.github.io/api-restaurantes/restaurantes.json'

    response = requests.get(url, timeout=10)

    if response.status_code == 200:
        payload_json = response.json()

        if restaurante is None:
            return {'Dados':payload_json}
        
        dados_restaurante = []

        for item in payload_json:
            if item['Company'] == restaurante:
                dados_restaurante.append({
                    'item':item['Item'],
                    'preco':item['price'],
                    'descrição':item['description']
                })
        return {'Restaurante':restaurante, 'Cardápio:':dados_restaurante}

    else:
        return (f'Erro ocorrido: {response.status_code()} - {response.text}')
