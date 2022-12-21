use vendas_sucos;

-- Criação de delimitador para a criação da trigger, onde o // foi escolhido para não conflitar com os delimitadores de comando na trigger
delimiter //

-- Criação de trigger para atualização da tabela faturamento a cada update na tabela itens_notas. Será executado para cada linha
create trigger TG_calcula_faturamento_update
after update
on itens_notas
for each row begin
	insert into faturamento (total_venda, data_venda)
	select sum(b.quantidade * b.preco) as total_venda, a.data_venda from notas A
	inner join itens_notas B
	on A.numero = b.numero
	group by a.data_venda;
end//

-- Criação de delimitador para a criação da trigger, onde o // foi escolhido para não conflitar com os delimitadores de comando na trigger
delimiter //

-- Criação de trigger para atualização da tabela faturamento a cada delete na tabela itens_notas. Será executado para cada linha
create trigger TG_calcula_faturamento_delete
after delete
on itens_notas
for each row begin
	insert into faturamento (total_venda, data_venda)
	select sum(b.quantidade * b.preco) as total_venda, a.data_venda from notas A
	inner join itens_notas B
	on A.numero = b.numero
	group by a.data_venda;
end//


-- Exibição de todos os campos tas tabelas
select * from notas
order by data_venda asc;

select * from itens_notas;

select * from faturamento
order by data_venda desc;

-- Update na tabela itens_notas, alterando a quantidade do campo numero e código específico;
update itens_notas
set quantidade = 300
where numero = '87977' and codigo = '1002334';

-- Deleção da tabela itens_notas onde a condição for verdadeira
delete from itens_notas
where numero = '87977' and codigo = '1002334';

