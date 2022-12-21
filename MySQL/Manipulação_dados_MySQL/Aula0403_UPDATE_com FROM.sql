use vendas_sucos;

-- Exibe todos os campos das tabelas vendedores e tabela_de_vendedores
select * from vendedores;

select * from sucos_vendas.tabela_de_vendedores;

-- Exibição de todos os campos da tabela vendedores, chamada de A, com uma união interna com a tabela_de_vendedores onde a matrícula
-- for igual a substring
select * from vendedores A
inner join sucos_vendas.tabela_de_vendedores B
on a.matricula = substring(b.matricula, 3, 3);

-- Fará a atualização do campo ferias vindo do inner join
update vendedores A
inner join sucos_vendas.tabela_de_vendedores B
on a.matricula = substring(b.matricula, 3, 3)
set ferias = b.de_ferias;

-- Exibição de todos os campos da tabela vendedores
select * from vendedores;
