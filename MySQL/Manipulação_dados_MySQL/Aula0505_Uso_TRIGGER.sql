use vendas_sucos;

-- Criação de tabela auxiliar sem pk
create table faturamento(
	total_venda float,
	data_venda date null
    );
    
-- Exibição dos campos da tabela faturamento
select * from faturamento;

-- Exibe a data de venda e a somatória dos campos especificados, com inner join no campo número e agrupado na data_venda
select sum(b.quantidade * b.preco) as total_venda, a.data_venda from notas A
inner join itens_notas B
on A.numero = b.numero
group by a.data_venda;

-- Insere o resultado da subquery na tabela faturamento
insert into faturamento (total_venda, data_venda)
select sum(b.quantidade * b.preco) as total_venda, a.data_venda from notas A
inner join itens_notas B
on A.numero = b.numero
group by a.data_venda;

-- Exibição dos campos da tabela faturamento
select * from faturamento;

-- Criação de delimitador para a criação da trigger, onde o // foi escolhido para não conflitar com os delimitadores de comando na trigger
delimiter //

-- Criação de trigger para atualização da tabela faturamento a cada insert na tabela itens_notas. Será executado para cada linha
create trigger TG_calcula_faturamento_insert
after insert
on itens_notas
for each row begin
	insert into faturamento (total_venda, data_venda)
	select sum(b.quantidade * b.preco) as total_venda, a.data_venda from notas A
	inner join itens_notas B
	on A.numero = b.numero
	group by a.data_venda;
end//

-- Exibição dos campos da tabela faturamento
select * from faturamento;

-- Insersão de registros nas 
insert into notas
values 
	('87979', '2022-12-20', '5576228758', 237, 0.1),
    ('87980', '2022-12-20', '5576228758', 237, 0.1);
insert into itens_notas
values 
	('87979', 1000889, 100, 10),
    ('87979', 1002334, 100, 10),
    ('87980', 1002334, 100, 10);

-- Exibição dos campos da tabela faturamento
select * from faturamento
order by data_venda;