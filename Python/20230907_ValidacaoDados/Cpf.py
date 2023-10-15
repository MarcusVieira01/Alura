# Importaçãod e bibliotecas e calsses
from validate_docbr import CPF

# Declaração de classe que abstrai o conceito de CPF
class Cpf:
    # Definição de dunder method que fará a construção do objeto
    def __init__(self, cpf):
        # Cast de int para str do valor do atributo cpf
        cpf = str(cpf)
        # Condicional que valida a quantidade de caracteres do atributo cpf, lançando exceção de ValueError
        if self.__validaCPF(cpf):
            self.__cpf = cpf
        else:
            raise ValueError("CPF inválido!")

    # Definição de dunder method que retornará a representação de caracteres do objeto, no caso o valor do 
    # atributo cpf formatado para a representação pt-br
    def __str__(self):
        #
        mascaraCPF = CPF()
        return mascaraCPF.mask(self.__cpf)

    # Definição de método auxiliar que validará a quantidade de caracteres do atributo cpf
    def __validaCPF(self, cpf):
        # Condicional, fail fast, que verificará se o valor do atributo cpf possui 11 elementos e retornará 
        # True caso tenha e False caso não
        if len(cpf) != 11:
            raise ValueError("Quantidade de dígitos inválida!")
        else:
            # Instanciação de objeto da classe CPF
            validador = CPF()
            #
            return validador.validate(cpf)
