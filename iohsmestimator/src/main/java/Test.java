import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Path("/test")
public class Test {
	Logger LOGGER = LoggerFactory.getLogger(Test.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("hello")
	public String addUser(@QueryParam("login") String userLogin){
		LOGGER.debug("got message from: " + userLogin);
		return "hello " + userLogin;

	}
}