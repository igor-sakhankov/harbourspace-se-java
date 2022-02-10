package com.harbour.secondlecture;

public class Test {

    private static void extracted() {
        final var softwareEngineer = new SoftwareEngineer(new BlackCoffee("sdfsd"));
        if(softwareEngineer.addMilk() == true) {
            throw new RuntimeException();
        }

        final var softwareEngineer2 = new SoftwareEngineer(new CafeConLeche());
        if(softwareEngineer2.addMilk() == false) {
            throw new RuntimeException();
        }
    }
}
