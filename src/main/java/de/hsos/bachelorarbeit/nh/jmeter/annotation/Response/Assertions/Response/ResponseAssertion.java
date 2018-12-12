package de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.Response;

public @interface ResponseAssertion {
    String value() default "201";
    TestOperator operator() default TestOperator.EQUALS;

    /**
     * Which Response-Field should be checked
     * @return TestField
     */
    TestField testField() default TestField.response_code;
    boolean assumeSuccess() default false;
}
