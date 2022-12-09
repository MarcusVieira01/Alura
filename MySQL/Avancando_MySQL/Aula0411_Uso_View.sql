-- Definir o uso do BD
USE sucos_vendas;

-- Retorna da view vw_maiores_precos_embalagens, os campos embalagem e maior_preco onde maior_preco é maior ou igual a 10
select embalagem, maior_preco
from vw_maiores_precos_embalagens
where maior_preco >=10;
