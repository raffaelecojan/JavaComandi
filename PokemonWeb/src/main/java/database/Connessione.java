package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://127.0.0.1:3306/java_be";
	private final String USER = "root";
	private final String PASS = "root";
	
	private Connection conn = null;//lazy

	public Connection getConn() {
	
		if (conn == null) 
			connetti();
		
		return conn;
	}
	
	private void connetti()  {

		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso");
		} catch (SQLException e) {
			System.err.printf("Si è verificato un'eccezione SQL %s",
					e.getMessage());
		}
		
		
	}
	
	
	
	
	
}
