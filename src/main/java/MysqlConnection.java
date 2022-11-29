import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	private Connection connection = null;
	private String DB_URL = "jdbc:mysql://127.0.0.1:3306/";
	private String DB_name = "bdd";
	private String USER = "root";
	private String PASSWORD = "root";

	public Connection createConnection() {
		
		try {
			// Load JDBC DRIVER CLASS
			Class c = Class.forName("com.mysql.jdbc.Driver");
			// create a connection using ge Connection
			//
			this.connection = DriverManager.getConnection(DB_URL + DB_name, USER, PASSWORD);

			return connection;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}
	
	public void closeConnection () {
		 try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
