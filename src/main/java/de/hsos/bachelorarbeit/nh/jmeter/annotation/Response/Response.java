package de.hsos.bachelorarbeit.nh.jmeter.annotation.Response;

import de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.JSON.JSONAssertion;
import de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.Response.ResponseAssertion;
import de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.Size.SizeAssertion;

public @interface Response {
    /**
     * @return expected HTTP-Status
     */
    int httpStatus() default 200;

    /**
     * Example Expected-Response {"id"=10, "name"="random"}
     * jsonAssertions = {{@literal @}{@link JSONAssertion}(path="$.id", expectedValue="10"), {@literal @}{@link JSONAssertion}(path="$.name", expectedValue="random")}
     *
     * @return JSONAssertion[] @see {@link JSONAssertion}
     */
    JSONAssertion[] jsonAssertions() default {};

    /**
     *
     * @return Max Latency, 0 = global MaxLatency will be used
     */
    int latencyAssertion() default 0;

    /**
     *
     * @return {@link SizeAssertion}
     */
    SizeAssertion sizeAssertion() default @SizeAssertion;
    ResponseAssertion responseAssertion() default @ResponseAssertion;
}
