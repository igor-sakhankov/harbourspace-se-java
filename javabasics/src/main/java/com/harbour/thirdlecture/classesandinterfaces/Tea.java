package com.harbour.thirdlecture.classesandinterfaces;

public class Tea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("Use chinese tea");
    }
}
