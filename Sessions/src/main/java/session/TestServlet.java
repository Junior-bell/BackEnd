package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=wheat text=purple><center>");
		pw.println("<h1>Session id: "+hs.getId()+"<br/>");
		pw.println("Creation Time : "+new Date(hs.getCreationTime())+"<br/>");
		pw.println("last accessed Time "+new Date(hs.getLastAccessedTime())+"<br/>");
		pw.println("Time interval "+hs.getMaxInactiveInterval()+"seconds<br/>");
		pw.println("New session "+hs.isNew()+"<br/>");
		pw.println("</h1></center><body></html>");
	}

}
