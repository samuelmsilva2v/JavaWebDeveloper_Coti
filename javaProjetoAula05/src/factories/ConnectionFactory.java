package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection getConnection() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/projetoaula05";
		String user = "root";
		String pass = "password";

		Class.forName(driver);
		return DriverManager.getConnection(url, user, pass);

	}
}
