package Annotationen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EndpointTest {
    public int httpStatus() default 201;
    public Parameter[] parameters() default {};
    public int loops() default 1;
    public int threads() default 1;
    public int rampUpTime() default 1;
}


