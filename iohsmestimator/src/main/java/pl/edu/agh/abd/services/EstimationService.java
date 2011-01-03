package pl.edu.agh.abd.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pl.edu.agh.abd.EstimateUtil;

@Path("/estimate")
public class EstimationService {
	
	private EstimateUtil estimateUtil;
	
	public EstimationService(){
		estimateUtil = EstimateUtil.getInstance();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("get")
	public int getEstimate(@QueryParam("path") String path){
		estimateUtil.setValue(32);
		return estimateUtil.getValue();
	}
}
