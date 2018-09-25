package com.raiffeisen.lesson2.homework;

public class Gift {

    protected String name = "";
    protected double weight;
    protected double cost;
    protected String specificParam = "";

    public Gift() {
        this.weight = 0.0;
        this.cost = 0.0;
    }

    public Gift(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSpecificParam() {
        return specificParam;
    }

    public void setSpecificParam(String specificParam) {
        this.specificParam = specificParam;
    }
}


