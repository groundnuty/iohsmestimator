import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("/test")
public class Test {
	Logger LOGGER = Logger.getLogger(Test.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("hello")
	public String addUser(@QueryParam("login") String userLogin){
		LOGGER.debug("got message from: " + userLogin);
		return "hello " + userLogin;

	}
}