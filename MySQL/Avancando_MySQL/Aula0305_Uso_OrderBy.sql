-- Definir o uso do BD
USE sucos_vendas; 

-- Retorno de todos os campos com todos registros da tabela tabela_de_produtos, ordenado pelo campo preco_de_lista de forma descendente
select *
from tabela_de_produtos
order by preco_de_lista desc;

-- Retorno de todos os campos com todos registros da tabela tabela_de_produtos, ordenado pelos campos embalagem e nome_do_produto de forma descendente
select *
from tabela_de_produtos
order by embalagem, nome_do_produto;
