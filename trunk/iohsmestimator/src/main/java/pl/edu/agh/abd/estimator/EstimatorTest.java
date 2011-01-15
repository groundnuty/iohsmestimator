package pl.edu.agh.abd.estimator;

import pl.edu.agh.abd.estimator.mocks.Estimation;

/**
 * created at: Jan 15, 2011, 8:45:59 AM
 *
 * @author: Michal Orzechowski
 */
public class EstimatorTest {

    public static void main(String[] args) {
        HSMMonitoringStub hsmMonitoringStub = new HSMMonitoringStub() ;
        Estimator estimator = new Estimator(hsmMonitoringStub) ;
        Estimation estimation  = estimator.estimate("testFile") ;


        System.out.println(estimation.bandwidth);
        System.out.println(estimation.fileSize);
        System.out.println(estimation.latency);

        assert(estimation.bandwidth==100.0);
        assert(estimation.fileSize==10000);
        assert(estimation.latency==120.00029);
    }

}
