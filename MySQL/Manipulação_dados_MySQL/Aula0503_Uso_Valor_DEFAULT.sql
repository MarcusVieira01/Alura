use vendas_sucos;

-- Criação de tabela com padrõe para os campos cidade e data_criação, onde este usa a fu~ção current_timestamp() que retorna o valor da
-- data e hora atual
create table tabela_padrao (
	id int auto_increment,
    descritor varchar(20) null,
    endereco varchar(100) null,
    cidade varchar(50) default 'Rio de Janeiro',
    data_criacao timestamp default current_timestamp(),
    primary key (id)
    );
    
-- Inserção de registro com dados de cidade e data_criação sendo omitidas para uso do valor default
insert into tabela_padrao (descritor, endereco)
values('Cliente A', 'Rua projetada A');
	
-- Exibição dos campos da tabela_padrao
select * from tabela_padrao;

-- Inserção de registro
insert into tabela_padrao (descritor, endereco, cidade, data_criacao)
values('Cliente B', 'Rua projetada A', 'São Paulo', '2022-12-19');

-- Exibição dos campos da tabela_padrao
select * from tabela_padrao;
