import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class HelloServlet extends HttpServlet{
	
		//BE CAREFUL DO NOT DEFINE ANY VARIABLES OR INSTANCES HERE AS THEY ARE SHARED AND PUBLIC 
		public void init() {
		//called only once in the beginning to indicate the servlet is in service or initialized
		System.out.println("**** INIT METHOD CALLED ****");
		}
	
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		//called for each request
		//each request is handled by a seperate thread
		//synchronized and isolated
		
		//to send a file from the server side to the user we need to specify the file type. Which is taken care of by MIME types
		
		System.out.println("**** SERVICE METHOD CALLED ****");
		String ip = req.getRemoteAddr();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<h2>Server Time: "+ new java.util.Date()+" </h2>");
		out.println("<h2>Ip Address: "+ ip +" </h2>");
		out.println("<BODY>");
		out.println("</HTML>");
		
		}
		
		public void destroy() {
		//called only once to indicate that servlet is down or out of service.	
		System.out.println("**** DESTROY METHOD CALLED ****");
		}
}