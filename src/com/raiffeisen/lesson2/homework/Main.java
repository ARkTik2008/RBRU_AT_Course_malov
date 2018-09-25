package com.raiffeisen.lesson2.homework;

public class Main {

    public static void main(String[] args) {
/*        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill in number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Fill in number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Result: ");
        System.out.println(numberOne + numberTwo);
        scanner.close();*/

        PresentBox presentBox = new PresentBox();

        Gift gift1 = new Gift("Test",1.1,1.1);
        Gift gift2 = new Gift("Test",1.1,2.1);
        Gift gift3 = new Gift("Test3",1.1,3.1);
        Gift gift4 = new Gift("Test3",1.1,4.1);
        Gift gift5 = new Gift("Test4",1.1,5.1);
        Gift gift6 = new Gift("Test5",1.1,6.1);
        Gift gift7 = new Gift("Test6",1.1,7.1);

        presentBox.addGift(gift1);
        presentBox.addGift(gift2);
        presentBox.addGift(gift3);
        presentBox.addGift(gift4);
        presentBox.addGift(gift5);
        presentBox.addGift(gift6);
        presentBox.addGift(gift7);

        presentBox.getGiftList();
        presentBox.getPresentBoxCost();
        presentBox.getPresentBoxWeight();
        presentBox.deleteGiftWithType("Test3");
        presentBox.getGiftList();
        presentBox.deleteGiftWithType("Test5");
        presentBox.getGiftList();


    }
}