-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna todos os campos da tabela_de_vendedores denominada A, realizando um inner join com a tabela notas_fiscais denominada b
-- onde a matrícula em A é igual a mátricula em B
select *
from tabela_de_vendedores A
inner join notas_fiscais B
on a.matricula = b.matricula;

-- Retorna  os campos matrícula, nome e a contagem de todas as colunas? da tabela_de_vendedores denominada A, realizando um 
-- inner join com a tabela notas_fiscais denominada b onde a matrícula em A é igual a mátricula em B com agrupamento via matrícula e nome 
-- da tabela A
select a.matricula, a.nome, count(*)
from tabela_de_vendedores A
inner join notas_fiscais B
on a.matricula = b.matricula
group by a.matricula, a.nome;

