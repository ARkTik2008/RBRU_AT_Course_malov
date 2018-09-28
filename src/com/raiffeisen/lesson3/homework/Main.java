package com.raiffeisen.lesson3.homework;

public class Main {

/*    Кодить:

    Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
    У каждой сладости есть название, вес, цена и свой уникальный параметр.
    Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.


    Попробуйте(можно не кодить) Продумайте как(обсудим ваши предложения и вопросы):

    В подарке может быть много сладостей одного типа. Из подарка можно добавлять и удалять сладости по определенному типу. Типов сладостей может быть много (больше двух)
    Подумать как задавать вес и стоимость. Как организовать данные. Как будет работать алгоритм
*/


    public static void main(String[] args) {
        PresentBox presentBox = new PresentBox();

        Gift gift1 = new Candy("Candy_1", 1.1, 1.1);
        Gift gift2 = new Candy("Candy_2", 1.1, 2.1);
        Gift gift3 = new Sweet("Sweet_1", 1.1, 3.1);
        Gift gift4 = new Sweet("Sweet_2", 1.1, 4.1);
        Gift gift5 = new Sweet("Sweet_3", 1.1, 5.1);
        Gift gift6 = new Jellybean("Jellybean_1", 1.1, 6.1);
        Gift gift7 = new Jellybean("Jellybean_2", 1.1, 7.1);


        presentBox.addGift(gift1);
        presentBox.addGift(gift2);
        presentBox.addGift(gift3);
        presentBox.addGift(gift4);
        presentBox.addGift(gift5);
        presentBox.addGift(gift6);
        presentBox.addGift(gift7);

        presentBox.getGiftList();
        presentBox.printPresentBoxCost();
        presentBox.printPresentBoxWeight();
        presentBox.deleteGiftWithType("Candy");
        presentBox.getGiftList();
        presentBox.deleteGiftWithType("Sweet");
        presentBox.getGiftList();
    }
}