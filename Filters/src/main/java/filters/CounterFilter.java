package filters;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CounterFilter extends HttpFilter
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int count=0;
	public void doFilter(HttpServletRequest Request,HttpServletResponse Response,FilterChain Chain)throws IOException,ServletException
	{
		count++;
		ServletContext sc=Request.getServletContext();
		sc.setAttribute("views", count);
		Chain.doFilter(Request, Response);
		
	}
}