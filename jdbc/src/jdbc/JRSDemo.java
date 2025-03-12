package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo //JDBCRowset 
{
 public static void main(String[] args) 
 {
          try {
			JdbcRowSet jrs=new OracleJDBCRowSet();
			  jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
			  jrs.setUsername("c##oracle11am");
			  jrs.setPassword("nareshit");
			  jrs.setCommand("select * from student");
			  jrs.execute();
			  while(jrs.next())
			  {
				 System.out.print(jrs.getInt("Rollno")+"\t");
				 System.out.print(jrs.getString("name")+"\t");
				 System.out.println(jrs.getInt("marks"));
			  }
			  jrs.close();
		} catch (SQLException e) 
          {
			e.printStackTrace();
		}
}
}
