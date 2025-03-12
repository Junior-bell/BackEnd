package login;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class setCookies
 */
public class Setcookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			String s1=request.getParameter("firstbook");
			String s2=request.getParameter("secondbook");
			String s3=request.getParameter("thirdbook");
			 // Create cookies for selected books
	        if (s1 != null) {
	            Cookie cookieS1 = new Cookie("book1", s1);
	            response.addCookie(cookieS1);
	        }

	        if (s2 != null) {
	            Cookie cookieS2 = new Cookie("book2", s2);
	            response.addCookie(cookieS2);
	        }

	        if (s3 != null) {
	            Cookie cookieS3 = new Cookie("book3", s3);
	            response.addCookie(cookieS3);
	        }

 
			System.out.println("Received parameters: s1=" + s1 + ", s2=" + s2 + ", s3=" + s3);
			
 PrintWriter pw=response.getWriter();
 pw.println("<html><body bgcolor=skyblue text=blue><center>");
 pw.println("<h1>your books are added to the cart</h1><br/>");
 pw.println("<a href=GetCookies>Next</a>");
 pw.println("</center></body></html>");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
