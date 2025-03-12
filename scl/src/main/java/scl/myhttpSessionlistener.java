package scl;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class myhttpSessionlistener
 *
 */
public class myhttpSessionlistener implements HttpSessionListener {
int count=0;
    /**
     * Default constructor. 
     */
    public myhttpSessionlistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         count++;
         HttpSession hs=se.getSession();
         hs.setAttribute("user",count);
         
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count--;
    	HttpSession hs=se.getSession();
    	hs.setAttribute("user", hs);
    }
	
}
