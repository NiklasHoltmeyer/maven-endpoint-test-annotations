package de.hsos.bachelorarbeit.nh.jmeter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Interface for EndpointTest generation
 * @author Niklas Holtmeyer
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EndpointTest {
    /**
     * @return expected HTTP-Status
     */
    int httpStatus() default 200;

    /**
     * Path: /commend/{userId}/{date}
     * parameters = {{@literal @}{@link Parameter}(key=userId, value="1"),{@literal @}{@link Parameter}(key=date, value="10-10-2010"), ...}
     *
     * @return Parameters
     */
    Parameter[] parameters() default {};

    /**
     * Example: {"id":"1"}
     * @return Payload
     */
    String payLoad() default "";

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

    /**
     * Example Expected-Response {"id"=10, "name"="random"}
     * jsonAssertions = {{@literal @}{@link JSONAssertion}(path="$.id", expectedValue="10"), {@literal @}{@link JSONAssertion}(path="$.name", expectedValue="random")}
     *
     * @return JSONAssertion[] @see {@link JSONAssertion}
     */
    JSONAssertion[] jsonAssertions() default {};

    /**
     * Priority / Order of Test
     *     -n -{@literal >} -1 -{@literal >} 0 -{@literal >} 1 -{@literal >} n
     * Default 0
     *
     * @return Order of the Test
     */
    int order() default 0;
}
