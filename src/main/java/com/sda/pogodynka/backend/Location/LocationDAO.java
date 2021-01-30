package com.sda.pogodynka.backend.Location;

import com.sda.pogodynka.backend.Location.Location;

import java.util.List;

public interface LocationDAO {

    Location saveLocation(Location location);

    List<Location> showAllLocations();
}
