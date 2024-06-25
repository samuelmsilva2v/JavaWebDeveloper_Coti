package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entities.Aluno;
import factories.ConnectionFactory;

public class AlunoRepository {

	private ConnectionFactory connectionFactory = new ConnectionFactory();

	public void inserir(Aluno aluno) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("INSERT INTO aluno(nome, matricula, cpf) VALUES(?, ?, ?)");
		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.execute();

		connection.close();

		System.out.println("\nAluno cadastrado com sucesso!");
	}

	public void atualizar(Aluno aluno) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("UPDATE aluno SET nome=?, matricula=?, cpf=? WHERE id=?");
		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.setInt(4, aluno.getId());
		statement.execute();

		connection.close();

		System.out.println("\nAluno atualizado com sucesso!");

	}

	public void excluir(Integer id) throws Exception {

		Connection connection = connectionFactory.getConnection();

		PreparedStatement statement = connection.prepareStatement("DELETE FROM aluno WHERE id=?");
		statement.setInt(1, id);
		statement.execute();

		connection.close();

		System.out.println("\nAluno deletado com sucesso.");

	}
	
	public void consultar() throws Exception {
		
		Connection connection = connectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("SELECT id, nome, matricula, cpf FROM aluno");
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println("ID: "+ resultSet.getInt("id"));
			System.out.println("Nome: "+ resultSet.getString("nome"));
			System.out.println("Matrícula: "+ resultSet.getString("matricula"));
			System.out.println("CPF: "+ resultSet.getString("cpf"));
			System.out.println("...");
		}
		
		connection.close();
	}
}
