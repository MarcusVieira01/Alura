use vendas_sucos;

-- Seleção de campos da BD sucos_vendas, tabela_de_produtos com renomeação dos campos via Alias, que não estejam já dentro da tabela 
-- produtos da BD vendas_sucos. O filtro será realizado via cláusula where. Como estamos usando o comando "use vendas_sucos" não
-- precisamos referenciar dentro da subconsulta a BD
select codigo_do_produto as codigo, nome_do_produto as descritor, embalagem, tamanho, sabor, preco_de_lista as preco_lista
from sucos_vendas.tabela_de_produtos
where codigo_do_produto not in (select codigo from produtos);

-- Usando a consulta acima, incluímos na tabela produtos seu retorno. Foi alterada a sequencia de campos para cruzar com a sequecia
-- da tabela destino. Como estamos usando o comando "use vendas_sucos" não precisamos referenciar dentro da subconsulta a BD
insert into produtos 
select codigo_do_produto as codigo, nome_do_produto as descritor, sabor, tamanho, embalagem, preco_de_lista as preco_lista
from sucos_vendas.tabela_de_produtos
where codigo_do_produto not in (select codigo from produtos);

-- Exibição de todos os campos da tabela produtos. Como estamos usando o comando "use vendas_sucos" não precisamos referenciar dentro 
-- da subconsulta a BD
select * from produtos;