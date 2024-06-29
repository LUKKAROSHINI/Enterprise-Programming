package RestService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
@Path("/")
@ApplicationPath("/cse")
public class CalcService extends Application{
	//This class need to be converted to a RestService
	@GET
	@Path("/add/{x}/{y}")
	public String callAddMethod(@PathParam("x") int x,@PathParam("y") int y)
	{
		Calculator c = new Calculator();
		c.setX(x);
		c.setY(y);
		Integer z = c.add();
		return "Addition of Two numbers"+z.toString();
	}
}