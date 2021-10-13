package homework6.task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Annotation[] annotations = ClassA.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
