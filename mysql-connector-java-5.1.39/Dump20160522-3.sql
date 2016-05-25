-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.9 - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para clinica
DROP DATABASE IF EXISTS `clinica`;
CREATE DATABASE IF NOT EXISTS `clinica` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinica`;


-- Copiando estrutura para tabela clinica.agenda
DROP TABLE IF EXISTS `agenda`;
CREATE TABLE IF NOT EXISTS `agenda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `procedimento` varchar(30) NOT NULL,
  `horario` time DEFAULT NULL,
  `pacienteID` int(11) NOT NULL,
  `funcID` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.agenda: ~0 rows (aproximadamente)
DELETE FROM `agenda`;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.agendamento
DROP TABLE IF EXISTS `agendamento`;
CREATE TABLE IF NOT EXISTS `agendamento` (
  `nome` varchar(50) NOT NULL,
  `procedimento` varchar(50) NOT NULL,
  `dentista` varchar(50) NOT NULL,
  `especialidade` varchar(50) NOT NULL,
  `data` date NOT NULL,
  `hora` char(8) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.agendamento: 0 rows
DELETE FROM `agendamento`;
/*!40000 ALTER TABLE `agendamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `agendamento` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.clinica
DROP TABLE IF EXISTS `clinica`;
CREATE TABLE IF NOT EXISTS `clinica` (
  `nome` varchar(30) NOT NULL,
  `razaosocial` varchar(20) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `cnpj` char(14) NOT NULL,
  `endereco` varchar(30) NOT NULL,
  PRIMARY KEY (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.clinica: ~0 rows (aproximadamente)
DELETE FROM `clinica`;
/*!40000 ALTER TABLE `clinica` DISABLE KEYS */;
/*!40000 ALTER TABLE `clinica` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.dentista
DROP TABLE IF EXISTS `dentista`;
CREATE TABLE IF NOT EXISTS `dentista` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL DEFAULT '0',
  `cro` varchar(10) NOT NULL,
  `especialidade` varchar(15) NOT NULL,
  `funcao` varchar(15) NOT NULL,
  `rg` varchar(15) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `salario` double NOT NULL,
  `rua` varchar(15) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `bairro` varchar(15) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `cidade` varchar(15) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cro` (`cro`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.dentista: ~1 rows (aproximadamente)
DELETE FROM `dentista`;
/*!40000 ALTER TABLE `dentista` DISABLE KEYS */;
INSERT INTO `dentista` (`id`, `nome`, `cro`, `especialidade`, `funcao`, `rg`, `cpf`, `salario`, `rua`, `numero`, `bairro`, `cep`, `cidade`) VALUES
	(1, 'Nome', '12313', 'Espcial', 'Função', 'RG', 'CPF', 5000, 'rua', 'numer', 'bairro', 'cep', 'cidade'),
	(3, 'Ewerton', '544', 'asdad', 'asdasd', 'rasdasd', '545454', 23121, 'asdasd', 'adasd', 'asdad', '23121', 'asdasd');
/*!40000 ALTER TABLE `dentista` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.despesaganho
DROP TABLE IF EXISTS `despesaganho`;
CREATE TABLE IF NOT EXISTS `despesaganho` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPaciente` int(11) NOT NULL,
  `mes` date DEFAULT NULL,
  `tipo` varchar(10) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.despesaganho: ~0 rows (aproximadamente)
DELETE FROM `despesaganho`;
/*!40000 ALTER TABLE `despesaganho` DISABLE KEYS */;
/*!40000 ALTER TABLE `despesaganho` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.funcionario
DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `rg` char(7) NOT NULL,
  `cpf` char(16) NOT NULL,
  `funcao` varchar(10) NOT NULL,
  `salario` double NOT NULL,
  `rua` varchar(15) NOT NULL,
  `numero` varchar(15) NOT NULL,
  `bairro` varchar(15) NOT NULL,
  `cep` varchar(15) NOT NULL,
  `cidade` varchar(15) NOT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.funcionario: ~9 rows (aproximadamente)
DELETE FROM `funcionario`;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` (`id`, `nome`, `rg`, `cpf`, `funcao`, `salario`, `rua`, `numero`, `bairro`, `cep`, `cidade`, `endereco`) VALUES
	(10, 'ttttttttttttttttt', '234', '234', 'sdfsdf', 234, 'sfsdf', '234', 'sdfsdf', '24234', 'sdfsdf', NULL),
	(11, 'ttttttttttttttttt', '234', '234', 'sdfsdf', 234, 'sfsdf', '234', 'sdfsdf', '24234', 'sdfsdf', NULL),
	(31, 'teste', '6565', '564.565.565 - 65', '65556', 6565, 'asdasd', '655', 'asdasd', '655', 'adasd', NULL),
	(32, 'foi?', '54564', '546.666.454 - 65', 'asdasd', 5464, 'asdd', '564', 'asdasd', '5464', 'cdasdad', NULL),
	(33, 'foi?', '54564', '546.666.454 - 65', 'asdasd', 5464, 'asdd', '564', 'asdasd', '5464', 'cdasdad', NULL),
	(34, 'agora', '545454', '588.787.878 - 78', '5adasda', 5644, 'asdad', '5445', 'sdasd', '545455', 'asdasd', NULL),
	(35, 'agora', '545454', '588.787.878 - 78', '5adasda', 5644, 'asdad', '5445', 'sdasd', '545455', 'asdasd', NULL),
	(36, 'Sera?', '55454', '545.654.545 - 45', '55454', 545454, 'asdad', '545', 'asdasd', '5554', 'asdads', NULL),
	(37, 'asasdadasdasdasdadas', '123123', '123.213.123 - 12', 'asdasd', 123123, 'aasdasd', '123', '123123', '123123', 'asasasd', NULL);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.login
DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `usuarios` varchar(20) NOT NULL,
  `senhas` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.login: 1 rows
DELETE FROM `login`;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`usuarios`, `senhas`) VALUES
	('admin', 'admin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.paciente
DROP TABLE IF EXISTS `paciente`;
CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `rg` char(7) NOT NULL,
  `cpf` char(14) NOT NULL,
  `dataNasc` char(10) NOT NULL,
  `rua` varchar(15) NOT NULL,
  `numero` varchar(5) NOT NULL,
  `bairro` varchar(15) NOT NULL,
  `cep` varchar(8) NOT NULL,
  `cidade` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.paciente: ~13 rows (aproximadamente)
DELETE FROM `paciente`;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` (`id`, `nome`, `rg`, `cpf`, `dataNasc`, `rua`, `numero`, `bairro`, `cep`, `cidade`) VALUES
	(1, 'asdaad', '123123', '123123', '22/22/2222', 'asdasd', '123', 'asdsa', 'asd123', 'asdsad'),
	(2, 'asdaad', '123123', '123123', '22/22/2222', 'asdasd', '123', 'asdsa', 'asd123', 'asdsad'),
	(3, 'asdaad', '123123', '123123', '22/22/2222', 'asdasd', '123', 'asdsa', 'asd123', 'asdsad'),
	(4, 'asdaad', '123123', '123123', '22/22/2222', 'asdasd', '123', 'asdsa', 'asd123', 'asdsad'),
	(5, 'Ewerton', '123125', '87889797', '11/10/1990', 'asdasd', '279', 'qwe5qweq78we', '6445', 'asdsadasdasdad'),
	(6, 'Ewerton', '123125', '87889797', '11/10/1990', 'asdasd', '279', 'qwe5qweq78we', '6445', 'asdsadasdasdad5'),
	(7, 'Teste', '888', '9999', '11/54/8758', 'nanan', '54', 'asdkasod', '8974', 'asasko'),
	(8, 'dnv', '887', '5555', '11/11/1111', 'eqweqe', '8787', 'adsadsss', '8787', 'ssss'),
	(9, 'asasdas', '21323', '1123213', '22/22/2222', 'asdasd', '213', 'dadasd', '123123', 'sadasd'),
	(10, 'aaaa', 'rsrsrs', '1231', '88/88/8888', 'asdasd', '21312', 'asdad', '123', 'aasasd'),
	(11, 'teste', 'td', '3123', '22/22/2222', 'asdasdasd', '123', 'asdasd', '123123', '123123'),
	(12, 'aaaaaaaaa', 'rrrrr', '1111', '33/33/3333', 'rrrrr', '222', 'bbbb', '2222', 'ccc'),
	(16, 'adad', '213', '123123', '12/31/2312', 'qaedasd', '123', 'asdasd', '123', 'asd');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;


-- Copiando estrutura para tabela clinica.procedimento
DROP TABLE IF EXISTS `procedimento`;
CREATE TABLE IF NOT EXISTS `procedimento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela clinica.procedimento: ~0 rows (aproximadamente)
DELETE FROM `procedimento`;
/*!40000 ALTER TABLE `procedimento` DISABLE KEYS */;
/*!40000 ALTER TABLE `procedimento` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
