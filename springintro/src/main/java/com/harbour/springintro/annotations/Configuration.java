package com.harbour.springintro.annotations;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    CoffeeCup coffeeCup() {
        return new CoffeeCup("cappuccino");
    }

    @Bean
    Engineer engineer() {
        return new Engineer(coffeeCup());
    }
}
