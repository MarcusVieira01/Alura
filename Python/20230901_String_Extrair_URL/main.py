# url = "https://bytebank.com/cambio?moedaOrigem=real&moedaDestino=dolar&quantidade=100&taxa=0.12"
url = "          "

busca = "moedaOrigem"

# Sanitização da URL
url = url.replace(" ", "")

parametrosURL = url[url.find("?") + 1: len(url)]

arrayParametros = parametrosURL.split("&")

if len(url) == 0:
    raise ValueError("URL vazia")
else:
    print(f"Os parâmetros são {parametrosURL}")

    for valor in arrayParametros:
        elemento = valor.split("=")
        if elemento [0] == busca:
            print(f"O parâmetro buscado é {elemento[1]}")
        else:
            continue

