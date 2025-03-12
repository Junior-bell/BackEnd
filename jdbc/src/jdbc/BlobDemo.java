/*program to how to pass Blob(binary large object ) into oracle database*/
package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobDemo {

	public static void main(String[] args) 
	{
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
		 PreparedStatement pstmt=con.prepareStatement("insert into flower values(?,?)");
		 pstmt.setString(1, args[0]);//inserting the first record into first column of flower table in oracle database.
		 FileInputStream fis=new FileInputStream(args[1]);//passing second record which is blob data-type into the 2 column of the flower table in oracle database.
		 pstmt.setBinaryStream(2, fis, fis.available());
		 pstmt.executeUpdate();
		 System.out.println("one image inserted successfully");
		 fis.close();
	} catch (ClassNotFoundException | SQLException | IOException e) 
	 {
		e.printStackTrace();
	}
	 

	}

}
