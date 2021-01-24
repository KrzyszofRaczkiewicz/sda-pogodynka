package com.sda.pogodynka.backend;

public class LocationDAOMock implements LocationDAO {

    @Override
    public Location saveLocation(Location location) {
        return location;
    }
}
