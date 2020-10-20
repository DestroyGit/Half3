package Generics;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit apple5 = new Apple();
        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();
        Fruit orange3 = new Orange();
        Fruit orange4 = new Orange();
        Fruit orange5 = new Orange();
        Fruit orange6 = new Orange();
        Fruit orange7 = new Orange();
        Fruit orange8 = new Orange();
        Fruit orange9 = new Orange();

        Box<Fruit> boxApple1 = new Box<>(apple1, apple2, apple3);
        Box<Fruit> boxOrange1 = new Box<>(orange1, orange2, orange3);
        Box<Fruit> boxApple2 = new Box<>(apple4, apple5);
        Box<Fruit> boxOrange2 = new Box<>(orange4, orange5, orange6, orange7);

        System.out.println(boxApple1.getWeight() + " " + boxOrange1.getWeight());
        System.out.println(boxApple1.compare(boxOrange1));

        boxApple1.addAllFruits(boxApple2.getFruits());

        System.out.println(boxApple2.getWeight());

        boxApple2.addAllFruits(boxApple1.getFruits());

        boxOrange2.addOneFruit(orange8);
        System.out.println(boxOrange2.getWeight());


//        System.out.println(apple1.getClass());
    }
}
