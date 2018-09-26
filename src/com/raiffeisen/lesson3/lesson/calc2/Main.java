package com.raiffeisen.lesson3.lesson.calc2;

public class Main {

    public static void main(String[] args) {

        Operationist op = new Operationist(3,4);

        System.out.println(op.getSum());
        System.out.println(op.getSum().getRes());
        System.out.println(op.getSum().getOpType());
        System.out.println(op.getSum().isFlag());

    }
}