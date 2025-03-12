package filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet Filter implementation class Loginfilter
 */
public class Loginfilter extends HttpFilter implements Filter {
       Connection con;
    /**
	 * 
	 */
	private static final long serialVersionUID = 4988587008926257282L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public Loginfilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
	 try {
		String s1=request.getParameter("uname");
		 String s2=request.getParameter("pword");
		 PreparedStatement pstmt=con.prepareStatement("select * from uinfo where uname=? and pword=?");
		 pstmt.setString(1, s1);
		 pstmt.setString(2, s2);
		 ResultSet rs=pstmt.executeQuery();//this method is used pass dynamic query in oracle.
		 if(rs.next())
		 {
			 chain.doFilter(request, response); 
		 }
		 else
		 {
			 PrintWriter pw=response.getWriter();
			 pw.println("<html><body bgcolor=wheat text=green<h1>");
			 pw.println("Invalid Username/password");
			 pw.println("</h1></body></html>");
		 }
	} catch (SQLException | IOException | ServletException e) {
		e.printStackTrace();
	}
	 
	 
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##oracle11am","nareshit");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
