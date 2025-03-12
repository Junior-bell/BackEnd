package login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      Connection con; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			String s1=request.getParameter("uname");
			String s2=request.getParameter("pword");
			Cookie c1=new Cookie("uname",s1);
			response.addCookie(c1);
			PreparedStatement pstmt=con.prepareStatement("select * from uinfo where uname=? and pword=?");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			ResultSet rs=pstmt.executeQuery();
			PrintWriter pw=response.getWriter();
			if(rs.next())
			{
				//RequestDispatcher rd=request.getRequestDispatcher("welcome");
				//rd.forward(request, response);//HttpRequest and HttpResponse reference can be given here instead of serveltRequest and ServletResponse as HttpServlet is sub-class of Servlet interface.
				response.sendRedirect("welcome");
				pw.println("welcome "+s1);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("login.html");	
				rd.include(request, response);
				pw.println("invalid input/password");
			}
		} catch (SQLException | IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
