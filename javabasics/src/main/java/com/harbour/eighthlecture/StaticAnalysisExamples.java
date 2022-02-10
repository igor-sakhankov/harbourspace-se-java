package com.harbour.eighthlecture;

import java.util.Hashtable;
import java.util.List;

public class StaticAnalysisExamples {

    private final int INT = 0;

    private static void callingTheFunctions() {
        final var a = optimizeCodeABit(null);
        final var b = optimizeCodeABit("null");
    }

    private static void someCodeBestPractices() {
        final var a = List.of("a", "b");
        a
            .forEach(System.out::println);

    }

    private static boolean optimizeCodeABit(String parameter) {
        return  "TRUE".equals(parameter);
    }

    private static void workingWithTable() {
        var v = new Hashtable<String, Integer>();
        final var key = "a";


        v.put("b", 2);
        v.put("c", 3);
        v.put("d", 4);
        v.put(key, 1);

        final var a = v.containsValue(1);
        System.out.println(key);
        System.out.println(a);
    }
}
