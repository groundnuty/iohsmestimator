package pl.edu.agh.abd.estimator.mocks;

/**
 * created at: Jan 6, 2011, 11:58:44 PM
 *
 * @author: Michal Orzechowski
 */
public class Estimation {
    public final float bandwidth ;
    public final float latency ;
    public final int fileSize ;

    public Estimation(float bandwidth, float latency, int fileSize) {
        this.bandwidth = bandwidth;
        this.latency = latency;
        this.fileSize = fileSize;
    }

}
