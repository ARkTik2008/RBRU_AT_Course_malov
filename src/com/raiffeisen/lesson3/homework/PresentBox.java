package com.raiffeisen.lesson3.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class PresentBox {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public double getPresentBoxWeight() {

        double presentBoxWeight = 0.0;
        for (Gift gift : gifts) {
            presentBoxWeight += gift.getWeight();
        }
        return presentBoxWeight;
    }

    public void printPresentBoxWeight() {
        System.out.println("Общий вес подарка:");
        System.out.printf("%.2f", getPresentBoxWeight());
        System.out.println(" ");
        System.out.println(" ");
    }

    public double getPresentBoxCost() {
        double presentBoxCost = 0.0;

        for (Gift gift : gifts) {
            presentBoxCost += gift.getCost();
        }
        return presentBoxCost;
    }

    public void printPresentBoxCost() {
        System.out.println("Цена всего подарка:");
        System.out.printf("%.2f", getPresentBoxCost());
        System.out.println(" ");
        System.out.println(" ");
    }

    public void getGiftInfo() {
        if (gifts.size() == 0) {
            System.out.println("Список пуст");
        } else {
            int i = 1;
            System.out.println("Подарок весом " + String.format("%.2f", getPresentBoxCost()) + " и стоимостью " + String.format("%.2f", getPresentBoxWeight()) + " включает:");
            for (Gift gift : gifts) {
                System.out.println(i + ". " + gift.getClass().getSimpleName() + " весом " + gift.getWeight() + " стоимостью " + gift.getCost());
                i++;
            }
            System.out.println(" ");
        }
    }

    public void getGiftList() {
        if (gifts.size() == 0) {
            System.out.println("Список пуст");
        } else {
            int i = 1;
            for (Gift gift : gifts) {
                System.out.println(i + ". " + gift.getClass().getSimpleName() + " весом " + gift.getWeight() + " стоимостью " + gift.getCost());
                i++;
            }
            System.out.println(" ");
        }
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public void deleteGiftWithType(String giftType) {
        Iterator<Gift> iterator = gifts.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getClass().getSimpleName().equals(giftType)) {
                iterator.remove();
            }
        }
    }

    public void deleteGiftWithIndex(int index) {
        if (index > gifts.size()) {
            System.out.println("ВНИМАНИЕ! НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ!");
        } else {
            gifts.remove(index - 1);
        }
    }
}
