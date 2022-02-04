package com.harbour.springintroduction.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    private static final int A = 11;

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("randomname.xml");
        System.out.println("Context is ready");
    }
}
