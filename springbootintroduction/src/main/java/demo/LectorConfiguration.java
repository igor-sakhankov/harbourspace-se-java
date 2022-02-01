package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LectorConfiguration {

    @Bean("Igor")
    public Lector getLector() {
        return new Lector("Igor");
    }

    @Bean("Vasya")
    public Lector getLector2() {
        return new Lector("Vasya");
    }
}
