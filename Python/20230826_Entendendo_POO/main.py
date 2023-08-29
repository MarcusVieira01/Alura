from Conta import Conta

print("Os códigos dos bancos são {}".format(Conta.codigoBanco()))

contaMarcus = Conta(123, "Marcus", 120.00, 250.00)

contaMarcus.saca(371.00)
contaMarcus.extrato()

