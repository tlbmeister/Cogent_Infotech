package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableAssignment1 {

	public static void main(String[] args) {

		
		String sql="call proc_empname(1001)";
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				
				
		){
			CallableStatement stmt =conn.prepareCall(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Employee name: "+rs.getString(2));
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
