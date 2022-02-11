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
    private final DataSource dataSource;

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
    public List<String> fetchWeather(String id) {
        final var connection = dataSource.getConnection();
        final var query = "SELECT * FROM weather where id = ";
        final var resultSet = connection.createStatement()
                                        .executeQuery(query + id);
        var result = new ArrayList<String>();
        while (resultSet.next()) {
            result.add(resultSet.getString("summary"));
        }
        return result;
    }
}
