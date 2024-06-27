package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entities.Usuario;
import factories.ConnectionFactory;

public class UsuarioRepository {

	/*
	 * Método para inserir um usuário no banco de dados
	 */
	public void insert(Usuario usuario) throws Exception {

		// abrindo conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();

		// executando um comando SQL no banco de dados
		PreparedStatement statement = connection
				.prepareStatement("INSERT INTO usuario(nome, email, senha, perfil_id) VALUES(?, ?, md5(?), ?)");

		// preencher as variáveis do comando INSERT
		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());
		statement.setInt(4, usuario.getPerfil().getId());
		statement.execute();

		// fechando a conexão
		connection.close();
		
	}
}
