package pl.edu.agh.abd.estimator;

import pl.edu.agh.abd.estimator.mocks.HSMFileInfo;

/**
 * created at: Jan 15, 2011, 8:06:23 AM
 *
 * @author: Michal Orzechowski
 */
public class HSMMonitoringStub {
    public HSMFileInfo getHSMFileInfo(String fileName) {
        return new HSMFileInfo("1",10012,12,false,"tape",false);
    }
    
    public float getSystemTransferRate() {
        return 100;
    }

    public int getFileQueueSize() {
        return 2;
    }

    public HSMFileInfo[] getFilesInAQueue() {
        return new HSMFileInfo[] {
                new HSMFileInfo("2",10012,12,true,"tape",false),
                new HSMFileInfo("3",10012,12,false,"tape",true)
        };
    }

    public boolean areThereAnyEmptyDrives() {
        return false ;
    }


    public float getCachedLatency() {
        return 1;  //To change body of created methods use File | Settings | File Templates.
    }


    public float getPositioningLatency() {
        return 60;  //To change body of created methods use File | Settings | File Templates.
    }

    public int getLoadTapeLatency() {
        return 10;  //To change body of created methods use File | Settings | File Templates.
    }

    public float getUnloadTapeLatency() {
        return 10;  //To change body of created methods use File | Settings | File Templates.
    }
}
