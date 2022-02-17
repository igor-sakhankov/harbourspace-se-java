package com.example.weather.controllers;

import com.example.weather.entities.WeatherEntity;
import com.example.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherSocketsController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherSocketsController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

//
//    @MessageMapping("/ws/weather")
//    @SendTo("/topic/greetings")
//    public WeatherEntity weather() throws Exception {
//        Thread.sleep(1000); // simulated delay
//        return weatherService.fetchWeather()
//
//                             .orElseThrow(() -> new RuntimeException());
//    };
}
