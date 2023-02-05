use clube_do_livro;

alter table estoque 
add constraint fk_estoque_livros
foreign key (id_livro) references livros (id_livro)
on delete no action
on update no action;

alter table vendas 
add constraint fk_vendas_livros
foreign key (id_livro) references livros (id_livro)
on delete no action
on update no action;

alter table vendas 
add constraint fk_vendas_vendedores
foreign key (id_vendedor) references vendedores (id_vendedor)
on delete no action
on update no action

