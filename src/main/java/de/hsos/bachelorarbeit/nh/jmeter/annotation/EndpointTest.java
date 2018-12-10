package de.hsos.bachelorarbeit.nh.jmeter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EndpointTest {
    public int httpStatus() default 200;
    public Parameter[] parameters() default {};
    public int loops() default 1;
    public int threads() default 1;
    public int rampUpTime() default 1;
}


