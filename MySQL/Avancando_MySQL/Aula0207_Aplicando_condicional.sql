-- Definir o uso do BD
USE sucos_vendas; 

-- Exibe todos os campos da tabela tabela_de_produtos onde a condição no where for TRUE
select *
from tabela_de_produtos
where sabor = "Manga" or tamanho = "470 ml";

-- Exibe todos os campos da tabela tabela_de_produtos onde a condição no where for TRUE
select *
from tabela_de_produtos
where sabor = "Manga" and tamanho = "470 ml";

-- Exibe todos os campos da tabela tabela_de_produtos onde a condição no where for TRUE, após condicional NOT
select *
from tabela_de_produtos
where not(sabor = "Manga") and not(tamanho = "470 ml");

-- Retorna todos os campos da tabela tabela_de_produtos onde na coluna saber houver qualquer string dentro da cláusula in
select *
from tabela_de_produtos
where sabor in ("Laranja", "Manga");

-- Retorna todos os campos com registros que satisfaçam a condição na cláusula where, da tabela tabela_de_clientes
select *
from tabela_de_clientes
where cidade in ("Rio de Janeiro", "São Paulo") and (idade >= 20 and idade <= 22);

