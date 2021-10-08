package homework5.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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
            int mods = field.getModifiers();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
            System.out.println(s + "\tModifiers type: " + s1 + getModifier(mods));
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
        int mods = cl.getModifiers();
        System.out.println("Methods_______________________________________________________________");
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            System.out.println(s + "\tModifiers type: " + s1 + getModifier(mods));
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types:" + s1);
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }


    }

    private static String getModifier(int mods) {


        if (Modifier.isPrivate(mods)) {
            return "private ";
        }
        if (Modifier.isAbstract(mods)) {
            return "abstract ";
        }
        if (Modifier.isStatic(mods)) {
            return "static ";
        }
        if (Modifier.isFinal(mods)) {
            return "final ";
        }
        if (Modifier.isProtected(mods)) {
            return "protected ";
        }
        return "public";
    }

    public static void main(String[] args) {
        Class<?> cl = Cat.class;

        getConstructors(cl);
        getMethods(cl);
        getFields(cl);


    }
}
