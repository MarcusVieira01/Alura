use vendas_sucos;

insert into vendedores (matricula, nome, bairro, comissao)
values
	('235', 'Márcio Almeida Silva', 'Tijuca', 0.08),
	('236', 'Cláudia Morais', 'Jardins', 0.08),
    ('237', 'Roberta Martins', 'Copacabana', 0.11),
    ('238', 'Péricles Alves', 'Santo Amaro', 0);
    
select * from vendedores;

update vendedores
set data_admissao = '2014-08-15'
where matricula = '235';

update vendedores
set data_admissao = '2013-09-17'
where matricula = '236';

update vendedores
set data_admissao = '2017-03-18'
where matricula = '237';

update vendedores
set data_admissao = '2016-08-21'
where matricula = '238';
