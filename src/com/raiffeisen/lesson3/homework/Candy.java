package com.raiffeisen.lesson3.homework;

public class Candy extends Gift {

    private String candyParam;

    public Candy() {
        super();
        candyParam = "";
    }

    public Candy(String name, double weight, double cost) {
        this();
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
}
