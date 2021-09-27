package homework1.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car porshe = new Car(50, 20000, "rx", "red");
        Car audi = new Car(200, 200000, "xt", "blue");
        Car chevrolet = new Car(70, 11000, "qw", "green");
        Car tavria = new Car(25, 100000, "er", "red");

        Car[] cars = {porshe, audi, chevrolet, tavria};
        Arrays.sort(cars);


        for (Car car:
             cars) {
            System.out.println(car);
        }
        System.out.println("_______________________________________________");
        Animal bird = new Animal("kalibri", 2, 200, 2000);
        Animal shark = new Animal("white", 170, 125, 15000);
        Animal dog = new Animal("mops", 15, 15, 500);
        Animal cat = new Animal("devon", 3, 20, 400);

        Animal[] animals = {bird, shark, dog, cat};

        Arrays.sort(animals);
        for (Animal animal:
             animals) {
            System.out.println(animal);
        }
}
}
