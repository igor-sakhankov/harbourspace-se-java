package com.harbour.springintroduction.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

@ComponentScan("com.harbour")
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean("development")
    String coffeetype() {
        return "black";
    }

    @Bean("black")
    @Lazy
    CoffeeCup coffee(String coffeetype) {
        return new CoffeeCup(coffeetype);
    }

    @Bean("withmilk")
    @Lazy
    CoffeeCup coffee2() {
        return new CoffeeCup("cappuccino");
    }

}
