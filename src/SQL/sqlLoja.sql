-- Banco de Dados MySql
CREATE DATABASE loja;

USE DATABASE loja;
--------------------------
--Tabela Cidade
--------------------------
CREATE TABLE IF NOT EXISTS `cidade` (
  `id_cid` INT NOT NULL AUTO_INCREMENT,
  `nome_cid` VARCHAR(45)  NOT NULL,
  `sigla_uf` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id_cid`))
;
---------------------------
--Tabela Cliente
---------------------------
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cli` INT NOT NULL AUTO_INCREMENT,
  `nome_cli` VARCHAR(60) NOT NULL,
  `sexo_cli` CHAR(1) NOT NULL,
  `telefone` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `bairro` VARCHAR(45) NULL DEFAULT NULL,
  `numero` VARCHAR(45) NULL DEFAULT NULL,
  `id_cid` INT NOT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `cep` VARCHAR(45) NULL DEFAULT NULL,
  `rua` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_cli`),
  CONSTRAINT 
    FOREIGN KEY (`id_cid`)
    REFERENCES `cidade` (`id_cid`)
);
---------------------------
--Tabela venda
---------------------------
CREATE TABLE IF NOT EXISTS `venda` (
  `id_ven` INT NOT NULL AUTO_INCREMENT,
  `data_ven` DATE NOT NULL,
  `valor_ven` DOUBLE NOT NULL,
  `id_cli` INT NOT NULL,
  PRIMARY KEY (`id_ven`),
  CONSTRAINT FOREIGN KEY (`id_cli`)
    REFERENCES `cliente` (`id_cli`),
INDEX `fk_venda_id_cli` (`id_cli`))
;
---------------------------
--Tabela Parcela
---------------------------
CREATE TABLE IF NOT EXISTS `parcela` (
  `id_par` INT NOT NULL AUTO_INCREMENT,
  `data_venc` DATE NOT NULL,
  `valor_parc` DOUBLE NOT NULL,
  `data_pgmt` DATE NULL DEFAULT NULL,
  `valor_pago` DOUBLE NULL DEFAULT NULL,
  `id_ven` INT NOT NULL,
  PRIMARY KEY (`id_par`, `id_ven`),
  CONSTRAINT
    FOREIGN KEY (`id_ven`)
    REFERENCES `venda` (`id_ven`),
INDEX `fk_parcela_id_ven`  (`id_ven`))
;
---------------------------
--Tabela Classe Tipo de Produto
---------------------------
CREATE TABLE IF NOT EXISTS `classe` (
  `id_cla` INT NOT NULL AUTO_INCREMENT,
  `nome_cla` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cla`))
;
---------------------------
--Tabela Produto
---------------------------
CREATE TABLE IF NOT EXISTS `produto` (
  `id_pro` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  `desc_pro` VARCHAR(255) NOT NULL,
  `valor_pro` DOUBLE NOT NULL,
  `qtde_pro` INT NOT NULL,
  `id_cla` INT NOT NULL,
  PRIMARY KEY (`id_pro`),
  CONSTRAINT FOREIGN KEY (`id_cla`)
    REFERENCES `classe` (`id_cla`),
INDEX `fk_produto_id_cla`  (`id_cla`))
;
---------------------------
--Tabela ProdutoVendido
---------------------------
CREATE TABLE IF NOT EXISTS `produto_vendido` (
  `id_ven` INT NOT NULL,
  `id_pro` INT NOT NULL,
  `qtde_ven` INT NOT NULL,
  PRIMARY KEY (`id_ven`, `id_pro`),
  CONSTRAINT  FOREIGN KEY (`id_ven`)
    REFERENCES `venda`(`id_ven`),
  CONSTRAINT FOREIGN KEY (`id_pro`)
    REFERENCES `produto` (`id_pro`),
INDEX `fk_proven_id_ven` (`id_ven`),
INDEX `fk_proven_id_pro` (`id_pro`))
;

-- -----------------------------------------------------
-- Table `loja`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `login` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));