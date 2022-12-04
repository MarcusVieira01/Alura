-- Definir o uso do BD
USE sucos_vendas; 

-- Retorna a coluna estado e a soma dos registros da coluna limite_de_credito com alias Soma_Limite, da tabela_de_clientes agrupados
-- pela coluna estado e apenas que satizfizer a lógica do having
select estado, sum(limite_de_credito) as Soma_Limite 
from tabela_de_clientes
group by estado
having sum(limite_de_credito) > 900000;

-- Retorna a coluna embalagem, o registro com o maior valor e menor valor da coluna preco_de_lista via alias definido, da 
-- tabela_de_produtos, agrupados por embalagem e apenas o que conter a soma do preco_de_lista menor ou igual a 80
select embalagem, 
	   max(preco_de_lista) as Máximo, 
       min(preco_de_lista) as Mínimo
from tabela_de_produtos
group by embalagem
having sum(preco_de_lista) <= 80;

