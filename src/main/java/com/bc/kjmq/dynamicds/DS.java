package com.bc.kjmq.dynamicds;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
        ElementType.METHOD,
        ElementType.PACKAGE,
        ElementType.TYPE
})
public @interface DS {
    String value() default DSN.DB_1;
}
