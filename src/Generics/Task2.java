package Generics;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2 ,3};
        String[] arrString = {"I ", "learn ", "generics"};

        List<?> arrayList = new ArrGen<>(arr).arrToList(arr);
        List<?> arrayListString = new ArrGen<>(arrString).arrToList(arrString);

        System.out.println(arrayList.toString());
        System.out.println(arrayListString.toString());
    }
}
