package com.sda.pogodynka.backend;

public class LocationService {

    private final LocationDAO locationDAO;

    public LocationService(LocationDAO locationDAO){
        this.locationDAO = locationDAO;
    }

    public Location createLocation(String city, int height, int width, String region, String country) {

        Location location = new Location(city, height, width, region, country);
        return locationDAO.saveLocation(location);
    }
}
