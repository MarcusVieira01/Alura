use vendas_sucos;

-- Criação da tabela_de_vendas
create table tabela_de_vendas(
	numero varchar(5) not null,
    data_venda date null,
    cpf varchar(11) not null,
    matricula varchar(5) not null,
    imposto float null,
    primary key (numero));

-- Definição de PK via alter table e add constraint para CPF do cliente
alter table tabela_de_vendas add constraint FK_CLIENTES
foreign key (cpf)
references clientes (cpf);

-- Definição de PK via alter table e add constraint para MATRICULA do vendedor
alter table tabela_de_vendas add constraint FK_VENDEDORES
foreign key (matricula)
references vendedores (matricula);
