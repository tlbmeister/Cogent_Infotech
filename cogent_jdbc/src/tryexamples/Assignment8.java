package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {

		String connectionUrl="jdbc:mysql://localhost:3306/test";
		Scanner sc=new Scanner(System.in);

		
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				

		){
			CallableStatement cstmt =conn.prepareCall("select * from DEPT where emp_salary > (select AVG(emp_salary) from DEPT)");
			ResultSet rs=cstmt.executeQuery();
			int salary=0;
			int num=0;
			int deptNum=0;
			String deptName="";
			String empName="";
			while(rs.next()) {
						num=rs.getInt(1);
						empName=rs.getString(2);
						salary=rs.getInt(3);
						deptNum=rs.getInt(4);
						deptName=rs.getString(5);
						
						System.out.println("Employee number: "+num);
						System.out.println("Employee name: "+empName);
						System.out.println("Employee salary: "+salary);
						System.out.println("Employee department number: "+deptNum);
						System.out.println("Employee department name: "+deptName);
						System.out.println("");
			}
			
			


			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
	}

}
