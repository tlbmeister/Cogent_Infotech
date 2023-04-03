package tryexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		Scanner sc=new Scanner(System.in);

		
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				

		){
			System.out.println("Enter a department number: ");
			int num=sc.nextInt();
			String query="update DEPT set emp_salary=5000 where dept_num="+num;
			Statement stmt=conn.createStatement();
			stmt.execute(query);
			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
