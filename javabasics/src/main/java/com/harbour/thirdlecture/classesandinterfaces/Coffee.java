package com.harbour.thirdlecture.classesandinterfaces;

public class Coffee implements HotDrink {


    @Override
    public void prepare() {
        System.out.println(String.format("Put nice %s in the espresso machine", Coffee.class.getName()));
    }
}
