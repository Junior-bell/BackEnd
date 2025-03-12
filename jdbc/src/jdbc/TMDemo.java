/*program to demonstrate setAutoCommit(),RollBack(),commit() methods*/
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TMDemo //methods used in transaction management control 
{

	public static void main(String[] args) 
	{
	  try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
		  Statement stmt=con.createStatement();
		  con.setAutoCommit(false);
		  stmt.executeUpdate("insert into student values (8,'hhh',92)");
		  con.commit();
		  stmt.executeUpdate("insert into student values(9,'iii',24)");
		  con.rollback();
		  stmt.executeUpdate("delete from student where rollno=5");
		  con.commit();
	} catch (ClassNotFoundException | SQLException e) 
	  {
		
		e.printStackTrace();
	}
	  
	  
	}

}
