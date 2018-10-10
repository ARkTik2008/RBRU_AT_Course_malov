package com.raiffeisen.lesson6.homework;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 60};
        Double[] doubleArray = {12.0, 3.3, 5.4};
        String[] stringArray = {"12.0", "3.3", "5.4"};

        ArrayList<Double> doubleColl =new ArrayList();
        ArrayList<Integer> intColl = new ArrayList();

        doubleColl.add(12.0);
        doubleColl.add(3.3);
        doubleColl.add(5.4);

        intColl.add(1);
        intColl.add(2);
        intColl.add(3);
        intColl.add(60);

        System.out.println("Коллеция Integer: ");
        System.out.println("Max:" + TestGeneric.printMaxCollectionElement(intColl));
        System.out.println();

        System.out.println("Коллеция Double: ");
        System.out.println("Max:" + TestGeneric.printMaxCollectionElement(doubleColl));
        System.out.println();



        //TestGeneric.printArrayElements(intArray);
        //TestGeneric.printMaxArrayElement(intArray);
        System.out.println("Массив Integer: ");
        System.out.println("Max:" + TestGeneric.printMaxArrayElement(intArray));
        System.out.println();

        //TestGeneric.printArrayElements(doubleArray);
        //TestGeneric.printMaxArrayElement(doubleArray);
        System.out.println("Массив Double: ");
        System.out.println("Max:" + TestGeneric.printMaxArrayElement(doubleArray));
        System.out.println();

        //TestGeneric.printArrayElements(stringArray);

    }
}
