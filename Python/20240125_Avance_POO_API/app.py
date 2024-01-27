import requests

url = 'https://guilhermeonrails.github.io/api-restaurantes/restaurantes.json'

response = requests.get(url, timeout=10)

if response.status_code == 200:
    payload_json = response.json()

    dados_restaurante = {}

    for item in payload_json:
        nome_restaurante = item['Company']

        if nome_restaurante not in dados_restaurante:
            dados_restaurante[nome_restaurante] = []

        dados_restaurante[nome_restaurante].append({
            'item':item['Item'],
            'preco':item['price'],
            'descrição':item['description']
        })

else:
    print(f'Erro ocorrido: {response.status_code()}')

print(dados_restaurante["McDonald’s"])
