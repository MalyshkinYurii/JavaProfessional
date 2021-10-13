package homework6.task2;

/**
 * @author Yurii_Malyshkin
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.setA(10);
        calc.setB(2);
        System.out.println(calc.sum());
        System.out.println(calc.dif());
        System.out.println(calc.div());
        System.out.println(calc.mul());
    }
}
