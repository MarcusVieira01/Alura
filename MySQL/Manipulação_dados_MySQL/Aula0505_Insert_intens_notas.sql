use vendas_sucos;

-- Insersão da tabela intens_notas_fiscais na tabela intens_notas, com conversão do campo numero da tabela itens_notas_fiscais para char(5)
insert into itens_notas
select cast(numero as char(5)), codigo_do_produto as codigo, quantidade, preco from sucos_vendas.itens_notas_fiscais;

-- Exibição da tabela intens_notas
select * from itens_notas;

