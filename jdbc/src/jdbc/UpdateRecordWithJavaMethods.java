package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordWithJavaMethods {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select Rollno,name,marks from student");
			rs.absolute(3);
			rs.updateInt(3, 40);
			rs.updateRow();
			System.out.println("one record updated successfully");
		} catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
