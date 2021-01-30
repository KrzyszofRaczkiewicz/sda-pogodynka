package com.sda.pogodynka.backend;

import java.util.List;

public interface LocationDAO {

    Location saveLocation(Location location);

    List<Location> showAllLocations();
}
