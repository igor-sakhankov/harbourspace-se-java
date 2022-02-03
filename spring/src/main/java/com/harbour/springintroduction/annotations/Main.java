package com.harbour.springintroduction.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Configuration.class);

        final var coffeeCup = context.getBean("coffeeCup", CoffeeCup.class);

        System.out.println(coffeeCup.getType());
    }

}
