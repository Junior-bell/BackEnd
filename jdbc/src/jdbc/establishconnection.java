/*program to establish the connection between java application and oracle 
 database by using type 4 driver*/
package jdbc; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 public class establishconnection
 {
	 public static void main(String args[])
	 {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am", "nareshit");
			 System.out.println("connection established successfully");
		} catch (ClassNotFoundException | SQLException e) 
		 {
			e.printStackTrace();
		}
	 }
 }

