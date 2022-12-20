use vendas_sucos;

-- Criação de PKs para a tabela itens_notas com PKs das tabelas vendas vendas e produtos
ALTER TABLE itens_notas ADD CONSTRAINT FK_VENDAS
FOREIGN KEY (numero)
REFERENCES vendas (numero);

ALTER TABLE itens_notas ADD CONSTRAINT FK_PRODUTOS
FOREIGN KEY (numero)
REFERENCES produtos (numero);
