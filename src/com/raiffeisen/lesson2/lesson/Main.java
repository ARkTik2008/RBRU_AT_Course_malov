package com.raiffeisen.lesson2.lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill in number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Fill in number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Result: ");
        System.out.println(numberOne + numberTwo);
        scanner.close();

    }
}