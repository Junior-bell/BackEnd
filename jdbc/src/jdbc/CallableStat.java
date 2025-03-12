/*program to demonstrate CallableStatement with in and output parameters*/
package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStat {

	public static void main(String[] args) 
	{
       try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
		   CallableStatement cstmt=con.prepareCall("call getmarks(?,?)");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter rollno: ");
		   int rno=sc.nextInt();
		   cstmt.setInt(1, rno);
		   cstmt.registerOutParameter(2, Types.INTEGER);
		   cstmt.execute();//we can use any statement methods also due multi level inheritance 
		   int x=cstmt.getInt(2);
		   System.out.println(x);
		   sc.close();
	} catch (ClassNotFoundException | SQLException e) 
    {
		e.printStackTrace();
	}
       
       
	}

}
