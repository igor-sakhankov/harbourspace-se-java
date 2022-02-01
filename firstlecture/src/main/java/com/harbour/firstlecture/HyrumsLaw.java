package com.harbour.firstlecture;

import java.util.Set;

public class HyrumsLaw {

    private static final Set<String> items = Set.of(
        "Apple",
        "Banana",
        "Carrot",
        "Durian",
        "Eggplant"
    );


    public static void main(String[] args) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
