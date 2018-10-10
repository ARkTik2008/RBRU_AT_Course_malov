package com.raiffeisen.lesson6.homework;

/*
Необходимо используя generics сделать:
Класс в котором будет метод printArray выводящий в консоль содержимое массива вне зависимости что в нем хранится ( примеры для вывода int , double, String)
Добавить метод возвращаемый максимальное значение из массива вне зависимости что в нем хранится ( int или double)
*/

import java.util.ArrayList;

public class TestGeneric {

    public static <E> void printArrayElements(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println(" ");
    }

    public static <T extends Comparable<T>> T printMaxArrayElement(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        //System.out.println(max);
        return max;
    }

    public static <T extends Comparable<T>> T printMaxCollectionElement(ArrayList<T> arrayList) {
        T max = arrayList.get(0);
        for (T element : arrayList) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
