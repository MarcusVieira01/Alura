use vendas_sucos;

-- Insersão de dados da tabela notas_fiscais da BD sucos_vendas, na tabela notas da BD vendas_sucos, onde o campo sucos_vendas.matricula
-- possuia formato diferente e foi feito substring para o formato correto
insert into notas (numero, data_venda, cpf, matricula, imposto) 
select numero, data_venda, cpf, substring(matricula, 3,3), imposto from sucos_vendas.notas_fiscais;

-- Exibição de todos os campos da tabela notas
select * from notas;

-- Exibição do campo número da tabela notas onde a condição where for verdadeira após inner join onde o campo cpf seja o mesmo nas duas
-- tabelas
select a.numero from notas A
inner join clientes B on a.cpf = b.cpf
where b.idade <= 18;

-- Deleção da tabela notas, chamada de A, onde a condi~çao do where for verdadeira e com base no inner join onde os campos cpf de ambas 
-- tabelas sejam iguais
delete A from notas A
inner join clientes B on a.cpf = b.cpf
where b.idade <= 18;
