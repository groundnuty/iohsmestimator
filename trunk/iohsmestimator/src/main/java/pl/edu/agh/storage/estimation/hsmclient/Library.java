package pl.edu.agh.storage.estimation.hsmclient;


import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Danilo Lakovic
 */
@XmlRootElement
public class Library {
    Collection<Drive> drives = null;
    Pool pools = null;
    Collection<Tape> tapes = null;

    /**
     * The library name.
     */
    private String libraryName = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Number of drives in the library.
     */
    private int numberOfDrives = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of tapes in the library.
     */
    private int numberOfTapes = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of available drives in the library.
     */
    private int numberOfAvailableDrives = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of available tapes in the library.
     */
    private int numberOfAvailableFreeTapes = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * The library state.
     */
    private String state = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Sets the library name.
     *
     * @param libraryName
     *            the library name
     */
    public void setLibraryName(String libraryName) {
            this.libraryName = libraryName;
    }

    /**
     * Returns the library name
     *
     * @return the library name
     */
    public String getLibraryName() {
            return libraryName;
    }

    /**
     * Sets number of drives in the library.
     *
     * @param numberOfDrives
     *            number of drives in the library
     */
    public void setNumberOfDrives(int numberOfDrives) {
            this.numberOfDrives = numberOfDrives;
    }

    /**
     * Returns number of drives in the library.
     *
     * @return number of drives in the library
     */
    public int getNumberOfDrives() {
            return numberOfDrives;
    }

    /**
     * Sets number of tapes in the library.
     *
     * @param numberOfTapes
     *            number of tapes in the library
     */
    public void setNumberOfTapes(int numberOfTapes) {
            this.numberOfTapes = numberOfTapes;
    }

    /**
     * Returns number of tapes in the library.
     *
     * @return number of tapes in the library
     */
    public int getNumberOfTapes() {
            return numberOfTapes;
    }

    /**
     * Sets number of available drives in the library.
     *
     * @param numberOfAvailableDrives
     *            number of available drives in the library
     */
    public void setNumberOfAvailableDrives(int numberOfAvailableDrives) {
            this.numberOfAvailableDrives = numberOfAvailableDrives;
    }

    /**
     * Returns number of available drives in the library.
     *
     * @return number of available drives in the library
     */
    public int getNumberOfAvailableDrives() {
            return numberOfAvailableDrives;
    }

    /**
     * Sets number of available tapes in the library.
     *
     * @param numberOfAvailableFreeTapes
     *            number of available tapes in the library
     */
    public void setNumberOfAvailableFreeTapes(int numberOfAvailableFreeTapes) {
            this.numberOfAvailableFreeTapes = numberOfAvailableFreeTapes;
    }

    /**
     * Returns number of available tapes in the library.
     *
     * @return number of available tapes in the library
     */
    public int getNumberOfAvailableFreeTapes() {
            return numberOfAvailableFreeTapes;
    }

    /**
     * Sets the library state.
     *
     * @param state
     *            the library state
     */
    public void setState(String state) {
            this.state = state;
    }

    /**
     * Returns the library state.
     *
     * @return the library state
     */
    public String getState() {
            return state;
    }

    public Collection<Drive> getDrives() {
        return drives;
    }

    public void setDrives(Collection<Drive> drives) {
        this.drives = drives;
    }

    public Pool getPools() {
        return pools;
    }

    public void setPools(Pool pools) {
        this.pools = pools;
    }

    public Collection<Tape> getTapes() {
        return tapes;
    }

    public void setTapes(Collection<Tape> tapes) {
        this.tapes = tapes;
    }
    
}
