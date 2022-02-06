package com.harbour.springintroduction.annotations;

import java.util.EmptyStackException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QualityEngineer {

    private final Engineer qa;

    public QualityEngineer(Engineer qa) {
        this.qa = qa;
    }
}
