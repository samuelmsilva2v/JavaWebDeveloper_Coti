package factories;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Classe para fornecer a conexão de banco de dados
 * para os demais repositórios do projeto
 */
public class ConnectionFactory {
	
	/*
	 * Método para abrir e retornar uma conexão
	 * com banco de dados PostGreSQL
	 */
	public Connection getConnection() throws Exception {
		
		//variáveis para conexão com o banco de dados
				String driver = "org.postgresql.Driver";
				String url = "jdbc:postgresql://localhost:5432/javaProjetoAula03";
				String user = "postgres";
				String pass = "password";
				
				//abrindo conexão com o banco de dados
				Class.forName(driver);
				return DriverManager.getConnection(url, user, pass);
	}
}
