/*servlet program to display multiplication table of 5*/

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
       PrintWriter pw=response.getWriter();
       pw.println("<html><body bgcolor=pink text=indigo>");
       pw.println("<table border=5>");
       for(int i=1;i<=100;i++)
       {
    	   pw.println("<tr>");
    	   pw.println("<td> 5 </td>");
    	   pw.println("<td> X </td>");
    	   pw.println("<td>"+i+"</td>");
    	   pw.println("<td> = </td>");
    	   pw.println("<td>"+5*i+"</td>");
    	   pw.println("</tr>");
       }
       pw.println("</table></body></html>");

	}

}
