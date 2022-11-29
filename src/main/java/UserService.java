import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	private final String insertQuery = "INSERT INTO `USER` (`name`, `lastname`, `company`) " + "VALUES (?,?,?)";
	private final String selectAllQuery = "SELECT * FROM USER";
	private final String updateQuery = "UPDATE USER SET name = ? , lastname =?  , company = ? WHERE id =?" ; 
	private final String  deletQuery = "DELETE USER WHERE id =?";

	public UserService() {
	}

	public void insterUser(User user) {
		MysqlConnection mysql = new MysqlConnection();

		try {
			PreparedStatement statement = mysql.createConnection().prepareStatement(this.insertQuery);

			statement.setString(1, user.getFirstname());
			statement.setString(2, user.getLastname());
			statement.setString(3, user.getCompany());

			System.out.println(statement);

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			mysql.closeConnection();
		}

	}

	public List<User> selectAllUsers() {
		List<User> users = new ArrayList<User>();
		MysqlConnection mysql = new MysqlConnection();

		try {
			PreparedStatement preparedStatement = mysql.createConnection().prepareStatement(this.selectAllQuery);
			System.out.println(preparedStatement);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				User user = new User(resultSet.getLong("id"), resultSet.getString("name"),
						resultSet.getString("lastname"), resultSet.getString("company"));
				users.add(user);
			}
			mysql.closeConnection();
			return users;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	
	public boolean updateUser (User user ) {
		boolean updated ; 
		try {
			MysqlConnection mysql = new MysqlConnection();
			PreparedStatement statement  = mysql.createConnection()
					.prepareStatement(this.updateQuery) ;  
			statement.setString(1, user.getFirstname());
			statement.setString(2, user.getLastname());
			statement.setString(3, user.getCompany());
			statement.setLong(4, user.getId());
			
			 updated =  statement.executeUpdate()>0 ; 
			 mysql.closeConnection();
			 return  updated ; 
			
		}catch(Exception e){
			System.out.println(e);
			return false;  
		}
	}
		
		public boolean deleteUser (long idUser ) {
			boolean deleted ; 
			try {
				MysqlConnection mysql = new MysqlConnection();
				PreparedStatement statement  = mysql.createConnection()
						.prepareStatement(this.deletQuery) ;  
				statement.setLong(0, idUser);
				
				 deleted =  statement.executeUpdate()>0;
				 mysql.closeConnection();
				 return  deleted ; 
				
			}catch(Exception e){
				System.out.println(e);
				return false;  
			}
		
	}

}
