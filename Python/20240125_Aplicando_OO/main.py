from models.Restaurante import Restaurante

def main():
    restaurante_praca = Restaurante('praça'        , "gourmet" )
    restaurante_pizza = Restaurante('pizza express', "fastfood")

    print(Restaurante.listar_restaurantes())

    restaurante_praca.alternar_ativo()
    restaurante_pizza.alternar_ativo()

    print(Restaurante.listar_restaurantes())

if __name__ == '__main__':
    main()
