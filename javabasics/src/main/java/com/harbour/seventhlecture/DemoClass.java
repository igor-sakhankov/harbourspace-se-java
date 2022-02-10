package com.harbour.seventhlecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClass {

    /**
     * the amount of blank space to leave on the left and
     * right sides of each line of text, in pixels
     */
    private static final int textHorizontalPadding = 4;


    public static void someMethod() {
        var s = "12345678";
        System.out.println(s.substring(0, 3));
    }

    public String tooManyComments(int a) {
        someMethod(); //calling someMethod
        if(a == 5)  { // if a = 5
            return "A"; // return A
        } else {
            //send notification to user
            return "B"; //return B
        }
    }

}
