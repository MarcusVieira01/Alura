from ExtratorURL import ExtratorURL

url = "https://bytebank.com/cambio?moedaOrigem=real&moedaDestino=dolar&quantidade=100&taxa=0.12"

urlExtraida = ExtratorURL(url)

print(urlExtraida.getURLBase())

print(urlExtraida.getURLParametros())

print(urlExtraida.getValorParametro("quantidade"))

print(f"A URL tem {len(urlExtraida)} caracteres")
