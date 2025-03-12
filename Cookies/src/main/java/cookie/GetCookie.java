package cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Cookie [] c=request.getCookies();
      PrintWriter pw=response.getWriter();
      pw.println("<html><body bgcolor=wheat text=blue><center>");
      pw.println("<h1><u>Selected books</u></h1>");
      for(Cookie c1:c)
      {
    	  pw.println(c1.getValue()+"<br>");
      }
      pw.println("</center></body></html>");
	}

}
