-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna todos campos e registros que finalizem com Maçã da tabela tabela_de_produtos
select *
from tabela_de_produtos
where sabor like "%Maçã";

-- Retorna todos campos e registros que começa com Cereja da tabela tabela_de_produtos
select *
from tabela_de_produtos
where sabor like "Cereja%";

-- Retorna todos campos e registros que começa com Cereja da tabela tabela_de_produtos e que possua PET na embalagem
select *
from tabela_de_produtos
where sabor like "Cereja%" and embalagem = "PET";

