-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna os registros dos campos embalagem e tamanho, da tabela tabela_de_produtos, de forma exclusiva usando distinct
select distinct embalagem, tamanho
from tabela_de_produtos;

-- Retorna os registros que o sabor será laranja, com campos embalagem e tamanho, da tabela tabela_de_produtos, 
-- de forma exclusiva usando distinct
select distinct embalagem, tamanho, sabor
from tabela_de_produtos
where sabor = "Laranja";
