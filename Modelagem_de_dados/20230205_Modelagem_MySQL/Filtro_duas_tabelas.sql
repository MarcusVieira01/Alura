use clube_do_livro;

select A.id_vendedor, B.nome_vendedor, A.qtd_vendida
from vendas A, vendedores B
where A.id_vendedor = B.id_vendedor;
