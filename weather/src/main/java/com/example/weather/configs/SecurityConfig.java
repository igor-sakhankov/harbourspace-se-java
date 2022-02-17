package com.example.weather.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        final var inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        var user = User.withUsername("admin")
                       .password("12345")
                       .authorities("ALL")
                       .build();
        inMemoryUserDetailsManager.createUser(user);

        return inMemoryUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.authorizeRequests()
            .antMatchers("/hello")
            .permitAll()
            .and()
            .authorizeRequests()
            .antMatchers("/actuator/**")
            .permitAll()
            .and()
            .authorizeRequests()
            .antMatchers("/weather_html").hasAuthority("ADMIN")
            .and()
            .authorizeRequests()
            .anyRequest()
            .authenticated();
    }
}
