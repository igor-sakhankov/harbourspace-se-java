package com.harbour.springintroduction.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

    @Autowired
    QualityEngineer qualityEngineer;
}
