package pl.edu.agh.storage.estimation.hsmclient;


import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Lakovic
 */
@XmlRootElement
public class Drive {
    /**
     * The drive name.
     */
    private String driveName = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Average drive mount time.
     */
    private int averageMountTime = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive dismount time.
     */
    private int averageDismountTime = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive load time.
     */
    private int averageLoadTime = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive unload time.
     */
    private int averageUnloadTime = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive position time.
     */
    private int averagePositionTime = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive read transfer rate.
     */
    private float averageDriveReadTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average drive write transfer rate.
     */
    private float averageDriveWriteTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The drive state.
     */
    private String state = "offline";

    /**
     * The interior tape ID.
     */
    private String tapeID = "";

    /**
     * Sets the drive name.
     *
     * @param driveName
     *            the drive name
     */
    public void setDriveName(String driveName) {
            this.driveName = driveName;
    }

    /**
     * Returns the drive name.
     *
     * @return the drive name
     */
    public String getDriveName() {
            return driveName;
    }

    /**
     * Sets average drive mount time.
     *
     * @param averageMountTime
     *            average drive mount time
     */
    public void setAverageMountTime(int averageMountTime) {
            this.averageMountTime = averageMountTime;
    }

    /**
     * Returns average drive mount time.
     *
     * @return average drive mount time
     */
    public int getAverageMountTime() {
            return averageMountTime;
    }

    /**
     * Sets average drive dismount time.
     *
     * @param averageDismountTime
     *            average drive mount time
     */
    public void setAverageDismountTime(int averageDismountTime) {
            this.averageDismountTime = averageDismountTime;
    }

    /**
     * Returns average drive dismount time.
     *
     * @return average drive dismount time
     */
    public int getAverageDismountTime() {
            return averageDismountTime;
    }

    /**
     * Sets average drive load time.
     *
     * @param averageLoadTime
     *            average drive load time
     */
    public void setAverageLoadTime(int averageLoadTime) {
            this.averageLoadTime = averageLoadTime;
    }

    /**
     * Returns average drive load time.
     *
     * @return average drive load time
     */
    public int getAverageLoadTime() {
            return averageLoadTime;
    }

    /**
     * Sets average drive unload time.
     *
     * @param averageUnloadTime
     *            average drive unload time
     */
    public void setAverageUnloadTime(int averageUnloadTime) {
            this.averageUnloadTime = averageUnloadTime;
    }

    /**
     * Returns average drive unload time.
     *
     * @return average drive unload time
     */
    public int getAverageUnloadTime() {
            return averageUnloadTime;
    }

    /**
     * Sets average drive position time.
     *
     * @param averagePositionTime
     *            average drive position time
     */
    public void setAveragePositionTime(int averagePositionTime) {
            this.averagePositionTime = averagePositionTime;
    }

    /**
     * Returns average drive position time.
     *
     * @return average drive position time
     */
    public int getAveragePositionTime() {
            return averagePositionTime;
    }

    /**
     * Sets average drive read transfer rate.
     *
     * @param averageDriveReadTransferRate
     *            average drive read transfer rate
     */
    public void setAverageDriveReadTransferRate(
                    float averageDriveReadTransferRate) {
            this.averageDriveReadTransferRate = averageDriveReadTransferRate;
    }

    /**
     * Returns average drive read transfer rate.
     *
     * @return average drive read transfer rate
     */
    public float getAverageDriveReadTransferRate() {
            return averageDriveReadTransferRate;
    }

    /**
     * Sets average drive write transfer rate.
     *
     * @param averageDriveWriteTransferRate
     *            average drive write transfer rate
     */
    public void setAverageDriveWriteTransferRate(
                    float averageDriveWriteTransferRate) {
            this.averageDriveWriteTransferRate = averageDriveWriteTransferRate;
    }

    /**
     * Returns average drive write transfer rate.
     *
     * @return average drive write transfer rate
     */
    public float getAverageDriveWriteTransferRate() {
            return averageDriveWriteTransferRate;
    }

    /**
     * Sets the drive state.
     *
     * @param state
     *            the drive state
     */
    public void setState(String state) {
            this.state = state;
    }

    /**
     * Returns the drive state.
     *
     * @return the drive state
     */
    public String getState() {
            return state;
    }

    /**
     * Sets interior tape ID.
     *
     * @param tapeID
     *            interior tape ID
     */
    public void setTapeID(String tapeID) {
            this.tapeID = tapeID;
    }

    /**
     * Returns interior tape ID.
     *
     * @return interior tape ID
     */
    public String getTapeID() {
            return tapeID;
    }
}
