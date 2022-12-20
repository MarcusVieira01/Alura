use vendas_sucos;

-- Criação da tabela itens_notas
create table itens_notas(
	numero varchar(5) not null,
    codigo varchar(10) not null,
    quantidade int null,
    preco float null,
    primary key (numero, codigo));
    
    -- Criação de FKs na tabela itens_notas via PK das tabelas notas e produtos
    alter table itens_notas add constraint FK_NOTAS
    foreign key (numero)
    references notas (numero);
    
	alter table itens_notas add constraint FK_PRODUTOS
    foreign key (codigo)
    references produtos (codigo);
    