package com.example.weather.services;

import com.example.weather.entities.WeatherEntity;
import com.example.weather.repositories.WeatherRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherRepository weatherRepository;

    /**
     * Fetch the Weather in a specific place and save it to db.
     */
    public Optional<WeatherEntity> fetchWeather() {
        return weatherRepository.findAll()
                                .stream()
                                .findAny();
    }

    public void addWeather(WeatherEntity weather) {
        weatherRepository.save(weather);
    }

    @SneakyThrows
    public List<String> fetchWeather(long id) {
        return weatherRepository.findById(id)
            .map(w -> List.of(w.getSummary()))
            .orElse(List.of());
    }
}
