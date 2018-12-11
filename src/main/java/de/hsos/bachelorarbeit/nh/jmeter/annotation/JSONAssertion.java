package de.hsos.bachelorarbeit.nh.jmeter.annotation;

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
    public String path() ;

    /**
     * Expected Value of Ressource
     * Response: {"users":[{"id":1}]}
     * Path: "$.users[0]id"
     * ExpectedValue:  1
     *
     * @return which Value was Expected
     */
    public String expectedValue() ;
}
