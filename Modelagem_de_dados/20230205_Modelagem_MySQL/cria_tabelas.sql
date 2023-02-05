use clube_do_livro;

create table livros (
id_livro int not null, 
nome_livro varchar(100) not null, 
autoria varchar(100) not null, 
editora varchar(100) not null,
categria varchar(100) not null,
preco decimal(5, 2) not null,
primary key (id_livro)
);

create table estoque (
id_livro int not null,
qtd_estoque int not null,
primary key (id_livro)
);

create table vendas (
id_pedido int not null,
id_vendedor int not null,
id_livro int not null,
qtd_vendida int not null,
data_venda date not null,
primary key (id_vendedor, id_pedido)
);

create table vendedores (
id_vendedor int not null,
nome_vendedor varchar(255) not null,
primary key (id_vendedor)
);
