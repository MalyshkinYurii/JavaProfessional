package homework4.task4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println(findDif(1998, 4, 29 ));


    }

    public static String findDif(int year, int month, int day) {
        GregorianCalendar gc = new GregorianCalendar();
        int yearDif = gc.get(Calendar.YEAR) - year;
        int monthDif = Math.abs(gc.get(Calendar.MONTH)+1 - month);
        int dayDif = Math.abs(gc.get(Calendar.DAY_OF_MONTH) - day);

        return "Со времени заданной даты прошло: " + yearDif + " лет, " + monthDif + " месяцев, " + dayDif + " дней";
    }
}

