/* Copyright 2018-2021 AXELL CORPORATION */
/* Updated July 28, 2021*/

package axip.ailia;

/**
* Profile mode for inference
*/
public enum AiliaProfileMode {
	PROFILE_DISABLE(0),
	PROFILE_AVERAGE(1),
	PROFILE_DEFAULT(0);

    private int value;
    private AiliaProfileMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
