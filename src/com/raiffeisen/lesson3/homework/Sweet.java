package com.raiffeisen.lesson3.homework;

public class Sweet extends Gift {
    private String sweetParam;

    public Sweet() {
        super();
        sweetParam = "";
    }

    public Sweet(String name, double weight, double cost) {
        this();
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
}
