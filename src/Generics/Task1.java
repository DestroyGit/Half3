package Generics;

public class Task1 {
    public static void main(String[] args) {
        Integer [] array = {0, 1, 2, 3, 4, 5, 6, 7};
        String [] arrayString = {"zero", "one", "two", "three", "four", "five", "six", "seven"};

        ArrGen<Integer> arrGenInt = new ArrGen<>(array);
        ArrGen<String> arrGenStr = new ArrGen<>(arrayString);

        arrGenInt.change(1, 7, array);
        arrGenStr.change(1, 7, arrayString);

        arrGenInt.print(array);
        arrGenStr.print(arrayString);

    }

}