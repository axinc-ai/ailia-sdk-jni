/* Copyright 2018-2021 AXELL CORPORATION */
/* Updated July 28, 2021*/

package axip.ailia;

/**
* Network image format
*/
public enum AiliaNetworkImageChannel {
	/**
	 * DCYX order
	 */
    FIRST(0),
	/**
	 * DYXC order
	 */
    LAST( 1);

    private int value;
    private AiliaNetworkImageChannel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
