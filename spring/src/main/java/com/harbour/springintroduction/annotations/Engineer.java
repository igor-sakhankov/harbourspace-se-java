package com.harbour.springintroduction.annotations;

public class Engineer {
    private final CoffeeCup test;

    public Engineer(CoffeeCup coffeeCup) {
        this.test = coffeeCup;

        System.out.println("Engineer created with coffee: " + coffeeCup.getType());
    }
}
