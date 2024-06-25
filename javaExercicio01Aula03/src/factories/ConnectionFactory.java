package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() throws Exception {
		
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/javaExercicioAula03";
		String user = "postgres";
		String pass = "password";
		
		Class.forName(driver);
		return DriverManager.getConnection(url, user, pass);
	}
}
