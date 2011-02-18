package pl.edu.agh.storage.estimation.hsmclient;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pool {
    /**
     * The pool ID.
     */
    private String poolId = MonitoringConstants.UNAVAILABLE_STRING_VALUE;

    /**
     * Number of used tapes in the pool.
     */
    private int numberOfUsedTapesInPool = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Number of available tapes in the pool
     */
    private int numberOfAvailableTapesInPool = MonitoringConstants.UNAVAILABLE_VALUE;

    /**
     * Sets the pool ID.
     *
     * @param poolId
     *            the pool ID
     */
    public void setPoolId(String poolId) {
            this.poolId = poolId;
    }

    /**
     * Returns the pool ID.
     *
     * @return the pool ID
     */
    public String getPoolId() {
            return poolId;
    }

    /**
     * Sets number of used tapes in the pool.
     *
     * @param numberOfUsedTapesInPool
     *            number of used tapes in the pool
     */
    public void setNumberOfUsedTapesInPool(int numberOfUsedTapesInPool) {
            this.numberOfUsedTapesInPool = numberOfUsedTapesInPool;
    }

    /**
     * Returns number of used tapes in the pool.
     *
     * @return number of used tapes in the pool
     */
    public int getNumberOfUsedTapesInPool() {
            return numberOfUsedTapesInPool;
    }

    /**
     * Sets number of available tapes in the pool.
     *
     * @param numberOfAvailableTapesInPool
     *            number of available tapes in the pool
     */
    public void setNumberOfAvailableTapesInPool(int numberOfAvailableTapesInPool) {
            this.numberOfAvailableTapesInPool = numberOfAvailableTapesInPool;
    }

    /**
     * Returns number of available tapes in the pool.
     *
     * @return number of available tapes in the pool
     */
    public int getNumberOfAvailableTapesInPool() {
            return numberOfAvailableTapesInPool;
    }

}
