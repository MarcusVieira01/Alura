from Filme import Filme
from Serie import Serie

vingadores = Filme("Vingadores", 2018, 160)
atlanta = Serie("Atlanta", 2018, 2)

print(vingadores.nome)
print(atlanta.nome)

vingadores.darLike()
atlanta.darLike()

print(f"{vingadores.nome} - likes {vingadores.likes} - ano {vingadores.ano} - duração {vingadores.duracao}")
print(f"{atlanta.nome} - likes {atlanta.likes} - ano {atlanta.ano} - temporadas {atlanta.temporadas}" )
