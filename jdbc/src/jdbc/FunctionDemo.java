package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionDemo {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			CallableStatement cstmt=con.prepareCall("{ ?= call totalmarks()}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			int total=cstmt.getInt(1);
			System.out.println(total);
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
