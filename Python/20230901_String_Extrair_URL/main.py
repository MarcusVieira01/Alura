from ExtratorURL import ExtratorURL

# url = "https://bytebank.com/cambio?moedaOrigem=real&moedaDestino=dolar&quantidade=100&taxa=0.12"

url = None

urlExtraida = ExtratorURL(url)

print(urlExtraida.getURLBase())

print(urlExtraida.getURLParametros())

print(urlExtraida.getValorParametro(""))
