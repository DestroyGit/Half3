package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();
    private float weight;

    @SafeVarargs
    Box(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    ArrayList<T> getFruits() {
        return fruits;
    }

// узнать вес коробки с фруктами
    float getWeight() {
        if (fruits.size() > 0) {
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;
    }

// одинаковый ли вес у коробок
    boolean compare(Box<T> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

// из одной коробки перекладываем все фрукты
    void addAllFruits(ArrayList<T> fruits) {
        if (fruits.size() > 0 && this.fruits.size() > 0) {
            if (this.fruits.get(0).getClass().equals(fruits.get(0).getClass())) {
                this.fruits.addAll(fruits);
                fruits.clear();
            } else {
                System.out.println("ALERT: different fruits");
            }
        } else if (fruits.size() > 0 && this.fruits.isEmpty()) { // переложить из любой коробки в пустую коробку
            this.fruits.addAll(fruits);
            fruits.clear();
        }
    }

// добавляем один фрукт в коробку
    void addOneFruit(T fruit){
        if (this.fruits.size() > 0) { // если в коробке уже есть фрукты
            if (this.fruits.get(0).getClass().equals(fruit.getClass())){ // того ли типа фрукты в корзине. Если да, кладем еще один
                this.fruits.add(fruit);
            } else{
                System.out.println("ALERT: different fruits");
            }
        } else{
            this.fruits.add(fruit); // кладем фрукт, если в коробке пусто
        }

    }

}

