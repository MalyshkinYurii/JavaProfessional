package homework6.task3;

import java.lang.annotation.*;

    @Documented
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnno1 {
        String value() default "Hello";
    }

