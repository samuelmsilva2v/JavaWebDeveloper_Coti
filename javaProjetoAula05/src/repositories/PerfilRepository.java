package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Perfil;
import factories.ConnectionFactory;

public class PerfilRepository {

	/*
	 * Método para consultar e retornar uma lista com todos os perfis cadastrados na
	 * tabela do banco de dados
	 */
	public List<Perfil> findAll() throws Exception {

		// abrindo conexão com o banco de dados
		Connection connection = ConnectionFactory.getConnection();

		// escrevendo comando SQL para consultar os perfis no banco de dados
		PreparedStatement statement = connection.prepareStatement("SELECT id, nome FROM perfil ORDER BY id");

		// executando a consulta no banco e capturando os registros obtidos
		ResultSet resultSet = statement.executeQuery();

		// criando uma lista
		List<Perfil> lista = new ArrayList<>();

		// percorrer todos os perfis cadastrados no banco de dados
		while (resultSet.next()) {

			Perfil perfil = new Perfil();
			perfil.setId(resultSet.getInt("id"));
			perfil.setNome(resultSet.getString("nome"));

			lista.add(perfil);
		}

		// fechando a conexão com o banco de dados
		connection.close();

		// retornando a lista
		return lista;

	}
}
