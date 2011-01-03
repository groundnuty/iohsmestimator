package pl.edu.agh.abd.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/estimate")
public class EstimationService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("get")
	public int getEstimate(@QueryParam("path") String path){
		
		return 23;
	}
}
