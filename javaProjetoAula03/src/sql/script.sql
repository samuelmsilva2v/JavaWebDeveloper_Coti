-- Criando a tabela de produtos
CREATE TABLE produto(
	id			SERIAL			PRIMARY KEY,
	nome 		VARCHAR(100) 	NOT NULL,
	preco 		DECIMAL			NOT NULL,
	quantidade 	INT
);

--Cadastrando produtos na tabela
INSERT INTO produto(nome, preco, quatidade)
VALUES 
('Notebook Dell Core i7', 6000.00, 10),
('Tablet Samsung', 5000.00, 20),
('Playstation 5', 4500.00, 15);

--Consultando os dados dos produtos
SELECT id, nome, preco, quantidade
FROM produto
ORDER BY nome ASC;