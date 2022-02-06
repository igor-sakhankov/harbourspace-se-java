package com.harbour.springintroduction.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    private static final int TWELVE = 12;

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("randomname.xml");
        System.out.println("Context is ready");
    }

    private void test() {
        if (TWELVE == 12) {
            System.out.println(TWELVE);
        }
        System.out.println(13);
        System.out.println(14);
    }
}
