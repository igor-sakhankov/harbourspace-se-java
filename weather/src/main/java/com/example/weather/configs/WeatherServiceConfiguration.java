package com.example.weather.configs;

import com.example.weather.entities.WeatherEntity;
import com.example.weather.repositories.WeatherRepository;
import com.example.weather.services.WeatherService;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

@Configuration
public class WeatherServiceConfiguration {

    @Bean
    @Primary
    WeatherService weatherService() {
        return new WeatherService(new WeatherRepository() {
            @Override
            public List<WeatherEntity> findAll() {
                return List.of(new WeatherEntity("hey", "hey", "hey", "hey"));
            }

            @Override
            public List<WeatherEntity> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<WeatherEntity> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends WeatherEntity> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<WeatherEntity> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public WeatherEntity getOne(Long aLong) {
                return null;
            }

            @Override
            public WeatherEntity getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<WeatherEntity> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> S save(S entity) {
                return null;
            }

            @Override
            public Optional<WeatherEntity> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(WeatherEntity entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends WeatherEntity> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends WeatherEntity> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends WeatherEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends WeatherEntity> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends WeatherEntity> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends WeatherEntity, R> R findBy(Example<S> example,
                                                         Function<FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        });
    }

    @Bean
    WeatherService weatherServiceNormal(WeatherRepository weatherRepository) {
        return new WeatherService(weatherRepository);
    }

}
