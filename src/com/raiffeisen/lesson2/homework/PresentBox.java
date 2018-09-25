package com.raiffeisen.lesson2.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class PresentBox {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public void getPresentBoxWeight() {

        double presentBoxWeight = 0.0;

        for (Gift gift : gifts) {
            presentBoxWeight += gift.getWeight();
        }

        System.out.println("Общий вес подарка:");
        System.out.printf("%.2f", presentBoxWeight);
        System.out.println(" ");
        System.out.println(" ");
    }

    public void getPresentBoxCost() {
        double presentBoxCost = 0.0;

        for (Gift gift : gifts) {
            presentBoxCost += gift.getCost();
        }

        System.out.println("Цена всего подарка:");
        System.out.printf("%.2f", presentBoxCost);
        System.out.println(" ");
        System.out.println(" ");
    }

    public void getGiftList() {
        int i = 1;
        System.out.println("Список в подарке: ");
        for (Gift gift : gifts) {
            System.out.println(i + ". " + gift.name);
            i++;
        }
        System.out.println(" ");
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public void deleteGiftWithType(String giftType) {
        Iterator<Gift> iterator = gifts.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(giftType)) {
                iterator.remove();
            }
        }
    }

}
