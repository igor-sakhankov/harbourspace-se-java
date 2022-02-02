package com.harbour.secondlecture;

public class Test {

    public static void main(String[] args) {
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
