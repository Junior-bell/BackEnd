/*program to demonstrate SavePoint is transaction management system */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavePointDemo {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			stmt.executeUpdate("insert into student values(11,'kkk',48)");
			Savepoint sp=con.setSavepoint();
			stmt.executeUpdate("insert into student values(10,'jjj',34)");
			con.rollback(sp);
			stmt.executeUpdate("delete from student where rollno=4");
			con.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
	
		}

	}

}
