use vendas_sucos;

-- Usando update foi atualizado o registro com PK 1000889 no campo preco_lista para 5
update produtos
set preco_lista = 5
where codigo = '1000889';

-- Alteração dos campos embalagem, tamanho e descritor do produto de pk 1000889 da tabela produtos
update produtos
set embalagem = 'pet', tamanho = '1 litro', descritor = 'Sabor da Montanha - 1 litro - Uva'
where codigo = '1000889';

-- Modificação de preco_lista de um conjunto de registros com o valor de resultado da expressão matemática do set;
update produtos
set preco_lista = preco_lista * 1.1
where sabor = 'Maracujá';

-- Exibição de todos os campos da tabela produtos
select * from produtos where sabor = 'Maracujá';
