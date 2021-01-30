package com.sda.pogodynka.backend.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WeatherClientTest {

    private static WeatherClient weatherClient;

    @BeforeAll
    static void setUp() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        weatherClient = new WeatherClient(objectMapper);
    }

    @Test
    void getWeather() {
        // when

        // then

    }
}
