package com.sda.pogodynka.frontend;

import com.sda.pogodynka.backend.LocationController;

import java.util.Scanner; // todo unnecessary import

public class MenuClass {

    private static void getMenuInfo() {
        System.out.println("Weather Manager 1.0");
        System.out.println("1 - Add location");
        System.out.println("2 - Location list");
        System.out.println("3 - Show weather in location");
        System.out.println("0 - Kill Manager... WeatherManager....");
    }

    public static void getMenu(LocationController locationController) {
        while (true) {
            getMenuInfo();

            String menu = MenuUtils.getStringInfo("");

            switch (menu) {
                case "1": // dodaj lokalizacje
                    addNewLocation(locationController);
                    System.out.println("----------------------------------");
                    break;
                case "2": // lista lokalizacji
                    System.out.println("Show all location");
                    System.out.println("----------------------------------");
                    break;
                case "3": // aktualizacja danych lokalizacji
                    System.out.println("Weather in location");
                    System.out.println("----------------------------------");
                    break;
                case "0":
                    System.out.println("Sajonara!!!");
                    return;
                default:
                    System.out.println("really??? is it so hard to choose right....\ntry again...\n");
            }
        }
    }

    private static void addNewLocation(LocationController locationController) {
        int dataCorrect = 0;
        String city;
        int height = 0;
        int width = 0;
        String region;
        String country;
        do {
            System.out.println("ADDING NEW LOCATION");
            city = MenuUtils.getStringInfo("Name of the city (required):");
            height = MenuUtils.getIntInfo("Give geographic height (required), format: -S, N:");
            width = MenuUtils.getIntInfo("Give geographic width (required), format: -W, E:");
            region = MenuUtils.getStringInfo("Give region (optional - none):");
            country = MenuUtils.getStringInfo("Give country name (required):");

            System.out.println("---INPUT DATA---:");
            System.out.println("City: " + city);
            if (height > 0) System.out.println("Geographic height: " + height + "N");
            else System.out.println("Geographic height: " + height + "S");
            if (width > 0) System.out.println("Geographic width: " + width + "E");
            else System.out.println("Geographic width: " + width + "W");
            System.out.println("Region: " + region);
            System.out.println("Country: " + country);
            System.out.println("Data correct?\n1 - YAA, 0 - NEE");

            dataCorrect = MenuUtils.getIntInfo("");
        } while (dataCorrect == 0);

        locationController.createNewLocation(city, height, width, region, country);

        System.out.println("---LOCATION ADDED---");
    }
}
