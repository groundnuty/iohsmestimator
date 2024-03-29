package pl.edu.agh.abd;

import org.junit.Test;

import junit.framework.TestCase;
import pl.edu.agh.abd.estimator.Estimator;
import pl.edu.agh.abd.estimator.HSMMonitoringStub;
import pl.edu.agh.abd.estimator.mocks.Estimation;

/**
 * created at: Jan 15, 2011, 8:45:59 AM
 *
 * @author: Michal Orzechowski
 */
public class EstimatorTest extends TestCase{

	private static final float LATENCY = 70.000F;
	private static final int FILE_SIZE = 10000;
	private static final float BANDWIDTH = 100.0F;
	private static final String FILE_NAME = "testFile";

	@Test
    public void testEstimation(){
        HSMMonitoringStub hsmMonitoringStub = new HSMMonitoringStub("host[149.156.4.100].hsm[0]") ;
        Estimator estimator = new Estimator(hsmMonitoringStub) ;
        Estimation estimation  = estimator.estimate(FILE_NAME) ;
        
        System.out.println(estimation.bandwidth);
        System.out.println(estimation.fileSize);
        System.out.println(estimation.latency);

        assertEquals(BANDWIDTH, estimation.bandwidth, 0.0001);
        assertEquals(FILE_SIZE, estimation.fileSize, 0.0001);
        assertEquals(LATENCY, estimation.latency, 0.0001);
    }

}
