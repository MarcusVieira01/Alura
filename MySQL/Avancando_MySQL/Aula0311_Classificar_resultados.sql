-- Definir o uso do BD
USE sucos_vendas; 

-- Retorno das colunas nome_do_produto e preco_de_lista onde é classificado via case cada faixa de valor, com exibição via alias definido
-- da tabela_de_produtos
select nome_do_produto, preco_de_lista,
case
	when preco_de_lista >= 12 then "Produto Caro"
    when preco_de_lista >= 7 and preco_de_lista < 12 then "Produto em Conta"
    else "Produto Barato" 
end
as Status_Preco
from tabela_de_produtos;
