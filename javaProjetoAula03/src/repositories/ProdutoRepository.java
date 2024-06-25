package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entities.Produto;
import factories.ConnectionFactory;

public class ProdutoRepository {
	
	//atributos
	private ConnectionFactory connectionFactory = new ConnectionFactory();

	/*
	 * Método para inserir um produto na tabela do banco de dados
	 */
	
	public void inserir(Produto produto) throws Exception {
		
		//abrindo conexão com banco de dados
		Connection connection = connectionFactory.getConnection();
		
		//executando um comando SQL no banco de dados
		PreparedStatement statement = connection.prepareStatement("INSERT INTO produto(nome, preco, quantidade) VALUES(?, ?, ?)");
		statement.setString(1, produto.getName());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.execute();
		
		//fechando a conexão com o banco de dados
		connection.close();
		
		System.out.println("\nProduto cadastrado com sucesso!");
	}
	
	/*
	 * Método para atualizar um produto na tabela do banco de dados
	 */
	public void atualizar(Produto produto) throws Exception {
		
		Connection connection = connectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("UPDATE produto SET nome=?, preco=?, quantidade=? WHERE id=?");
		statement.setString(1, produto.getName());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.setInt(4, produto.getId());
		statement.execute();
		
		connection.close();
		
		System.out.println("\nProduto atualizado com sucesso!");
	}
	
	/*
	 * Método para excluir um produto na tabela do banco de dados
	 */
	public void excluir(Integer id) throws Exception {
		
		Connection connection = connectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("DELETE FROM produto WHERE id=?");
		statement.setInt(1, id);
		statement.execute();
		
		connection.close();
		
		System.out.println("\nProduto excluído com sucesso!");
	}
	
	/*
	 * Método para consultar todos os produtos cadastrados na tabela do banco de dados
	 */
	public void consultar() throws Exception {
		
		Connection connection = connectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("SELECT id, nome, preco, quantidade FROM produto");
		ResultSet resultSet = statement.executeQuery(); //lendo os registros obtidos do banco (consulta)
		
		//percorrendo cada registro obtido do banco
		while(resultSet.next()) { //enquanto houver registros, leia...
			
			System.out.println("ID: "+ resultSet.getInt("id"));
			System.out.println("Nome: "+ resultSet.getString("nome"));
			System.out.println("Preço: "+ resultSet.getDouble("preco"));
			System.out.println("Quantidade: "+ resultSet.getInt("quantidade"));
			System.out.println("...");
		}
		
		connection.close();
	}
}
