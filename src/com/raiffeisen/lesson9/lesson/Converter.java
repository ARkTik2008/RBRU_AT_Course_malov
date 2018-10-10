package com.raiffeisen.lesson9.lesson;

public class Converter {

    @FunctionalInterface
    interface Converteer<F,T>{
        T convertt (F from);
    }

    public static void main(String[] args) {
        Converteer<String,Integer> conv = (Integer::valueOf);

        Converteer<String, Integer> convc = (from -> Integer.valueOf(from));

        System.out.println(conv.convertt("123"));
    }

}
