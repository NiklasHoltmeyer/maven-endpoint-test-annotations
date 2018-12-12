package de.hsos.bachelorarbeit.nh.jmeter.annotation.Request;

/**
 * Request-Settings
 */
public @interface Request {
    /**
     * Example: {"id":"1"}
     * @return Payload
     */
    String payLoad() default "";
    /**
     * Path: /commend/{userId}/{date}
     * parameters = {{@literal @}{@link Parameter}(key=userId, value="1"),{@literal @}{@link Parameter}(key=date, value="10-10-2010"), ...}
     *
     * @return Parameters
     */
    Parameter[] parameters() default {};

    /**
     *
     * @return {@link ThreadProperties}
     */
    ThreadProperties threadProperties() default @ThreadProperties;

    String contentEncoding() default "";

    boolean followRedirects() default true;
    boolean autoRedirect() default true;
    boolean useKeepAlive() default true;
    String connectTimeout() default "";
    String responseTimeout() default "";
}
