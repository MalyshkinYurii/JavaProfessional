package homework2.task2;

import java.util.*;

//Используя PriorityQueue, заполнить коллекцию десятью случайными(random) значениями. Вывести в консоль от большего элемента к меньшему.

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Queue<Integer> queue = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < 10; i++) {
            queue.add(random.nextInt(20));

        }
        System.out.println(queue);
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }


    }
}
