package de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.Size;

import de.hsos.bachelorarbeit.nh.jmeter.annotation.Response.Assertions.Response.SizeOperator;

public @interface SizeAssertion {
    SizeOperator operator() default SizeOperator.GREATERTHAN;
    int value() default 50;
}

