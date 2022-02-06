package com.harbour.thirdlecture.accessmodifiers.onepackage;

public class BClass {
    protected int number;

    public void myFunction() {
        final var aClass = new AClass();
        aClass.myIntField = 12;
    }
}
