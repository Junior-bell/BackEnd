

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


import java.io.FileInputStream;
import java.io.IOException;


/**
 * Servlet implementation class Image
 */
public class Image extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("image/jpeg");
		ServletOutputStream sos=response.getOutputStream();//get the data in the from of byte stream through one method of servletResponse
		FileInputStream fis=new FileInputStream("C:\\Users\\Shivam\\Downloads\\gangtok.jpeg");//this stream will get the data from a file from given location 
        /*store the data in n int type variable*/
		int n=fis.available();//for getting the total length of the file available method is used here.
		byte b[]=new byte[n];
		fis.read(b);//reading data from given location and as the name suggest it doesn't take int type data.
		sos.write(b);//passing image data onto server
		fis.close();//closing the connection
	}

}
