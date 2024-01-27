import requests, json

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

for nome_restaurante, dados in dados_restaurante.items():
    nome_arquivo = f'{nome_restaurante}.json'
    with open(nome_arquivo, 'w', encoding='utf-8') as arquivo_restaurante:
        json.dump(dados, arquivo_restaurante, indent=4)
        arquivo_restaurante.close()
