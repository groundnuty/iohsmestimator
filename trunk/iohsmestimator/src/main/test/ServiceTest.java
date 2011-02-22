import junit.framework.TestCase;
import org.junit.Test;

import com.google.gson.Gson;

import pl.edu.agh.abd.estimator.HSMMonitoringStub;
import pl.edu.agh.storage.estimation.hsmclient.HSMFile;
import pl.edu.agh.storage.estimation.hsmclient.HSMFileWrapper;


public class ServiceTest  extends TestCase{

	private static final String FILE_IS_CACHED = "false";
	private static final int FILE_START_BLOCK = 12;
	private static final int FILE_END_BLOCK = 10012;
	private static final String FILE_TAPE_ID = "1";
	private static final boolean ANY_EMPTY_DRIVE = true;
	private static final double HSM_SYSTEM_TRANSFER_RATE = 100.0;
	private static final double HSM_UNLOAD_TAPE_LATENCY = 10.0;
	private static final double HSM_LOAD_TAPE_LATENCY = 10.0;
	private static final double HSM_POSITIONING_LATENCY = 60.0;
	private static final double HSM_CACHED_LATENCY = 1.0;
	
	private static final String FILE_NAME = "noname";
	
	Gson transformer = new Gson();

	@Test
	public void testHSMMonitoringStubCreation(){
		
		HSMMonitoringStub stub = new HSMMonitoringStub("ala");
		
		assertEquals(HSM_CACHED_LATENCY, stub.getCachedLatency(), 0.001);
		assertEquals(HSM_POSITIONING_LATENCY, stub.getPositioningLatency(), 0.001);
		assertEquals(HSM_LOAD_TAPE_LATENCY, stub.getLoadTapeLatency(), 0.001);
		assertEquals(HSM_UNLOAD_TAPE_LATENCY, stub.getUnloadTapeLatency(), 0.001);
		assertEquals(HSM_SYSTEM_TRANSFER_RATE, stub.getSystemTransferRate(), 0.0001);
	}
	
	@Test
	public void testTransformHSMFile(){
		String test = "{\"hsmFile\":{\"endBlock\":684837,\"fileSize\":142346240,\"filename\":\"\\/fse\\/other\\/monit\\/t\",\"isCached\":true,\"startBlock\":684294,\"tapeID\":\"GS6086L3\"}}";
		HSMFile file = transformer.fromJson(test, HSMFileWrapper.class).hsmFile;
		assertEquals("/fse/other/monit/t", file.getFilename());
		assertEquals("true", file.isIsCached());
		assertEquals(684837, file.getEndBlock());
		assertEquals(142346240, file.getFileSize());
		assertEquals(684294, file.getStartBlock());
		assertEquals("GS6086L3", file.getTapeID());
	}
	
	@Test
	public void testGetHSMFile(){
		HSMMonitoringStub stub = new HSMMonitoringStub("ala");
		HSMFile file = stub.getHSMFile(FILE_NAME);
		
		assertEquals(FILE_NAME, file.getFilename());
		assertEquals(FILE_TAPE_ID, file.getTapeID());
		assertEquals(FILE_END_BLOCK, file.getEndBlock());
		assertEquals(FILE_START_BLOCK, file.getStartBlock());
		assertEquals(FILE_IS_CACHED, file.isIsCached());
	}
	
	@Test
	public void testFilesInQueue(){
		HSMMonitoringStub stub = new HSMMonitoringStub("ala");
		
		assertEquals(0, stub.getFileQueueSize());
	}
	
	@Test
	public void testAnyEmptyDrives(){
		HSMMonitoringStub stub = new HSMMonitoringStub("ala");
		
		assertEquals(ANY_EMPTY_DRIVE, stub.areThereAnyEmptyDrives());
	}
}
