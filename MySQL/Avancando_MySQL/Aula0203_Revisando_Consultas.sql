-- Definir o uso do BD
USE sucos_vendas; 

-- Exibe no output todos os registros das colunas declaradas de tabela_de_clientes
select 
	cpf, nome, endereco_1, bairro, cidade, estado, cep, data_de_nascimento 
from tabela_de_clientes;

-- Exibe todos regitros de todos os campos da tabela tabela_de_clientes
select * from tabela_de_clientes;

-- Exibe todos os registros do campo CPF e nome, denominando as colunas com um ALIAS
select 
	CPF as IDENTIFICADOR, NOME as CLIENTE 
from tabela_de_clientes;

-- Exibe todos os campos onde o registro seja 1000889, da tabela tabela_de_produtos
select * 
from tabela_de_produtos 
where codigo_do_produto = '1000889';

-- Exibe todos os campos da tabela tabela_de_produtos onde o sabor for Uva e a embalagem for garrafa
select *
from tabela_de_produtos
where sabor = "Uva" and embalagem = "Garrafa";

--
select *
from tabela_de_produtos
where preco_de_lista between 19.49 and 19.52;
