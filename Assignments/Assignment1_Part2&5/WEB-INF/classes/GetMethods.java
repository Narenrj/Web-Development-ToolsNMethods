import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;

public class GetMethods extends HttpServlet {
	
	public void init(){
		System.out.println("*** The Init Method Is Called ***");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("*** The doGet Method Is Called ***");
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("*** The doGet Method Is Called ***");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Interface HttpServletRequest Methods
		String path = request.getServletPath();
		String urlPath = request.getRequestURI();
		String contextPath = request.getContextPath();
		Boolean reqSessionIDCookie = request.isRequestedSessionIdFromCookie();
		Boolean reqSessionIDURL = request.isRequestedSessionIdFromURL();
		Boolean reqSessionIDValid = request.isRequestedSessionIdValid();
		String methodtype = request.getMethod();
		
		//Interface ServletRequest Methods
		String ipAddress = request.getLocalAddr();
		String localName = request.getLocalName();
		int portNumber = request.getLocalPort();
		String host = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		Boolean asyncStarted = request.isAsyncStarted();
		Boolean asyncSupported = request.isAsyncSupported();
		Boolean asyncSecure = request.isSecure();
		String scheme = request.getScheme();
		long length = request.getContentLengthLong();
		
		
		
		//Display Statements
		out.println("<H2> Get Methods of HttpServletRequest Interface: </H2><br>");
		out.println("<strong> The getServletPath()</strong> Returns the part of this request's URL that calls the servlet ==> <strong>"+path+"</strong><br>");
		out.println("<strong> The getRequestURI()</strong> Returns the part of this request's URL from the protocol name up to the query string in the first line of the HTTP request. ==> <strong>"+urlPath+"</strong><br>");
		out.println("<strong> The getContextPath()</strong> Returns the portion of the request URI that indicates the context of the request. ==> <strong>"+contextPath+"</strong><br>");
		out.println("<strong> The isRequestedSessionIdFromCookie()</strong> Returns the portion of the request URI that indicates the context of the request. ==> <strong>"+reqSessionIDCookie+"</strong><br>");
		out.println("<strong> The isRequestedSessionIdFromURL()</strong> Checks whether the requested session ID came in as part of the request URL. ==> <strong>"+reqSessionIDURL+"</strong><br>");
		out.println("<strong> The isRequestedSessionIdValid()</strong> Checks whether the requested session ID is still valid. ==> <strong>"+reqSessionIDValid+"</strong><br>");
		out.println("<strong> The getMethod()</strong> Returns the name of the HTTP method with which this request was made, for example, GET, POST, or PUT. ==> <strong>"+methodtype+"</strong><br>");
		out.println("<br> <hr><br>");
		
		out.println("<H2> Get Methods of ServletRequest Interface: </H2><br>");
		out.println("<strong> The getLocalAddr()</strong> Returns the Internet Protocol (IP) address of the interface on which the request was received. ==> <strong>"+ipAddress+"</strong><br>");
		out.println("<strong> The getLocalName()</strong> Returns the host name of the Internet Protocol (IP) interface on which the request was received. ==> <strong>"+localName+"</strong><br>");
		out.println("<strong> The getLocalPort()</strong> Returns the Internet Protocol (IP) port number of the interface on which the request was received. ==> <strong>"+portNumber+"</strong><br>");
		out.println("<strong> The getRemoteHost()</strong> Returns the fully qualified name of the client or the last proxy that sent the request. ==> <strong>"+host+"</strong><br>");
		out.println("<strong> The getRemotePort()</strong> Returns the Internet Protocol (IP) source port of the client or last proxy that sent the request. ==> <strong>"+remotePort+"</strong><br>");
		out.println("<strong> The getServerName()</strong> Returns the host name of the server to which the request was sent. ==> <strong>"+serverName+"</strong><br>");
		out.println("<strong> The getServerPort()</strong> Returns the port number to which the request was sent. ==> <strong>"+serverPort+"</strong><br>");
		out.println("<strong> The isAsyncStarted()</strong> Checks if this request has been put into asynchronous mode. ==> <strong>"+asyncStarted+"</strong><br>");
		out.println("<strong> The isAsyncSupported()</strong> Checks if this request supports asynchronous operation. ==> <strong>"+asyncSupported+"</strong><br>");
		out.println("<strong> The isSecure()</strong> Returns a boolean indicating whether this request was made using a secure channel, such as HTTPS. ==> <strong>"+asyncSecure+"</strong><br>");
		out.println("<strong> The getScheme()</strong> Returns the name of the scheme used to make this request, for example, http, https, or ftp. ==> <strong>"+scheme+"</strong><br>");
		out.println("<strong> The getContentLengthLong()</strong> Returns the length, in bytes, of the request body and made available by the input stream, or -1 if the length is not known. ==> <strong>"+length+"</strong><br>");
		
	}
	
	
	public void destroy(){
	
	}
}