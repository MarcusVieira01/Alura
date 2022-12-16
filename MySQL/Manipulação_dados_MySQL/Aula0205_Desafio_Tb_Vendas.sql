use vendas_sucos;

CREATE TABLE `vendas_sucos`.`vendas` (
  `numero` VARCHAR(5) NOT NULL,
  `data_venda` DATE NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `matricula` VARCHAR(5) NOT NULL,
  `imposto` FLOAT NULL,
  PRIMARY KEY (`numero`));