package pl.edu.agh.abd;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.agh.storage.estimation.hsmclient.HSMFileWrapper;

@Path("sensor/hsmfile")
public class HSMFileService {
	Logger LOGGER = LoggerFactory.getLogger(HSMFileService.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("host[149.156.4.100].hsm[0]")
	public HSMFileWrapper getPositioningLatency(@QueryParam("filename") String filename){
		HSMFileWrapper result = new HSMFileWrapper();
		result.hsmFile.setEndBlock(10012);
		result.hsmFile.setFileSize(10000);
		result.hsmFile.setFilename(filename);
		result.hsmFile.setIsCached("false");
		result.hsmFile.setStartBlock(12);
		result.hsmFile.setTapeID("1");
		return result;
	}
}
