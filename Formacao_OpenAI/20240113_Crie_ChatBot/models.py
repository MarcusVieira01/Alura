class Usuario:
    def __init__(self, nome, nickname, senha):
        self.nome = nome
        self.nickname = nickname
        self.senha = senha

usuario1 = Usuario("Laís Urano", "lais", "alura123")
usuario2 = Usuario("Marcus Vieira", "2MV", "123456")

usuarios = { usuario1.nickname : usuario1,
             usuario2.nickname : usuario2}