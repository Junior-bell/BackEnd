package jdbc;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClobDemo {

	public static void main(String[] args) 
	{
      try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
		  PreparedStatement pstmt=con.prepareStatement("insert into flower values (?,?)");
		  pstmt.setString(1, args[0]);
		  FileReader fw=new FileReader(args[1]);
     	  pstmt.setCharacterStream(2,fw);
		  pstmt.executeUpdate();
		  System.out.println("one image inserted successfully");
	} catch (ClassNotFoundException | FileNotFoundException | SQLException e) 
      {
		
		e.printStackTrace();
	}


	}

}
