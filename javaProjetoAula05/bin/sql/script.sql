-- Criando e acessando o banco
CREATE DATABASE projetoaula05;
USE projetoaula05;

-- Criando tabela perfil
CREATE TABLE perfil(
	id			INTEGER			AUTO_INCREMENT,
	nome		VARCHAR(25)		NOT NULL UNIQUE,
	PRIMARY KEY(id)
);

-- Inserindo valores na tabela perfil
INSERT INTO perfil(nome) VALUES ('ADMINISTRADOR');
INSERT INTO perfil(nome) VALUES ('OPERADOR');

-- Acessando todos os dados da tabela perfil
SELECT * FROM perfil;

-- Criando tabela usuario
CREATE TABLE usuario(
	id			INTEGER			AUTO_INCREMENT,
	nome		VARCHAR(100)	NOT NULL,
	email 		VARCHAR(50)		NOT NULL UNIQUE,
	senha		VARCHAR(100)	NOT NULL,
	perfil_id	INTEGER			NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(perfil_id) REFERENCES perfil(id)
);

-- Acessando todos os dados da tabela usuario
SELECT * FROM usuario;