package com.raiffeisen.lesson8.lesson.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {


    public static void main(String[] args) {
        Cookies c = new Cookies();

        System.out.println(c.getClass()
                            .getAnnotation(ControlledObject.class)
                            .name());

        System.out.println(c.getClass().getAnnotations());

        System.out.println(c.getClass()
                            .getAnnotationsByType(ControlledObject.class));

        Annotation[] a = c.getClass().getAnnotations();
        for (Annotation aa:a){
            if(aa.annotationType().getSimpleName().equalsIgnoreCase("ControllesObject")){

                System.out.println(((ControlledObject) aa).name());
                System.out.println(((ControlledObject) aa).def());

            }

        }

        Method[] m = c.getClass().getMethods();
        for (Method mm:m){

            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StartObject.class));
            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StopObject.class));

        }
        System.out.println("------------------------");
        Method[] m1 = c.getClass().getDeclaredMethods();
        for (Method mm:m1){

            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StartObject.class));
            System.out.println(mm.getName() + " : " + mm.isAnnotationPresent(StopObject.class));

        }
        System.out.println("------------------------");


    }

}
