package homework6.task3;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {
    String value() default "Hello";
}
