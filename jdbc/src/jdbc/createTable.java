/*program to establish the connection between java application and oracle 
 database by using type 4 driver*/
package jdbc; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 public class createTable
 {
	 public static void main(String args[])
	 {
		 try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
	 Statement stmt = con.createStatement();//method to pass static sql queries
	 stmt.execute("create table student (rollno number(3),name varchar2(10),marks number(3))");//this method is suitable to execute non-select/DDL-data definition language sql queries
	 System.out.println("table created successfully");
		 }
		 catch(ClassNotFoundException | SQLException e)
		 {
			 e.printStackTrace();
		 }
	 }
 }

