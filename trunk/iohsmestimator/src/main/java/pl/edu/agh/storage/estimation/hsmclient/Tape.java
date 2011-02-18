package pl.edu.agh.storage.estimation.hsmclient;


import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Lakovic
 */
@XmlRootElement
public class Tape {
    /**
     * The tape ID.
     */
    private String tapeID = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Block size.
     */
    private int blockSize = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of errors on the tape.
     */
    private int numberOfErrors = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The tape capacity.
     */
    private int capacity = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The tape capacity usage.
     */
    private int capacityUsage = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The free tape capacity.
     */
    private int freeTapeCapacity = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of a copy.
     */
    private int copyNumber = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The tape state.
     */
    private String state = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Last mount timestamp.
     */
    //private java.sql.Timestamp lastMountTime = null;

    /**
     * Sets the tape ID.
     *
     * @param tapeID
     *            the tape ID
     */
    public void setTapeID(String tapeID) {
            this.tapeID = tapeID;
    }

    /**
     * Returns the tape ID.
     *
     * @return the tape ID
     */
    public String getTapeID() {
            return tapeID;
    }

    /**
     * Sets block size.
     *
     * @param blockSize
     *            the blockSize to set
     */
    public void setBlockSize(int blockSize) {
            this.blockSize = blockSize;
    }

    /**
     * Returns block size.
     *
     * @return the blockSize
     */
    public int getBlockSize() {
            return blockSize;
    }

    /**
     * Sets number of errors on the tape.
     *
     * @param numberOfErrors
     *            the numberOfErrors to set
     */
    public void setNumberOfErrors(int numberOfErrors) {
            this.numberOfErrors = numberOfErrors;
    }

    /**
     * Returns number of errors on the tape.
     *
     * @return the numberOfErrors
     */
    public int getNumberOfErrors() {
            return numberOfErrors;
    }

    /**
     * Sets the tape capacity.
     *
     * @param capacity
     *            the capacity to set
     */
    public void setCapacity(int capacity) {
            this.capacity = capacity;
    }

    /**
     * Returns the tape capacity.
     *
     * @return the capacity
     */
    public int getCapacity() {
            return capacity;
    }

    /**
     * Sets the tape capacity usage.
     *
     * @param capacityUsage
     *            the capacityUsage to set
     */
    public void setCapacityUsage(int capacityUsage) {
            this.capacityUsage = capacityUsage;
    }

    /**
     * Returns the tape capacity usage.
     *
     * @return the capacityUsage
     */
    public int getCapacityUsage() {
            return capacityUsage;
    }

    /**
     * Sets free tape capacity.
     *
     * @param freeTapeCapacity
     *            the free tape capacity to set
     */
    public void setFreeTapeCapacity(int freeTapeCapacity) {
            this.freeTapeCapacity = freeTapeCapacity;
    }

    /**
     * Returns free tape capacity.
     *
     * @return the free tape capacity
     */
    public int getFreeTapeCapacity() {
            return freeTapeCapacity;
    }

    /**
     * Sets copy number.
     *
     * @param copyNumber
     *            the copy number to set
     */
    public void setCopyNumber(int copyNumber) {
            this.copyNumber = copyNumber;
    }

    /**
     * Returns copy number.
     *
     * @return the copy number
     */
    public int getCopyNumber() {
            return copyNumber;
    }

    /**
     * Sets the tape state.
     *
     * @param state
     *            the tape state
     */
    public void setState(String state) {
            this.state = state;
    }

    /**
     * Returns the tape state.
     *
     * @return the tape state
     */
    public String getState() {
            return state;
    }

    /**
     * Sets last mount time.
     *
     * @param lastMountTime
     *            the lastMountTime to set
     */
    //public void setLastMountTime(java.sql.Timestamp lastMountTime) {
    //        this.lastMountTime = lastMountTime;
    //}

    /**
     * Returns last mount time.
     *
     * @return the lastMountTime
     */
    //public java.sql.Timestamp getLastMountTime() {
    //        return lastMountTime;
    //}

}
