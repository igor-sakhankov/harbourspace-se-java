package com.harbour.eighthlecture;

import java.util.HashSet;
import java.util.Set;

public class ErrorProneExamples {

    private static void shortToInt() {
        Set<Short> s = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - Integer.MAX_VALUE);
        }
        System.out.println(s.size());

        arrayToString();
    }

    private static void arrayToString() {
        var a = new int[]{1, 2, 3};

        System.out.println(a.toString());
    }
}
