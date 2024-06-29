package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EjbPackage.CalculatorRemote;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB(lookup="java:global/ejbcalc/Calculator!EjbPackage.CalculatorRemote")  
	CalculatorRemote c;
	
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
int x = Integer.parseInt(request.getParameter("X"));
int y =   Integer.parseInt(request.getParameter("Y"));
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("Addition of Two Numbers is :");
		pw.print(c.add(x, y));
		pw.close();



	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
