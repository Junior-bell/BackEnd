

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
     int count=0;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		count++;
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=skyblue text=white>");
		pw.println("<h1 style=font-family:verdana>The page has been viewed "+count+" this much times!</h1>");
		pw.println("</body></html>");
	}

}
