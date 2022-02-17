package com.example.weather.controllers;

import lombok.Value;

@Value
public class WeatherVM {
    String latitude;
    String longitude;
    String summary;
    String heyField = "hey";
}
