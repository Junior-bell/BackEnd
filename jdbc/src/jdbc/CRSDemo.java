package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;//cached RowSet for all database.//note that it is in javax.sql package

import oracle.jdbc.rowset.OracleCachedRowSet;// cached RowSet for oracle database.//note that this RowSet is in oracle.jdbc.rowset 

public class CRSDemo //CachedRowSet 
{

	public static void main(String[] args) 
	{
	          try {
				CachedRowSet crs =new OracleCachedRowSet();/*cached RowSet of all database reference 
												is taken  and by which OracleRowSet is instantiated*/
				  crs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
				  crs.setUsername("c##oracle11am");
				  crs.setPassword("nareshit");
				  crs.setCommand("select * from student");
				  crs.execute();
				  while(crs.next())
				  {
					  System.out.print(crs.getInt("Rollno")+"\t");
					  System.out.print(crs.getString("name")+"\t");
					  System.out.println(crs.getInt("marks"));
					  
				  }
				  crs.close();
			} catch (SQLException e) 
	          {
			
				e.printStackTrace();
			}

	}

}
