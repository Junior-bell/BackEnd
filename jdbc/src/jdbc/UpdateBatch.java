package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBatch {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into student values(7,'ggg',35");/*add batch is the method by 
			                                                   which we can pass the queries to 
			                                                   the database in the form of batch*/
			stmt.addBatch("update student set marks=45 where rollno=5");
			stmt.addBatch("delete from student where rollno=6");
			stmt.executeBatch();
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
