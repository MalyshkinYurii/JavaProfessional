package homework5.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void getFields(Class<?> cl) {
        System.out.println("Fields_______________________________________________________________");
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Field[] fields = cl.getDeclaredFields();
        // Пробегаемся по классу Field и выводим все public поля
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }
    }

    private static void getConstructors(Class<?> cl) {
        System.out.println("Constructors_______________________________________________________________");
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        System.out.println(s + "Constructors:" + s1);
        // Получаем массив конструкторов
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            // Выводим типы параметров каждого конструктора
            System.out.print(s + "\tConstructor " + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.println();

        }
    }

    private static void getMethods(Class<?> cl) {
        System.out.println("Methods_______________________________________________________________");
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types:" + s1);
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        System.out.println("Выберите класс о котором хотите узнать информацию с помощью номера(по умолчанию класс Object): ");
        System.out.println("1 - Arrays");
        System.out.println("2 - Integer");
        System.out.println("3 - String");
        System.out.println("4 - StringBuffer");
        System.out.println("Введите значение: ");
        Class<?> cl;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                cl = Arrays.class;
                getConstructors(cl);
                getMethods(cl);
                getFields(cl);
                break;
            case 2:
                cl = Integer.class;
                getConstructors(cl);
                getMethods(cl);
                getFields(cl);
                break;
            case 3:
                cl = String.class;
                getConstructors(cl);
                getMethods(cl);
                getFields(cl);
                break;
            case 4:
                cl = StringBuffer.class;
                getConstructors(cl);
                getMethods(cl);
                getFields(cl);
                break;
            default:
                cl = Object.class;
                getConstructors(cl);
                getMethods(cl);
                getFields(cl);

        }


    }
}

