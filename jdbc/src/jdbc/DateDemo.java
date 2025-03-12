/* JDBC program to demonstrate Prepared Statement with java.sql.Date Class*/
package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DateDemo {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?, ?, ?)");// spaces and ,(comma) is very important here otherwise you will get SQLSyntaxError 
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setDate(3, Date.valueOf(args[2]));
			pstmt.executeUpdate();
			System.out.println("one record inserted successfully");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		

	}

}
