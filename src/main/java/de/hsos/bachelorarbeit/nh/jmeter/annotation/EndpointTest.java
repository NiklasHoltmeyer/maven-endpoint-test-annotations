package de.hsos.bachelorarbeit.nh.jmeter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EndpointTest {
    /**
     * expected HTTP-Status
     */
    int httpStatus() default 200;

    /**
     * Path: /commend/{userId}/{date}
     * paramers = {@Parameter(key=userId, value="1"),@Parameter(key=date, value="10-10-2010"), ...}
     */
    Parameter[] parameters() default {};

    /**
     * Times the Request should be send
     */
    int loops() default 1;

    /**
     * Threads / RampUpTime = Request / second
     */
    int threads() default 1;
    /**
     * Threads / RampUpTime = Request / second
     */
    int rampUpTime() default 1;

    /**
     * Example Expected-Response {"id"=10, "name"="random"}
     * jsonAssertions = {@JSONAssertion(path="$.id", expectedValue="10"), @JSONAssertion(path="$.name", expectedValue="random")}
     */
    JSONAssertion[] jsonAssertions() default {};
}
