package tryexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Assignment1 {

	public static void main(String[] args) {

		String connectionUrl="jdbc:mysql://localhost:3306/test";

		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");

		){
			String query="insert into DEPT values(1005, 'aj', 900, 10, 'produce')";
			Statement stmt=conn.createStatement();
			stmt.execute(query);
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
	}

}
