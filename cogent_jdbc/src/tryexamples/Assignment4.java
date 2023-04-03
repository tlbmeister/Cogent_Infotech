package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		Scanner sc=new Scanner(System.in);

		
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				

		){
			CallableStatement cstmt =conn.prepareCall("select * from DEPT");
			ResultSet rs=cstmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getInt(4)==10||rs.getInt(4)==30) {
					System.out.println("Employee number: "+rs.getInt(1));
					System.out.println("Employee name: "+rs.getString(2));
					System.out.println("Employee salary: "+rs.getInt(3));
					System.out.println("Employee department number: "+rs.getInt(4));
					System.out.println("Employee department name: "+rs.getString(5));
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
