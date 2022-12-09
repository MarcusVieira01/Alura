-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna o campo bairro de forma única da tabela_de_clientes
select distinct bairro
from tabela_de_clientes
-- Keyword que realiza  aunião entre queries
union
-- Retorna o campo bairro de forma única da tabela_de_vendedores
select distinct bairro
from tabela_de_vendedores;
