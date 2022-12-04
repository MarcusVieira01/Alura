-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna os registros dos campos codigo_do_produto e nome_do_produto, da tabela tabela_de_produtos onde o nome do produto inicie por 
-- Linha Refrescante. Usado para encontrar o código do produto Linha Refrescante - 1 Litro - Morango/Limão
select codigo_do_produto, nome_do_produto
from tabela_de_produtos
where nome_do_produto like "Linha Refrescante%";

-- Retorna todos os campos com registros da tabela intens_notas_fiscais, onde o código_do_produto seja 1101035 com ordenação pela quantidade
select * 
from itens_notas_fiscais
where codigo_do_produto = "1101035"
order by quantidade;
