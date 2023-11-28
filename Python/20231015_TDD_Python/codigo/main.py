# Importação de módulos ou classes
from bytebank import Funcionario
import openai
import dotenv
import os

# Instanciamento de objeto do tipo Funcionário via construtor
funcionario = Funcionario("Lucas", 1985, 4300.00)

# Exibição do retorno do método idade
print(funcionario.idade())
