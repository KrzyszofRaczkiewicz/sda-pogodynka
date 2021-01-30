package com.sda.pogodynka.backend;

import java.util.List;

public class LocationDAOMock implements LocationDAO {

    @Override
    public Location saveLocation(Location location) {
        return location;
    }

    @Override
    public List<Location> showAllLocations() {
        return null;
    }
}
