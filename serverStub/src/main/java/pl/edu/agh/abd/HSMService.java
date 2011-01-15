package pl.edu.agh.abd;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static pl.edu.agh.abd.HSMProperties.*;

@Path("/hsm")
public class HSMService {
	Logger LOGGER = LoggerFactory.getLogger(HSMService.class);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("positioningLatency")
	public int getPositioningLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning positioning latency for: " + hsmId);
		String latency = getProperties().getProperty(POSITIONING_LATENCY);
		return Integer.parseInt(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("loadTapeLatency")
	public int getLoadTapeLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning load tape latency for: " + hsmId);
		String latency = getProperties().getProperty(LOAD_TAPE_LATENCY);
		return Integer.parseInt(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("unloadTapeLatency")
	public int getUnloadTapeLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning unload tape latency for: " + hsmId);
		String latency = getProperties().getProperty(UNLOAD_TAPE_LATENCY);
		return Integer.parseInt(latency);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("cachedLatency")
	public int getLatency(@QueryParam("id") int hsmId){
		LOGGER.debug("returning cached latency for: " + hsmId);
		String latency = getProperties().getProperty(CACHED_LATENCY);
		return Integer.parseInt(latency);
	}
}