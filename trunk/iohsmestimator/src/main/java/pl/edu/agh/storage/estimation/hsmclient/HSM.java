package pl.edu.agh.storage.estimation.hsmclient;


import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Lakovic
 */
@XmlRootElement
public class HSM {
    private Collection<Library> libraries = null;

    /**
     * The HSM system mount point.
     */
    private String mountPoint = null;

    /**
     * Total disk cache capacity.
     */
    private float totalDCCapacity = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Free disk cache capacity.
     */
    private float freeDCCapacity = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average disk cache transfer rate.
     */
    private float averageReadTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Average disk cache read transfer rate.
     */
    private float averageWriteTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Current disk cache read transfer rate.
     */
    private float currentReadTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Current disk cache write transfer rate.
     */
    private float currentWriteTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Current disk array read transfer rate.
     */
    private float diskstatReadTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Current disk array write transfer rate.
     */
    private float diskstatWriteTransferRate = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The 'is working' flag.
     */
    private boolean isWorking;

    /**
     * The default number of copies created on different tapes in the HSM
     * system.
     */
    private int defaultNumberOfCopies = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Low water mark.
     */
    private float lowWaterMark = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * High water mark.
     */
    private float highWaterMark = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of premigrated files.
     */
    private int numberOfPremigratedFiles = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of migrated files.
     */
    private int numberOfMigratedFiles = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Capacity of premigrated files.
     */
    private float capacityOfPremigratedFiles = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Capacity of migrated files.
     */
    private float capacityOfMigratedFiles = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Load of the HSM system.
     */
    private int hsmLoad = MonitoringConstants.UNAVAILABLE_VALUE;

    /*
     * The disk array device name
     */
    private String deviceName = null;

    /*
     * Total number of reads completed successfully.
     */
    private long diskstatReadsCompleted = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Merged reads.
     */
    private long diskstatMergedReads = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Sectors read.
     */
    private long diskstatSectorsRead = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Milliseconds spent reading.
     */
    private long diskstatMillisecondsSpentReading = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Writes completed.
     */
    private long diskstatWritesCompleted = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Merged writes.
     */
    private long diskstatMergedWrites = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Sectors written.
     */
    private long diskstatSectorsWritten = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Milliseconds spent writing.
     */
    private long diskstatMillisecondsSpentWriting = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * I/Os currently in progress
     */
    private long diskstatIOinProgress = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Milliseconds spent doing I/Os
     */
    private long diskstatMillisecondsSpentIO = MonitoringConstants.UNAVAILABLE_VALUE;
    /*
     * Weighted # of milliseconds spent doing I/Os
     */
    private long diskstatWeightedMillisecondsSpentIO = MonitoringConstants.UNAVAILABLE_VALUE;

