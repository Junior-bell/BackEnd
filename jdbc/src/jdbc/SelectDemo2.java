/*Program to demonstrate prepared statement with scanner class */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectDemo2 {

	public static void main(String[] args) throws Exception
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "C##oracle11am", "nareshit");
			PreparedStatement pstmt=con.prepareStatement("select * from student where rollno=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rollno :");
			int rollno=sc.nextInt();
			pstmt.setInt(1, rollno);
			ResultSet rs=pstmt.executeQuery();
			ResultSetMetaData rm=rs.getMetaData();//this method (ResultSetMetadata ) is used to extract the field/column name from the database 
			int n=rm.getColumnCount();
			for(int i = 1;i<=n;i++)//loop to print the column name from the table in database
			{
				System.out.print(rm.getColumnName(i)+"\t");
				
			}
			System.out.println();
			rs.next();			
		    System.out.print(rs.getInt(1)+"\t");
		    System.out.print(rs.getString(2)+"\t");
		    System.out.println(rs.getInt(3));
            sc.close();
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
        
	}

}
