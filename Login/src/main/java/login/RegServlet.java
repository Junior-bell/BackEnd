package login;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      Connection con; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
	  try {
		  ServletContext sc=config.getServletContext();
			String s1=sc.getInitParameter("Driver");
			String s2=sc.getInitParameter("url");
			String s3=sc.getInitParameter("username");
			String s4=sc.getInitParameter("password");
			Class.forName(s1);
			con=DriverManager.getConnection(s2,s3,s4);
	} catch (ClassNotFoundException | SQLException e) 
	  {
		e.printStackTrace();
	}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		try {
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			String s1=request.getParameter("fname");
			String s2=request.getParameter("lname");
			String s3=request.getParameter("uname");
			String s4=request.getParameter("pword");
PreparedStatement pstmt=con.prepareStatement("insert into uinfo values(?,?,?,?)");
pstmt.setString(1, s1);
pstmt.setString(2, s2);
pstmt.setString(3, s3);
pstmt.setString(4, s4);
pstmt.executeUpdate();
PrintWriter pw=response.getWriter();
pw.println("<html><body bgcolor=green text=yellow><center>");
pw.println("<h1> you have registered successfully</h1>");
pw.println("<a href=login.html>Login</a>");
pw.println("</center></body></html>");
		} catch (SQLException | IOException e) 
		{
			e.printStackTrace();
		}
	}

}
