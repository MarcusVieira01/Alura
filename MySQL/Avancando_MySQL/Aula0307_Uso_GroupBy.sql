-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna a soma do atributo limite_de_credito, como alias limite_total, da tabela tabela_de_clientes agrupado pelo estado
select estado, sum(limite_de_credito) as limite_total
from tabela_de_clientes
group by estado;

-- Retorna o maior valor do campo preço_de_lista, ordenando pelo campo embalagem, da tabela tabela_de_produtos
select embalagem, max(preco_de_lista) as maior_preco
from tabela_de_produtos
group by embalagem;

-- Retorna a soma do atributo limite_de_credito, agrupado por bairro, onde a cidade seja Rio de Janeiro, da tabela tabela_de_clientes
-- com ordenação pelo bairro
select bairro, sum(limite_de_credito) as limite
from tabela_de_clientes
where cidade = "Rio de Janeiro"
group by bairro
order by bairro;
