package com.harbour.springintroduction.annotations;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Configuration.class);

        System.out.println("tree");
    }

}
