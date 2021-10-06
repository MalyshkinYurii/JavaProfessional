package homework4.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        String path = "H:\\Malyshkin_Java_Professional\\text3.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

            int c;
            while ((c = reader.read()) != -1) {
                strBuffer.append((char) c);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Оригинал: ");
        System.out.println(strBuffer);
        String regex = "(\\s+что\\s+)|(\\s+очередь\\s+)|(\\s+со\\s+)";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(strBuffer);
        System.out.println("Переделано: ");
        System.out.println(m2.replaceAll(" Java "));
    }
}
