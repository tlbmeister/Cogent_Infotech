package tryexamples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {

		
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		Scanner sc=new Scanner(System.in);

		
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				

		){
			CallableStatement cstmt =conn.prepareCall("select * from DEPT where dept_num=30");
			ResultSet rs=cstmt.executeQuery();
			int salary=0;
			int num=0;
			int deptNum=0;
			String deptName="";
			String empName="";
			while(rs.next()) {
					if(rs.getInt(3)>salary){
						num=rs.getInt(1);
						empName=rs.getString(2);
						salary=rs.getInt(3);
						deptNum=rs.getInt(4);
						deptName=rs.getString(5);
						
					}
			}
			System.out.println("Max salary in dept 30: ");
			System.out.println("Employee name: "+empName);
			System.out.println("");
			
			
		}catch(Exception e) {
			e.printStackTrace();;
		}
	}

}
