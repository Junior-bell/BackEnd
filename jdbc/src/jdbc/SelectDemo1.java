/*jdbc Program to  demonstrate prepared statement with  command line arguments*/ 
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectDemo1 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "c##oracle11am", "nareshit");
            PreparedStatement pstmt = con.prepareStatement("insert into student values(?, ?, ?)");
            pstmt.setInt(1, Integer.parseInt(args[0]));
            pstmt.setString(2, args[1]);
            pstmt.setInt(3, Integer.parseInt(args[2]));
            pstmt.executeUpdate();
            System.out.println("One record inserted successfully");
        } catch (NumberFormatException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
