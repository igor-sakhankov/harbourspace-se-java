package com.harbour.secondlecture;

public class SoftwareEngineer {

    private final ICoffee blackCoffee;

    public SoftwareEngineer(ICoffee coffee) {
        this.blackCoffee = coffee;
    }

    public boolean addMilk() {
        return !this.blackCoffee.hasMilk();
    }
}
