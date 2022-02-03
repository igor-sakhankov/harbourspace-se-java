package com.harbour.thirdlecture.classesandinterfaces;

public class CoffeeWithMilk extends Coffee {


    @Override
    public void prepare() {
        System.out.println(String.format("Put nice %s in the espresso machine", CoffeeWithMilk.class.getName()));
    }
}
