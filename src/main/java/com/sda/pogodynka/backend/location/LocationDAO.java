package com.sda.pogodynka.backend.location;

import java.util.List;

public interface LocationDAO {

    Location saveLocation(Location location);

    List<Location> showAllLocations();
}
