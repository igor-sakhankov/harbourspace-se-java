package com.harbour.springintroduction.annotations;

public interface MyInterface {

    public void sum(int a, int b);

    default int minus(int a, int b) {
        return a - b;
    };

}
