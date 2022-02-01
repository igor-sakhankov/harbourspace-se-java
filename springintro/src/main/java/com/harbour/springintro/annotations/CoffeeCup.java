package com.harbour.springintro.annotations;

public class CoffeeCup {

    public String getType() {
        return type;
    }

    private final String type;

    public CoffeeCup(String type) {
        this.type = type;
    }
}
