package de.hsos.bachelorarbeit.nh.jmeter.annotation.Request;

/**
 * ThreadProperties
 */
public @interface ThreadProperties {
    /**
     * @return Times the Request should be send
     */
    int loops() default 1;

    /**
     * Threads / RampUpTime = Request / second
     *
     * @return Amount of Threads
     */
    int threads() default 1;
    /**
     * Threads / RampUpTime = Request / second
     *
     * @return Time the Threads need to RampUp
     */
    int rampUpTime() default 1;
}
