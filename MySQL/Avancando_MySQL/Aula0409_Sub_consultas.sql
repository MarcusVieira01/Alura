-- Definir o uso do BD
USE sucos_vendas;

-- Retorna todos os campos da tabela_de_clientes onde o bairro estja dentro (in) da subconsulta. Subconsulta retorna os bairro da 
-- tabela_de_vendedores distintamente
select *
from tabela_de_clientes
where bairro in (
	select distinct bairro
	from tabela_de_vendedores);

--
select embalagem, max(preco_de_lista)
from tabela_de_produtos
group by embalagem;

-- Retorna os campos embalagem e preco_maximo da tabela gerada epal subconsulta, onde retorna a embalagem e o o valor máximo de cada registro
-- da tabela_de_produtos. Subconsulta com alisas X e com filtragem via WHERE para os valores maiores ou igual a 10
select X.embalagem, X.preco_maximo
from(
	select embalagem, max(preco_de_lista) as preco_maximo
	from tabela_de_produtos
	group by embalagem) X
where x.preco_maximo >= 10;
