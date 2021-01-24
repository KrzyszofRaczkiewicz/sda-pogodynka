package com.sda.pogodynka;

import com.sda.pogodynka.backend.LocationController;
import com.sda.pogodynka.backend.LocationDAO;
import com.sda.pogodynka.backend.LocationDAOImpl;
import com.sda.pogodynka.backend.LocationService;
import com.sda.pogodynka.frontend.MenuClass;

public class ApplicationWeather {

    private static final LocationController locationController;

    static {
        LocationDAO locationDAO = new LocationDAOImpl();
        LocationService locationService = new LocationService(locationDAO);
        locationController = new LocationController(locationService);
    }

    public static void main(String[] args) throws Exception {
        MenuClass.getMenu(locationController);
    }
}
