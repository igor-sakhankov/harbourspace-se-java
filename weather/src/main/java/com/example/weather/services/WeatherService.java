package com.example.weather.services;

import com.example.weather.dtos.WeatherDTO;
import com.example.weather.entities.WeatherEntity;
import com.example.weather.repositories.WeatherRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class WeatherService {

    private final WeatherRepository weatherRepository;

    /**
     * Fetch the Weather in a specific place and save it to db.
     */
    public Optional<WeatherDTO> fetchWeather() {
        return weatherRepository.findAll()
                                .stream()
                                .map(w -> new WeatherDTO(w.getLatitude(), w.getLongitude(), w.getSummary(),
                                    w.getNewFieldShouldNotBeVisibleToTheUser()))
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
