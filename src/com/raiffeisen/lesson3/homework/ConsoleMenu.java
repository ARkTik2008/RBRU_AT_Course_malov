package com.raiffeisen.lesson3.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenu {

    Scanner scanner = new Scanner(System.in);


    public static void menuMain(PresentBox presentBox) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите команду:");
        System.out.println("1. Добавить");
        System.out.println("2. Удалить определенный тип");
        System.out.println("3. Стоимость всего подарка");
        System.out.println("4. Вес всего подарка");
        System.out.println("5. Показать список сладостей в подарке");
        System.out.println("6. Удалить определенный подарок");
        System.out.println("0. Выход");

        int choice = -1;

        try {
            while (choice != 0) {

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        ConsoleMenu.menuAdd(presentBox);
                        break;
                    case 2:
                        ConsoleMenu.menuTypeDelete(presentBox);
                        break;
                    case 3:
                        presentBox.printPresentBoxCost();
                        menuMain(presentBox);
                        break;
                    case 4:
                        presentBox.printPresentBoxWeight();
                        menuMain(presentBox);
                        break;
                    case 5:
                        presentBox.getGiftInfo();
                        menuMain(presentBox);
                        break;
                    case 6:
                        ConsoleMenu.menuGiftDelete(presentBox);
                    case 0:
                        System.out.println(" ");
                        System.out.println("Программа завершается...");
                        System.out.println(" ");
                        System.exit(0);
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("ВНИМАНИЕ! НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ!");
                        System.out.println(" ");
                        menuMain(presentBox);

                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("ВНИМАНИЕ! НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ!");
            System.out.println(" ");
            menuMain(presentBox);
        }
    }

    public static void menuAdd(PresentBox presentBox) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите, какой подарок добавить:");
        System.out.println("1. Candy");
        System.out.println("2. Jellybean");
        System.out.println("3. Sweet");

        int choice = -1;

        try {
            while (choice != 0) {

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        presentBox.addGift(new Candy("Candy", 1.1, 1.1));
                        menuMain(presentBox);
                        break;
                    case 2:
                        presentBox.addGift(new Jellybean("Jellybean", 1.1, 1.1));
                        menuMain(presentBox);
                        break;
                    case 3:
                        presentBox.addGift(new Sweet("Sweet", 1.1, 1.1));
                        menuMain(presentBox);
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("WARNING! Incorrect value!");
            System.out.println(" ");
            menuAdd(presentBox);
        }
    }

    public static void menuGiftDelete(PresentBox presentBox) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите, какой подарок удалить:");

        presentBox.getGiftList();

        int choice = -1;

        try {
            while (choice != 0) {
                choice = scanner.nextInt();
                presentBox.deleteGiftWithIndex(choice);
                menuMain(presentBox);
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("WARNING! Incorrect value!");
            System.out.println(" ");
            menuTypeDelete(presentBox);
        }
    }

    public static void menuTypeDelete(PresentBox presentBox) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите, какой тип подарка удалить:");
        System.out.println("1. Candy");
        System.out.println("2. Jellybean");
        System.out.println("3. Sweet");

        int choice = -1;

        try {
            while (choice != 0) {

                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        presentBox.deleteGiftWithType("Candy");
                        menuMain(presentBox);
                        break;
                    case 2:
                        presentBox.deleteGiftWithType("Jellybean");
                        menuMain(presentBox);
                        break;
                    case 3:
                        presentBox.deleteGiftWithType("Jellybean");
                        menuMain(presentBox);
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" ");
            System.out.println("ВНИМАНИЕ! НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ!");
            System.out.println(" ");
            menuTypeDelete(presentBox);
        }
    }
}
