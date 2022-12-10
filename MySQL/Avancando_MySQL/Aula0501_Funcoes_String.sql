-- Exemplo de aplicações
select ltrim('   olá') as resultado;
select trim('   olá   ') as resultado;
select upper(concat('Olá', ' ', 'tudo bem?')) as resutado;
select substring("Olá tudo bem", 5, 4) as resultado;

-- Realiza a concatenação dos campos e strings usando a função concat, com campos nome e cpf da tabela_de_clientes
select concat(nome, ' (', cpf, ')') as resultado
from tabela_de_clientes;
