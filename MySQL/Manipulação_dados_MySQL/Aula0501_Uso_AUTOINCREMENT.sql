use vendas_sucos;

-- Criação de uma tabela com campo auto incremetável
create table tabela_identity (
	id int auto_increment not null, 
    descritor varchar(20) null,
	primary key (id));

-- Inclusão de registro usando a PK omitida em vista que é auto increment
insert into tabela_identity (descritor)
values ('Cliente 1');

insert into tabela_identity (descritor)
values ('Cliente 2'),
	   ('Cliente 3');

insert into tabela_identity (descritor)
values ('Cliente 4');

-- Exibição de todos os campos da tabela_identity
select * from tabela_identity;

-- Deleção do registro de PK 2
delete from tabela_identity where id = 2;

-- Inclusão de registro usando a PK omitida em vista que é auto increment
insert into tabela_identity (descritor)
values ('Cliente 5'),
	   ('Cliente 6'),
       ('Cliente 7');

-- Exibição de todos os campos da tabela_identity
select * from tabela_identity;

-- Deleção do registro de PK 5, 6, 7
delete from tabela_identity where id = 5;
delete from tabela_identity where id = 6;
delete from tabela_identity where id = 7;

-- Inclusão de registro usando a PK omitida em vista que é auto increment
insert into tabela_identity (descritor)
values ('Cliente 8');

-- Exibição de todos os campos da tabela_identity
select * from tabela_identity;

-- Inclusão de registro usando a PK 100 para saltar o auto increment para 100
insert into tabela_identity (id, descritor)
values (100, 'Cliente 100');

-- Exibição de todos os campos da tabela_identity
select * from tabela_identity;

-- Inclusão de registro usando a PK 100 para saltar o auto increment para 100
insert into tabela_identity (descritor)
values ('Cliente 101');

-- Exibição de todos os campos da tabela_identity
select * from tabela_identity;
