# Importação de bibliotecas e classes
from Cpf import Cpf
import dotenv
import os

#
dotenv.load_dotenv()
#
cpf = os.getenv("CPF_REAL")

objCPF = Cpf(cpf)

print(objCPF)
