-- Definir o uso do BD
USE sucos_vendas; 

-- Desafio: Obter o faturamento anual da empresa levando em consideração que o valor financeiro das vendas consiste em multiplicar a 
-- quantidade pelo preço
-- Abaixo leitura de todos os campos para analisar a lógica a seguir
select * from itens_notas_fiscais;
select * from notas_fiscais;

select *, year(data_venda) as Ano
from notas_fiscais
order by year(data_venda);

-- Lógica do desafio
select year(nf.data_venda), round(sum(inf.quantidade * inf.preco), 2) as Valor_venda
from notas_fiscais NF
inner join itens_notas_fiscais INF
on nf.numero = inf.numero
order by year(nf.data_venda);
