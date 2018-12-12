package de.hsos.bachelorarbeit.nh.jmeter.annotation;

import de.hsos.bachelorarbeit.nh.jmeter.annotation.Request.Request;
import de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Response;

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
     *
     * @return {@link Request}
     */
    Request request() default @Request;

    /**
     *
     * @return {@link Response}
     */
    Response response() default @Response;

    /**
     * Priority / Order of Test
     *     -n -{@literal >} -1 -{@literal >} 0 -{@literal >} 1 -{@literal >} n
     * Default 0
     *
     * @return Order of the Test
     */
    int order() default 0;
}
