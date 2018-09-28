package com.raiffeisen.lesson3.homework;

public class Jellybean extends Gift {

    private String jellybeanParam;

    public Jellybean() {
        super();
        jellybeanParam = "";
    }

    public Jellybean(String name, double weight, double cost) {
        this();
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
}
