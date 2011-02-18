package pl.edu.agh.storage.estimation.hsmclient;


import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Lakovic
 */
@XmlRootElement
public class HSMFile {
    private String filename = "";
    private String isCached = "unknown";
    private String tapeID = "unknown";
    private long startBlock = 0;
    private long endBlock = 0;
    private long fileSize = 0;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String isIsCached() {
        return isCached;
    }

    public boolean isFileCached() {
        return "true".equals(isCached.toLowerCase());
    }

    public void setIsCached(String isCached) {
        this.isCached = isCached;
    }

    public long getEndBlock() {
        return endBlock;
    }

    public void setEndBlock(long endBlock) {
        this.endBlock = endBlock;
    }

    public long getStartBlock() {
        return startBlock;
    }

    public void setStartBlock(long startBlock) {
        this.startBlock = startBlock;
    }

    public String getTapeID() {
        return tapeID;
    }

    public void setTapeID(String tapeID) {
        this.tapeID = tapeID;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    
}
