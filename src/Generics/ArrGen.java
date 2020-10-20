package Generics;

import java.util.ArrayList;
import java.util.List;

public class ArrGen <T>{
    private T[] arr;

    public ArrGen(T[] arr) {
        this.arr = arr;
    }

    public void change (int firstElement, int secondElement, T [] arr){ // метод для задания №1
        if (arr.length > firstElement && arr.length > secondElement){
            T buffer = arr[firstElement];
            arr[firstElement] = arr[secondElement];
            arr[secondElement] = buffer;
        } else{
            System.out.println("В массиве нет столько элементов");
        }

    }

    public List<T> arrToList (T [] arr){ // метод для задания №2
        List<T> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;
    }

    public void print(T [] arr){ // печать массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




}
