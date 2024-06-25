-- Criando a tabela de alunos
CREATE TABLE aluno(
	id 			SERIAL 			PRIMARY KEY,
	nome 		VARCHAR(100) 	NOT NULL,
	matricula 	VARCHAR(100) 	NOT NULL,
	cpf			VARCHAR(100)	NOT NULL
)

-- Consultando os dados dos alunos
SELECT * 
FROM aluno
ORDER BY nome ASC;

