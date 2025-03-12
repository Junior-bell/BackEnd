/*program to create table using jdbc*/
		package jdbc;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
		
	public class InsertRecord
		{
			public static void main(String[] args) 
			{
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
					Statement stmt=con.createStatement();//method to execute static sql queries
					stmt.executeUpdate("insert into student values(5,'eee',45)");//method to execute dml-data manipulation language sql queries
					//stmt.executeUpdate("insert into student values(2,'bbb',53)");
					System.out.println("two record inserted successfully");
				} catch (ClassNotFoundException | SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
	}

