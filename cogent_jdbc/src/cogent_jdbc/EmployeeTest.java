package cogent_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EmployeeTest {

	public static void main(String[] args) {

		String sql="call retreive_persons";
		String query="insert into employee(emp_no,emp_name,emp_salary) values(1002,'Shiva', 3000)";
		String connectionUrl="jdbc:mysql://localhost:3306/test";
		try(
				
				Connection conn=DriverManager.getConnection(connectionUrl,"root","Tmeister0");
				
				
				
		){
//			ResultSet rs=stmt.executeQuery("select * from employee");
//			ResultSetMetaData rsMetaData=rs.getMetaData();
//			int numberOfColumns=rsMetaData.getColumnCount();
//			System.out.println("Total number of columns are: "+numberOfColumns);
//			for(int i=1;i<numberOfColumns;i++) {
//				String columnName=rsMetaData.getColumnName(i);
//				System.out.println("Column number is: "+i);
//				System.out.println("Column name is: "+columnName);
//				System.out.println(rsMetaData.getTableName(i));
//
//			}
			CallableStatement stmt =conn.prepareCall(sql);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("First name: "+rs.getString(2));
				System.out.println("Last name: "+rs.getString(3));
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
