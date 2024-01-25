from models.Restaurante import Restaurante

restaurante_praca = Restaurante('praça', "gourmet")
restaurante_pizza = Restaurante('pizza express', "fastfood")

print(Restaurante.listar_restaurantes(Restaurante))

