package com.harbour;

public class Quiz2 {

    private static int returnSum(int a, int b) {
        return a + b;
    }

    private static void test() {
        final var sum = Quiz2.returnSum(2, 2);
        if(sum != 4) {
            System.out.println(String.format("Test is failing for %d and %d" , 2, 2));
        }
    }
}
