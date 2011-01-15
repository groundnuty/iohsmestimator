package pl.edu.agh.abd.estimator.mocks;

/**
 * created at: Jan 6, 2011, 11:58:52 PM
 *
 * @author: Michal Orzechowski
 */
public class HSMFileInfo {

    String tapeID ;
    int endBlock ;
    int startBlock ;
    boolean isCached ;
    String mediaType ;
    boolean isTapeWithFileInDrive ;
    
    public HSMFileInfo(){}
    /*
        Constructor for dev purposes only!
     */
    public HSMFileInfo(String tapeID, int endBlock, int startBlock, boolean cached, String mediaType, boolean tapeWithFileInDrive) {
            this.tapeID = tapeID;
            this.endBlock = endBlock;
            this.startBlock = startBlock;
            isCached = cached;
            this.mediaType = mediaType;
            isTapeWithFileInDrive = tapeWithFileInDrive;
    }

    public String getTapeID() {
        return tapeID ;  //To change body of created methods use File | Settings | File Templates.
    }

    public int getEndBlock() {
        return endBlock;
    }

    public int getStartBlock() {
        return startBlock;
    }

    public boolean isIsCached() {
        return isCached;  //To change body of created methods use File | Settings | File Templates.
    }

    public String getMediaType() {
        return mediaType ;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean isTapeWithFileInDrive() {
        return isTapeWithFileInDrive ;
    }
}
