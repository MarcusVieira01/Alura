# Importação de biblioteca e classes
from datetime import date

# Declaração de uma classe que abstrai um funcionário
class Funcionario:
    # Definição de dunder methods ou special methods
    # Definição de dunder method construtor, com atributos protegidos
    def __init__(self, nome, data_nascimento, salario):
        self._nome = nome
        self._data_nascimento = data_nascimento
        self._salario = salario
    # Definição de dunder method para reperesentação textual do objeto
    def __str__(self):
        return f'Funcionario({self._nome}, {self._data_nascimento}, {self._salario})'

    # Definição de métodos getter e setter
    # Definição de métodos getter via anotação @property
    @property
    def nome(self):
        return self._nome
    @property
    def salario(self):
        return self._salario

    # Definição de métodos públicos
    # Definição de método que retorna a idade de um funcionário
    def idade(self):
        ano_atual = date.today().year
        return ano_atual - int(self._data_nascimento)
    # Definição de método que retornará o bonus calculado
    def calcular_bonus(self):
        valor = self._salario * 0.1
        if valor > 1000:
            valor = 0
        return valor
    