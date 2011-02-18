package pl.edu.agh.abd;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.agh.storage.estimation.hsmclient.HSMWrapper;

@Path("sensor")
public class HSMService {
	Logger LOGGER = LoggerFactory.getLogger(HSMService.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("host[149.156.4.100].hsm[0]")
	public HSMWrapper getHSM(@QueryParam("filename") String filename){
		HSMWrapper result = new HSMWrapper();
		
		
		
		return result;
	}
}
