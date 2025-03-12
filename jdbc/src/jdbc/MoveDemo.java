/*program to move cursor to in resultset */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MoveDemo {

	public static void main(String[] args) 
	{
       try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
		   Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		   ResultSet rs=stmt.executeQuery("select * from student");
		   rs.absolute(3);//get cursor to the 3rd row 
		   ResultSetMetaData rsmd=rs.getMetaData();//method to retrieve the column name from the resultset.
		   int n=rsmd.getColumnCount();
		   for(int i=1;i<=n;i++)
		   {
			   System.out.print(rsmd.getColumnName(i)+"\t");
		   }
		   System.out.println();
		   System.out.print(rs.getInt("Rollno")+"\t");
		   System.out.print(rs.getString("name")+"\t");
		   System.out.println(rs.getInt("marks")+"\t");
	} catch (ClassNotFoundException | SQLException e) 
    {
		e.printStackTrace();
	}
       
	}

}
