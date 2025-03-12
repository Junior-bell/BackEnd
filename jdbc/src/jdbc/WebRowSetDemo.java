/*program to demonstrate WebRowSet */
package jdbc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WebRowSetDemo //WebRowSet is used to create or write sql query into xml file
{

	public static void main(String[] args) 
	{
	  try {
		WebRowSet wrs=new OracleWebRowSet();
		  wrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		  wrs.setUsername("c##oracle11am");
		  wrs.setPassword("nareshit");
		  wrs.setCommand("select * from student");
		  wrs.execute();//method to execute the sql query
		  FileOutputStream fos=new FileOutputStream("student.xml");//
		  wrs.writeXml(fos);
		  wrs.close();
	} catch (SQLException | IOException e) 
	  {
	
		e.printStackTrace();
	}
	  
     
	}

}
