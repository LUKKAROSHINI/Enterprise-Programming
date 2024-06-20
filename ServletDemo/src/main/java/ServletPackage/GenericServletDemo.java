package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse  response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head><title> Servlets Demo </title></head>");
		pw.print("<body>");
		pw.print("<h1>Demo on Generic Servlets </h1>");
		pw.print("</body>");
		pw.print("</html>");
	}
	

}