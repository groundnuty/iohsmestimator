package pl.edu.agh.abd.estimator.mocks;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * created at: Jan 6, 2011, 11:58:44 PM
 *
 * @author: Michal Orzechowski
 */

@XmlRootElement
public class Estimation {
	public String path;
    public final float bandwidth ;
    public final float latency ;
    public final long fileSize ;
    public final String blockSize;

    public Estimation(float bandwidth, float latency, long fileSize, String path, String blockSize) {
        this.bandwidth = bandwidth;
        this.latency = latency;
        this.fileSize = fileSize;
        this.path=path;
        this.blockSize = blockSize;
    }

    public Estimation() {
        this(0f,0f,0l,"","");
    }

}
