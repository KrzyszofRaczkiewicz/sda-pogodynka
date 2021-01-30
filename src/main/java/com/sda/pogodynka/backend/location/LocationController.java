package com.sda.pogodynka.backend.location;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;
    private final ObjectMapper objectMapper;
    private final LocationMapper locationMapper;

    public String createNewLocation(String city, float height, float width, String region, String country) {
        Location newLocation = locationService.createLocation(city, height, width, region, country);
        LocationDTO locationDTO = locationMapper.reWriteLocation(newLocation);
        try {
            return objectMapper.writeValueAsString(locationDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Wystąpił problem podczas serializacji odpowiedzi: " + e.getMessage());
        }
    }

    public String showAllLocation() {
        List<Location> locationList = locationService.showAllLocation();
        return locationList.toString();
    }
}
