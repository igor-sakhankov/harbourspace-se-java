package com.example.weather.controllers;

import static org.springframework.http.ResponseEntity.ok;

import com.example.weather.entities.WeatherEntity;
import com.example.weather.services.WeatherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(final WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    /**
     * Weather service URL path.
     */
    @GetMapping("/weather")
    public ResponseEntity<WeatherEntity> weather() {
        final var weatherEntity = weatherService.fetchWeather()
                                                .orElseThrow(() -> new RuntimeException(
                                                    "Sorry, I couldn't fetch the weather for you :("));
        return new ResponseEntity<>(weatherEntity, HttpStatus.OK);
    }

    @PostMapping("/weather")
    public ResponseEntity<Void> addWeather(@RequestBody final WeatherEntity entity) {
        weatherService.addWeather(entity);
        return ok().build();
    }


    @GetMapping(value = "/weather_html", produces = MediaType.TEXT_HTML_VALUE)
    public String weatherHtml() {
        final var weatherEntity = weatherService.fetchWeather()
                                                .orElseThrow(() -> new RuntimeException(
                                                    "Sorry, I couldn't fetch the weather for you :("));
        return weatherEntity.getSummary();
    }

    @GetMapping(value = "/weather_sql/{id}")
    public List<String> weatherSql(@PathVariable String id) {
        return weatherService.fetchWeather(id);
    }
}
