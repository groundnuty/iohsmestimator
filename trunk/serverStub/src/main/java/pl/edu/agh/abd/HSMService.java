package pl.edu.agh.abd;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.agh.storage.estimation.hsmclient.Drive;
import pl.edu.agh.storage.estimation.hsmclient.HSM;
import pl.edu.agh.storage.estimation.hsmclient.HSMWrapper;
import pl.edu.agh.storage.estimation.hsmclient.Library;

import static pl.edu.agh.abd.HSMProperties.*;

@Path("sensor")
public class HSMService {
	Logger LOGGER = LoggerFactory.getLogger(HSMService.class);
	HSMProperties props = HSMProperties.getProperties();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("host[149.156.4.100].hsm[0]")
	public HSMWrapper getHSM(@QueryParam("filename") String filename){
		HSMWrapper result = new HSMWrapper();
		HSM hsm = result.hsm;
		List<Library> library = new ArrayList<Library>();
		Library lib = new Library();
		List<Drive> drives = new ArrayList<Drive>();
		Drive driv = new Drive();
		
		driv.setAverageLoadTime(Integer.parseInt(props.get(LOAD_TAPE_LATENCY).toString()));
		driv.setAveragePositionTime(Integer.parseInt(props.get(POSITIONING_LATENCY).toString()));
		driv.setAverageLoadTime(Integer.parseInt(props.get(LOAD_TAPE_LATENCY).toString()));
		driv.setAverageUnloadTime(Integer.parseInt(props.get(UNLOAD_TAPE_LATENCY).toString()));
		driv.setAverageDriveReadTransferRate(100);
		
		drives.add(driv);
		lib.setDrives(drives);
		library.add(lib);
		hsm.setLibraries(library);
		
		
		return result;
	}
}
