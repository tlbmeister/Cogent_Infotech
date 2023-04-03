package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		String connectionUrl="jdbc:mysql://localhost:3306/test";
		Scanner sc=new Scanner(System.in);

		
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				

		){
			System.out.println("Enter an employee number: ");
			int num=sc.nextInt();
			String query="update DEPT set emp_salary=1000 where emp_num="+num;
			Statement stmt=conn.createStatement();
			stmt.execute(query);
			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
