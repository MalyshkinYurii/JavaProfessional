package homework6.task2;
/**
 * @author Yurii_Malyshkin
 * @version 1.0
 */

import java.lang.annotation.*;

public class Calc {
    /**
     * two numbers for calculation
     */
    private int a;
    private int b;

    /**
     * making Annotation
     */
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.FIELD})
    @interface MyAnno {
        int a() default 0;

        int b() default 0;
    }

    /**
     * @return sum of a and b
     */
    @MyAnno(a = 6, b = 10)
    public int sum() {
        return a + b;
    }

    /**
     * @return mul of a and b
     */
    @MyAnno(a = 6, b = 10)
    public int mul() {
        return a * b;
    }

    /**
     * @return dif of a and b
     */
    @MyAnno(a = 6, b = 10)
    public int dif() {
        return a - b;
    }

    /**
     * @return div of a and b
     */
    @MyAnno(a = 6, b = 10)
    public int div() {
        return a / b;
    }

    /**
     * default constructor
     */
    public Calc() {

    }

    /**
     * Constructor with 2 parametres
     *
     * @param a int
     * @param b int
     */
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * getterA
     *
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * setA
     *
     * @param a int
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * getterB
     *
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * setB
     *
     * @param b int
     */
    public void setB(int b) {
        this.b = b;
    }
}
