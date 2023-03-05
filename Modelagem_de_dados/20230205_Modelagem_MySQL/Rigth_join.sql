use clube_do_livro;

select A.nome_livro as 'livro', sum(B.qtd_vendida) as 'vendido', B.id_livro as 'livro_venda'
from livros A right join vendas B
on A.id_livro = B.id_livro
group by nome_livro;
