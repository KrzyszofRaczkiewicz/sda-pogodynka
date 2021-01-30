package com.sda.pogodynka.backend;

import java.util.List;

public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    public String createNewLocation(String city, float height, float width, String region, String country) {

        Location newLocation = locationService.createLocation(city, height, width, region, country);
        return newLocation.toString();
    }

    public String showAllLocation() {
        List<Location> locationList = locationService.showAllLocation();
        return locationList.toString();
    }
}
