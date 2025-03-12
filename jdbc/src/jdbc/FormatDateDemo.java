/*JDBC program to change the date format*/
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatDateDemo 
{

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			PreparedStatement pstmt=con.prepareStatement("insert into emp1 values(?,?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");//give user-defined date format here
			java.util.Date d1=sdf.parse(args[2]);
			long l=d1.getTime();
			java.sql.Date d2=new java.sql.Date(l);
			pstmt.setDate(3, d2);
			pstmt.executeUpdate();
			System.out.println("one record inserted successfully");
		} catch (NumberFormatException | ClassNotFoundException | SQLException | ParseException e) 
		{
			e.printStackTrace();
		}
	
	}

}
