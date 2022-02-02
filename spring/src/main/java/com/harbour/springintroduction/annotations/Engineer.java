package com.harbour.springintroduction.annotations;

public class Engineer {
    private final CoffeeCup coffeeCup;

    public Engineer(CoffeeCup coffeeCup) {
        this.coffeeCup = coffeeCup;

        System.out.println("Engineer created with coffee: " + coffeeCup.getType());
    }
}
