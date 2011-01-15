package pl.edu.agh.abd;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.agh.abd.estimator.mocks.HSMFileInfo;
import static pl.edu.agh.abd.HSMProperties.*;

@Path("/hsm")
public class HSMService {
	Logger LOGGER = LoggerFactory.getLogger(HSMService.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("positioningLatency")
	public float getPositioningLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning positioning latency for: " + hsmId);
		String latency = getProperties().getProperty(POSITIONING_LATENCY);
		return Float.parseFloat(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("loadTapeLatency")
	public float getLoadTapeLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning load tape latency for: " + hsmId);
		String latency = getProperties().getProperty(LOAD_TAPE_LATENCY);
		return Float.parseFloat(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("unloadTapeLatency")
	public float getUnloadTapeLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning unload tape latency for: " + hsmId);
		String latency = getProperties().getProperty(UNLOAD_TAPE_LATENCY);
		return Float.parseFloat(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("cachedLatency")
	public float getLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning cached latency for: " + hsmId);
		String latency = getProperties().getProperty(CACHED_LATENCY);
		return Float.parseFloat(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("filesInQueue")
	public HSMFileInfo[] getFilesInQueue(@QueryParam("id") int hsmId){
		LOGGER.debug("returning files in queue for: " + hsmId);
		return new HSMFileInfo[] {
                new HSMFileInfo("2",10012,12,true,"tape",false),
                new HSMFileInfo("3",10012,12,false,"tape",true)
        };
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("systemTransferRate")
	public float getSystemTransferRate(@QueryParam("id") int hsmId){
		LOGGER.debug("returning system transfer rate for: " + hsmId);
		return 100.0F;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("emptyDrive")
	public boolean isAnyEmptyDrive(@QueryParam("id") int hsmId){
		LOGGER.debug("returning any empty drive for: " + hsmId);
		return false;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("fileInfo")
	public HSMFileInfo getHSMFileInfo(@QueryParam("id") int hsmId, @QueryParam("name") String name){
		LOGGER.debug("returning file info(" + name + ") for: " + hsmId);
		return new HSMFileInfo("1",10012,12,false,"tape",false);
	}
}