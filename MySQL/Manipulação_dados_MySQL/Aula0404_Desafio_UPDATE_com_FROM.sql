use vendas_sucos;

-- Exibe o campo cpf da tabela de clientes chamada de A, com inner join com a tabela vendedores chamada de B onde o bairro de A seja 
-- igual ao bairro de B
select cpf from clientes A
inner join vendedores B
on a.bairro = b.bairro;

-- Realiza um update no campo volume_compra de A onde os bairros sçao iguais em A e B advindo do inner join
update clientes A inner join vendedores B
on a.bairro = b.bairro
set a.volume_compra = a.volume_compra * 1.3;

-- Exibe o campo volume_compra da tabela A onde o bairro seja igual em ambas tabelas, A e B
select a.volume_compra from clientes A, vendedores B
where a.bairro = b.bairro;
