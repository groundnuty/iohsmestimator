package pl.edu.agh.abd.estimator.mocks;

import java.util.List;

/**
 * created at: Jan 6, 2011, 11:56:11 PM
 *
 * @author: Michal Orzechowski
 */
public class HSMMonPortType {
    private List<Tape> HSMTapeMap;
    private StorageSystemInfo storageSystemInfo;

    public List<Tape> getHSMTapeMap() {
        return HSMTapeMap;
    }

    public HSMFileInfo getHSMFileInfo(String fileName) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public StorageSystemInfo getStorageSystemInfo() {
        return storageSystemInfo;
    }

    public HSMState getHSMState() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