    private long numberOfLibraries = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Sets mount point of the HSM system.
     *
     * @param mountPoint
     *            mount point of the HSM system
     */
    public void setMountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
    }

    /**
     * Returns mount point of the HSM system.
     *
     * @return mount point of the HSM system
     */
    public String getMountPoint() {
            return mountPoint;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets total disk cache capacity.
     *
     * @param totalDCCapacity
     *            total disk cache capacity
     */
    public void setTotalDCCapacity(float totalDCCapacity) {
            this.totalDCCapacity = totalDCCapacity;
    }

    /**
     * Returns total disk cache capacity.
     *
     * @return total disk cache capacity
     */
    public float getTotalDCCapacity() {
            return totalDCCapacity;
    }

    /**
     * Sets free disk cache capacity.
     *
     * @param freeDCCapacity
     *            free disk cache capacity
     */
    public void setFreeDCCapacity(float freeDCCapacity) {
            this.freeDCCapacity = freeDCCapacity;
    }

    /**
     * Returns free disk cache capacity.
     *
     * @return free disk cache capacity
     */
    public float getFreeDCCapacity() {
            return freeDCCapacity;
    }

    /**
     * Sets average disk cache read transfer rate.
     *
     * @param averageReadTransferRate
     *            average disk cache read transfer rate
     */
    public void setAverageReadTransferRate(float averageReadTransferRate) {
            this.averageReadTransferRate = averageReadTransferRate;
    }

    /**
     * Returns average disk cache read transfer rate.
     *
     * @return average disk cache read transfer rate
     */
    public float getAverageReadTransferRate() {
            return averageReadTransferRate;
    }

    /**
     * Sets average disk cache write transfer rate.
     *
     * @param averageWriteTransferRate
     *            average disk cache write transfer rate
     */
    public void setAverageWriteTransferRate(float averageWriteTransferRate) {
            this.averageWriteTransferRate = averageWriteTransferRate;
    }

    /**
     * Returns average disk cache write transfer rate.
     *
     * @return average disk cache write transfer rate
     */
    public float getAverageWriteTransferRate() {
            return averageWriteTransferRate;
    }

    /**
     * Sets current read transfer rate.
     *
     * @param currentReadTransferRate
     *            current read transfer rate
     */
    public void setCurrentReadTransferRate(float currentReadTransferRate) {
            this.currentReadTransferRate = currentReadTransferRate;
    }

    /**
     * Returns current read transfer rate.
     *
     * @return current read transfer rate
     */
    public float getCurrentReadTransferRate() {
            return currentReadTransferRate;
    }

    /**
     * Sets current write transfer rate.
     *
     * @param currentWriteTransferRate
     *            current write transfer rate
     */
    public void setCurrentWriteTransferRate(float currentWriteTransferRate) {
            this.currentWriteTransferRate = currentWriteTransferRate;
    }

    /**
     * Returns current write transfer rate.
     *
     * @return current write transfer rate
     */
    public float getCurrentWriteTransferRate() {
            return currentWriteTransferRate;
    }

    /**
     * Sets 'is working' flag.
     *
     * @param isWorking
     *            'is working' flag
     */
    public void setIsWorking(boolean isWorking) {
            this.isWorking = isWorking;
    }

    /**
     * Returns 'is working' flag.
     *
     * @return 'is working' flag value
     */
    public boolean getIsWorking() {
            return isWorking;
    }

    /**
     * Sets default number of copies created on different tapes in the HSM
     * system.
     *
     * @param defaultNumberOfCopies
     *            the default number of copies to set
     */
    public void setDefaultNumberOfCopies(int defaultNumberOfCopies) {
            this.defaultNumberOfCopies = defaultNumberOfCopies;
    }

    /**
     * Returns default number of copies created on different tapes in the HSM
     * system.
     *
     * @return the default number of copies
     */
    public int getDefaultNumberOfCopies() {
            return defaultNumberOfCopies;
    }

    /**
     * Sets low water mark value.
     *
     * @param lowWaterMark
     *            low water mark value
     */
    public void setLowWaterMark(float lowWaterMark) {
            this.lowWaterMark = lowWaterMark;
    }

    /**
     * Return low water mark value.
     *
     * @return low water mark value
     */
    public float getLowWaterMark() {
            return lowWaterMark;
    }

    /**
     * Sets high water mark value.
     *
     * @param highWaterMark
     *            high water mark value
     */
    public void setHighWaterMark(float highWaterMark) {
            this.highWaterMark = highWaterMark;
    }

    /**
     * Returns high water mark value.
     *
     * @return high water mark value
     */
    public float getHighWaterMark() {
            return highWaterMark;
    }

    /**
     * Sets number of premigrated files.
     *
     * @param numberOfPremigratedFiles
     *            number of premigrated files
     */
    public void setNumberOfPremigratedFiles(int numberOfPremigratedFiles) {
            this.numberOfPremigratedFiles = numberOfPremigratedFiles;
    }

    /**
     * Returns number of premigrated files.
     *
     * @return number of premigrated files
     */
    public int getNumberOfPremigratedFiles() {
            return numberOfPremigratedFiles;
    }

    /**
     * Sets number of migrated files.
     *
     * @param numberOfMigratedFiles
     *            number of migrated files
     */
    public void setNumberOfMigratedFiles(int numberOfMigratedFiles) {
            this.numberOfMigratedFiles = numberOfMigratedFiles;
    }

    /**
     * Returns number of migrated files.
     *
     * @return number of migrated files
     */
    public int getNumberOfMigratedFiles() {
            return numberOfMigratedFiles;
    }

    /**
     * Sets capacity of premigrated files.
     *
     * @param capacityOfPremigratedFiles
     *            capacity of premigrated files
     */
    public void setCapacityOfPremigratedFiles(float capacityOfPremigratedFiles) {
            this.capacityOfPremigratedFiles = capacityOfPremigratedFiles;
    }

    /**
     * Returns capacity of premigrated files.
     *
     * @return capacity of premigrated files
     */
    public float getCapacityOfPremigratedFiles() {
            return capacityOfPremigratedFiles;
    }

    /**
     * Sets capacity of migrated files.
     *
     * @param capacityOfMigratedFiles
     *            capacity of migrated files
     */
    public void setCapacityOfMigratedFiles(float capacityOfMigratedFiles) {
            this.capacityOfMigratedFiles = capacityOfMigratedFiles;
    }

    /**
     * Returns capacity of migrated files.
     *
     * @return capacity of migrated files
     */
    public float getCapacityOfMigratedFiles() {
            return capacityOfMigratedFiles;
    }

    /**
     * Sets load of the HSM system.
     *
     * @param hsmLoad
     */
    public void setHSMLoad(int hsmLoad) {
            this.hsmLoad = hsmLoad;
    }

    /**
     * Returns load of the HSM system.
     *
     * @return load of the HSM system
     */
    public int getHSMLoad() {
            return hsmLoad;
    }

    public long getDiskstatIOinProgress() {
        return diskstatIOinProgress;
    }

    public void setDiskstatIOinProgress(long diskstatIOinProgress) {
        this.diskstatIOinProgress = diskstatIOinProgress;
    }

    public long getDiskstatMergedReads() {
        return diskstatMergedReads;
    }

    public void setDiskstatMergedReads(long diskstatMergedReads) {
        this.diskstatMergedReads = diskstatMergedReads;
    }

    public long getDiskstatMergedWrites() {
        return diskstatMergedWrites;
    }

    public void setDiskstatMergedWrites(long diskstatMergedWrites) {
        this.diskstatMergedWrites = diskstatMergedWrites;
    }

    public long getDiskstatMillisecondsSpentIO() {
        return diskstatMillisecondsSpentIO;
    }

    public void setDiskstatMillisecondsSpentIO(long diskstatMillisecondsSpentIO) {
        this.diskstatMillisecondsSpentIO = diskstatMillisecondsSpentIO;
    }

    public long getDiskstatMillisecondsSpentReading() {
        return diskstatMillisecondsSpentReading;
    }

    public void setDiskstatMillisecondsSpentReading(long diskstatMillisecondsSpentReading) {
        this.diskstatMillisecondsSpentReading = diskstatMillisecondsSpentReading;
    }

    public long getDiskstatMillisecondsSpentWriting() {
        return diskstatMillisecondsSpentWriting;
    }

    public void setDiskstatMillisecondsSpentWriting(long diskstatMillisecondsSpentWriting) {
        this.diskstatMillisecondsSpentWriting = diskstatMillisecondsSpentWriting;
    }

    public long getDiskstatSectorsRead() {
        return diskstatSectorsRead;
    }

    public void setDiskstatSectorsRead(long diskstatSectorsRead) {
        this.diskstatSectorsRead = diskstatSectorsRead;
    }

    public long getDiskstatSectorsWritten() {
        return diskstatSectorsWritten;
    }

    public void setDiskstatSectorsWritten(long diskstatSectorsWritten) {
        this.diskstatSectorsWritten = diskstatSectorsWritten;
    }

    public long getDiskstatReadsCompleted() {
        return diskstatReadsCompleted;
    }

    public void setDiskstatReadsCompleted(long diskstatReadsCompleted) {
        this.diskstatReadsCompleted = diskstatReadsCompleted;
    }

    public long getDiskstatWeightedMillisecondsSpentIO() {
        return diskstatWeightedMillisecondsSpentIO;
    }

    public void setDiskstatWeightedMillisecondsSpentIO(long diskstatWeightedMillisecondsSpentIO) {
        this.diskstatWeightedMillisecondsSpentIO = diskstatWeightedMillisecondsSpentIO;
    }

    public long getDiskstatWritesCompleted() {
        return diskstatWritesCompleted;
    }

    public void setDiskstatWritesCompleted(long diskstatWritesCompleted) {
        this.diskstatWritesCompleted = diskstatWritesCompleted;
    }

    public float getDiskstatReadTransferRate() {
        return diskstatReadTransferRate;
    }

    public void setDiskstatReadTransferRate(float diskstatReadTransferRate) {
        this.diskstatReadTransferRate = diskstatReadTransferRate;
    }

    public float getDiskstatWriteTransferRate() {
        return diskstatWriteTransferRate;
    }

    public void setDiskstatWriteTransferRate(float diskstatWriteTransferRate) {
        this.diskstatWriteTransferRate = diskstatWriteTransferRate;
    }

    public int getHsmLoad() {
        return hsmLoad;
    }

    public void setHsmLoad(int hsmLoad) {
        this.hsmLoad = hsmLoad;
    }

    public long getNumberOfLibraries() {
        return numberOfLibraries;
    }

    public void setNumberOfLibraries(long numberOfLibraries) {
        this.numberOfLibraries = numberOfLibraries;
    }

    public Collection<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(Collection<Library> libraries) {
        this.libraries = libraries;
    }

}
