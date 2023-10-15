# Declaração de classe que abstrai o conceito de CPF
class Cpf:
    # Definição de dunder method que fará a construção do objeto
    def __init__(self, cpf):
        # Cast de int para str do valor do atributo cpf
        cpf = str(cpf)
        # Condicional que valida a quantidade de caracteres do atributo cpf, lançando exceção de ValueError
        if self.__validaCPF(cpf):
            self.__cpf = cpf
            self.__validado = self.__validaCPF(cpf)
        else:
            raise ValueError("CPF inválido!")

    # Definição de dunder method que retornará a representação de caracteres do objeto, no caso o valor do 
    # atributo cpf formatado para a representação pt-br
    def __str__(self):
        return self.__mascaraCPF()

    # Definição de método auxiliar que validará a quantidade de caracteres do atributo cpf
    def __validaCPF(self, cpf):
        # Condicional, fail fast, que verificará se o valor do atributo cpf possui 11 elementos e retornará 
        # True caso tenha e False caso não
        if len(cpf) != 11:
            return False
        else:
            return True
    
    # Definição de método que fará a formatação do valor da variável cpf conforme o pardão pr-br
    def __mascaraCPF(self):
        # Retorno do valor do atributo cpf no formato pr-br
        return (f"{self.__cpf[0:3]}.{self.__cpf[3:6]}.{self.__cpf[6:9]}-{self.__cpf[9:]}")
    
    # Métodos getters
    # Método getter para o atributo privado __validado
    def validado(self):
        return self.__validado
