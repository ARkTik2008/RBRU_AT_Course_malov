package com.raiffeisen.lesson9.lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @FunctionalInterface
    interface PersonFactory <P extends Person> {
        P create(String firstName, String lastName);
    }


    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        Person pers = personPersonFactory.create("Name", "Fam");
        System.out.println();


        List<String> strings = new ArrayList<>();
        strings.add("a1");
        strings.add("b1");
        strings.add("c41");
        strings.add("ttt1");
        strings.add("45a1");
        strings.add("qwe1");
        strings.add("h1");
        strings.add("j1");
        strings.add("yay1");
        strings.add("100a000");

        strings.stream().filter(s -> s.contains("a"))
               .filter(ss->ss.matches("\\d\\w"))
               .forEach(System.out::println);

    }
}
