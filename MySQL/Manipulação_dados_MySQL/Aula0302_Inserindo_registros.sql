use vendas_sucos;

-- Inserção de registro
insert into produtos (codigo, descritor, sabor, tamanho, embalagem, preco_lista)
values('1040107', 'Light 350 ml - Melancia', 'Melancia', '350 ml', 'lata', 4.56);

-- Visualizar todos os campos da tabela produtos
select * from produtos;

-- Inserção de registro
insert into produtos (codigo, descritor, sabor, tamanho, embalagem, preco_lista)
values('1040108', 'Light 350 - Graviola', 'Graviola', '350 ml', 'lata', 4);

-- Visualizar todos os campos da tabela produtos
select * from produtos;

-- Inserção de registro
insert into produtos
values('1040109', 'Light 350 - Açaí', 'Açaí', '350 ml', 'lata', 5.60);

-- Visualizar todos os campos da tabela produtos
select * from produtos;

-- Inserção de registro de forma aninhada
insert into produtos
values('1040110', 'Light 350 - Jaca', 'Jaca', '350 ml', 'lata', 6.00),
	  ('1040111', 'Light 350 - Manga', 'Manga', '350 ml', 'lata', 3.50);

-- Visualizar todos os campos da tabela produtos
select * from produtos;
