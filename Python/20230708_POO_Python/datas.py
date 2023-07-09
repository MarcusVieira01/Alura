'''DOCSTRING do pacote'''
class Data:
    '''DOCSTRING da classe'''
    def __init__(self, dia, mes, ano):
        self.dia = dia
        self.mes = mes
        self.ano = ano

    def data_formatada(self):
        '''DOCSTRING do método data_formatada'''
        print(f"{self.dia}/{self.mes}/{self.ano}")
