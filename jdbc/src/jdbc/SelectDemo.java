/*program to retrieve data from database */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL",	"c##oracle11am", "nareshit");
			Statement stmt=con.createStatement();//method used execute static sql queries
			ResultSet rs=stmt.executeQuery("select * from student");//executeQuery method is used to pass dql-data query language of sql queries
			ResultSetMetaData rm=rs.getMetaData();//this method (ResultSetMetadata ) is used to extract the field/column name from the database 
			int n=rm.getColumnCount();
			for(int i = 1;i<=n;i++)//loop to print the column name from the table in database
			{
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next())// loop to print the record/rows from the table in database.
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
			    System.out.println(rs.getInt(3));
				
				}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}