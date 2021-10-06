package homework2.task4;

public class Main {
    public static void main(String[] args) {
        myHashMap<String, Integer> myMap = new myHashMap<>();

        myMap.put("Петя", 9);
        myMap.put("Юра", 22);
        myMap.put("Вася", 11);
        myMap.put("Женя", 4);



        System.out.println(myMap);
        System.out.println(myMap.get("Юра"));
        myMap.remove("Вася");
        System.out.println(myMap);
    }
}
