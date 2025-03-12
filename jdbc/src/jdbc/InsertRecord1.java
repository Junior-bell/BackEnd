/*program to demonstrate Callable statement
 (inserting records through pl/sql and procedures */

package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertRecord1 {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			CallableStatement cstmt=con.prepareCall("call insertpro(?,?,?)");
			cstmt.setInt(1, Integer.parseInt(args[0]));
			cstmt.setString(2, args[1]);
			cstmt.setInt(3, Integer.parseInt(args[2]));
			cstmt.execute();
			System.out.println("one recored inserted successfully");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) 
		{
						e.printStackTrace();
		}
		
	}

}
