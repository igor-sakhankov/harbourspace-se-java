package com.harbour.secondlecture;

import java.lang.reflect.Method;

public class Dependencies {

    public Dependencies(Object coffee) throws NoSuchMethodException {
        Method method = coffee
            .getClass()
            .getMethod("hasMilk", null);

    }

    public static void main(String[] args) throws NoSuchMethodException {
        new Dependencies(new Object());
    }
}
