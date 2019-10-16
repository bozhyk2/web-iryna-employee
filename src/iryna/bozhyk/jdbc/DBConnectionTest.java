package iryna.bozhyk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class DBConnectionTest {
	
	public static void main(String [] args) {
	
		String urlConnection = "jdbc:mysql://localhost:3306/web_employee?useSSL=false&serverTimezone=UTC";
	 String user = "hbstudent";
	 String password = "hbstudent";
		
		
		try(Connection connection = DriverManager.getConnection(urlConnection, user, password)){
			System.out.println ("Connection successfull");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
