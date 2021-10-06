package homework2.task3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> snameCity = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Введите фамилию: ");
            String s1 = sc.nextLine();
            System.out.println("Введите город: ");
            String s2 = sc.nextLine();
            snameCity.put(s2, s1);
        }
        System.out.println("Введите город, для просмотра семьи: ");
        String s3 = sc.nextLine();
        System.out.println("В городе " + s3 + " живет следующая семья: " + snameCity.get(s3));

        }


    }

