package com.raiffeisen.lesson6.homework;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 60};
        Double[] doubleArray = {12.0, 3.3, 5.4};
        String[] stringArray = {"12.0", "3.3", "5.4"};


        TestGeneric.printArrayElements(intArray);
        TestGeneric.printMaxArrayElement(intArray);

        TestGeneric.printArrayElements(doubleArray);
        TestGeneric.printMaxArrayElement(doubleArray);

        TestGeneric.printArrayElements(stringArray);
    }
}
