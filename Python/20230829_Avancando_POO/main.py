from Filme import Filme
from Serie import Serie
from Playlist import Playlist

vingadores = Filme("Vingadores", 2018, 160)
atlanta = Serie("Atlanta", 2018, 2)
tmep = Filme("Todo mundo em pânico", 1999, 180)
demolidor = Serie("Demolidor", 2016, 8)

listaProgramas = [vingadores, atlanta, tmep, demolidor]

playlistFDS = Playlist("Fim de semana", listaProgramas)

for programas in playlistFDS.listaProgramas:
    print(programas.nome)

for programas in playlistFDS.listaProgramas:
    programas.darLike()

tmep.darLike()

for programas in playlistFDS.listaProgramas:
    print(programas)

for programas in playlistFDS.listaProgramas:
    print(programas.__repr__())

