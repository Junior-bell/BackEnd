package login;

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
import java.sql.SQLException;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Connection con;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  Cookie[] s=request.getCookies();
	  
	  PrintWriter pw=response.getWriter();
	  pw.println("<html><body bgcolor=wheat text=blue><center>");
	  for(Cookie c:s)
	  {
		  pw.println("<h1> welcome</h1> "+c.getValue());
	  }
	  pw.println("</center></body></html>");
	}

}
