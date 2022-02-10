package com.harbour.forthcourse;
public class PureVsNonPure {
    int counter = 0;
    public int functionA(int a, int b) {
        return a + b;
    }
    public int functionB(int a) {
        this.counter = this.counter + a;
        return this.counter;
    }
    private static void extracted() {
        final var pureVsNonPure = new PureVsNonPure();

        final var i = pureVsNonPure.functionA(2, 2);
        final var i2 = pureVsNonPure.functionA(2, 2);
        final var i3 = pureVsNonPure.functionA(2, 2);
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        final var i4 = pureVsNonPure.functionB(1);
        final var i5 = pureVsNonPure.functionB(1);
        final var i6 = pureVsNonPure.functionB(1);

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
    }
}
