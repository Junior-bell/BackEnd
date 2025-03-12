

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

/**
 * Servlet implementation class TimeServlet
 */
public class TimeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		LocalTime lt=LocalTime.now();
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><meta http-equiv=refresh content=1 </head>");
		pw.println("<body bgcolor=green text=yellow><h1>");
		pw.println(lt);
		pw.println("</h1></body></html>");
		
	}

}
