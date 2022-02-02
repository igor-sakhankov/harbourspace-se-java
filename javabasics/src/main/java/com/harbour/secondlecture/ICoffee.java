package com.harbour.secondlecture;

public interface ICoffee {

    default boolean hasMilk() {
        return false;
    }
}
