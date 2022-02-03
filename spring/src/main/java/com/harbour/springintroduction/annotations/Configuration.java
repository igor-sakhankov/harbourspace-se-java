package com.harbour.springintroduction.annotations;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    CoffeeCup coffee() {
        return new CoffeeCup("cappuccino");
    }

    @Bean
    CoffeeCup coffee2() {
        return new CoffeeCup("cappuccino");
    }

    @Bean
    Engineer engineer(CoffeeCup coffeeCup) {
        return new Engineer(coffeeCup);
    }
}
