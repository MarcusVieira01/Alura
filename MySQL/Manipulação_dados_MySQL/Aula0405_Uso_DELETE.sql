use vendas_sucos;

-- Insersão de registros
insert into produtos
values
	('1001000', 'Sabor dos Alpes 700ml - Manga', 'Manga', '700 ml', 'Garrafa', 7.5),
	('1001002', 'Sabor dos Alpes 700ml - Melão', 'Melão', '1 Litro', 'Garrafa', 7.5);
    
-- Exibição de todos os descritores que contiverem, após substring, Sabor dos Alpes
select * from produtos 
where substring(descritor, 1, 15) = 'Sabor dos Alpes';

-- Usando a condição do select acima para exclusão de registros apenas que contenham Sabor dos Alpes
delete from produtos
where substring(descritor, 1, 15) = 'Sabor dos Alpes';

-- Exibe o campo codigo_do_produto da tabela_de_produtos
select codigo_do_produto from sucos_vendas.tabela_de_produtos;

-- Exibe o codigo dos produtos onde a condição for verdadeira, usandondo a query acima como subquery
select codigo from produtos
where codigo not in (select codigo_do_produto from sucos_vendas.tabela_de_produtos);

-- Apaga os registros onde a condição da subquery seja verdadeira, ou seja, onde o código dos produtos não estiver na tabela_de_produtos
delete from produtos
where codigo not in (select codigo_do_produto from sucos_vendas.tabela_de_produtos);
