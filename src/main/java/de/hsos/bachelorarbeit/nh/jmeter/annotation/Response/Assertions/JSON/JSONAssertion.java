package de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.JSON;

/**
 * EndpointTest - JSON - Assertion
 */
public @interface JSONAssertion {
    /**
     * Response: {"users":[{"id":1}]}
     * Example-Path: "$.users[0]id"
     * =={@literal >} 1
     *
     * @return Path to JSON-Ressource
     */
    public String path();

    /**
     * Expected Value of Ressource
     * Response: {"users":[{"id":1}]}
     * Path: "$.users[0]id"
     * ExpectedValue:  1
     *
     * @return which Value was Expected
     */
    public String expectedValue() default "";

    public boolean jsonValidation() default true;
    public boolean expectNull() default false;
    public boolean invert() default false;
    public boolean regex() default false;
}
