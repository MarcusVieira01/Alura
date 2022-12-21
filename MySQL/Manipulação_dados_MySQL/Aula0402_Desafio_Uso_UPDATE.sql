use vendas_sucos;

update clientes
set endereco = 'R. Jorge Emílio 23', bairro = 'Santo Amaro', cidade = 'São Paulo', estado = 'SP', cep = '8833223'
where cpf = '19290992743';

select * from clientes where cpf = '19290992743';


