from Conta import Conta

contaMarcus = Conta(123, "Marcus", 120.00, 250.00)

contaNico = Conta(321, "Nico", 200.00, 1000.00)

contaMarcus.transfere(contaNico, 20.00)

contaMarcus.extrato()
contaNico.extrato()
