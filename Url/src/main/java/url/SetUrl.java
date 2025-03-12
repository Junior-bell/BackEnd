package url;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetUrl
 */
public class SetUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetUrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String s1=request.getParameter("book1");
	 String s2=request.getParameter("book2");
	 String s3=request.getParameter("book3");
	 PrintWriter pw=response.getWriter();
	 pw.println("<html><body bgcolor=wheat text=blue><center>");
	 pw.println("<h1>your books added successfully</h1>");
	 pw.println("<a href=get?book1="+s1+"&book2="+s2+"&book3="+s3+">Next</a>");
	 pw.println("</center></body></html>");

	}

}
