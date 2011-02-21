package pl.edu.agh.abd.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
 import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.xml.bind.annotation.XmlRootElement;

import pl.edu.agh.abd.estimator.Estimator;
import pl.edu.agh.abd.estimator.HSMMonitoringStub;
import pl.edu.agh.abd.estimator.mocks.Estimation;


@Path("/estimator")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class EstimationService {
	

	@GET
    @Path("/hsmfile/{hsmid}/estimation/")
	public Estimation getEstimate(@PathParam("hsmid") String hsmId, @QueryParam("filename") String filename){
		HSMMonitoringStub hsmMonitoringStub = new HSMMonitoringStub(hsmId) ;
        Estimator estimator = new Estimator(hsmMonitoringStub) ;
        Estimation estimation  = estimator.estimate(filename);
        
        return estimation;
	}


}
