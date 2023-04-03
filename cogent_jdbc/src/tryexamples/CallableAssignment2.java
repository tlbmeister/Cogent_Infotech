package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableAssignment2 {

	public static void main(String[] args) {

		
		String sql="call proc_dname(1005)";
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				
				
		){

			CallableStatement stmt =conn.prepareCall(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Department name: "+rs.getString(5));
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
