package com.harbour.thirdlecture.annotations;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        new OldDeprecatedClass().produceWarnings("");
    }
}
