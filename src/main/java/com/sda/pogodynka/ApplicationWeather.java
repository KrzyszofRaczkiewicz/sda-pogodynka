package com.sda.pogodynka;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.pogodynka.backend.location.*;
import com.sda.pogodynka.backend.weather.WeatherClient;
import com.sda.pogodynka.frontend.MenuClass;

public class ApplicationWeather {

    private static final LocationController locationController;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        LocationMapper locationMapper = new LocationMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherClient weatherClient = new WeatherClient(objectMapper);
        LocationDAO locationDAO = new LocationDAOImpl();
        LocationService locationService = new LocationService(locationDAO);
        locationController = new LocationController(locationService, objectMapper, locationMapper);
    }

    public static void main(String[] args) {
        MenuClass.getMenu(locationController);
    }
}
