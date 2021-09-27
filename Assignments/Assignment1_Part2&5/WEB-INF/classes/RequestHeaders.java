import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;

public class RequestHeaders extends HttpServlet {
	
	public void init(){
		System.out.println("*** The Init Method Is Called ***");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("*** The doGet Method Is Called ***");
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Header Names & Values: <hr/>");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			out.print("Header Name: <strong>" + headerName);
			Enumeration<String> valueIt = request.getHeaders(headerName);
			out.println("</strong>, Header Value: <em>");
			while (valueIt.hasMoreElements()) {
            String headerValue = valueIt.nextElement();
            out.println(headerValue+" ");
			out.println("</em><br/>"); 
			}
		}
	}
	
	
	public void destroy(){
	
	}
}