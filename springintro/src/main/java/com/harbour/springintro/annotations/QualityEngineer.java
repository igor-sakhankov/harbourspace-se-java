package com.harbour.springintro.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QualityEngineer {

    @Autowired
    private CoffeeCup coffeeCup;

    @Override
    public String toString() {
        return "QualityEngineer{" +
            "coffeeCup=" + coffeeCup +
            '}';
    }
}
