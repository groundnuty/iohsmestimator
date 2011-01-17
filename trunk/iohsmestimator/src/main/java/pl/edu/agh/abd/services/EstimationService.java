package pl.edu.agh.abd.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pl.edu.agh.abd.estimator.Estimator;
import pl.edu.agh.abd.estimator.HSMMonitoringStub;
import pl.edu.agh.abd.estimator.mocks.Estimation;

@Path("/estimate")
public class EstimationService {
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("get")
	public Estimation getEstimate(@QueryParam("path") String path){
		HSMMonitoringStub hsmMonitoringStub = new HSMMonitoringStub() ;
        Estimator estimator = new Estimator(hsmMonitoringStub) ;
        Estimation estimation  = estimator.estimate(path);
        
        return estimation;
	}
}
