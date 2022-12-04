-- Definir o uso do BD
USE sucos_vendas; 

-- Retorno de todos os campos da tabela tabela_de_clientes usando limitação de resultados, com 10 registros a partir do 2º registro
select *
from tabela_de_clientes
limit 2, 10;


