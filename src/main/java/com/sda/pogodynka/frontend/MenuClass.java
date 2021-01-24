package com.sda.pogodynka.frontend;

import java.util.Scanner; // todo unnecessary import

public class MenuClass {

    private static void getMenuInfo() {
        System.out.println("Weather Manager 1.0");
        System.out.println("1 - Add localization");
        System.out.println("2 - Localization list");
        System.out.println("3 - Show weather in localization");
        System.out.println("0 - Kill Manager... WeatherManager....");
    }

    public static void getMenu() {
        while (true) {
            getMenuInfo();

            String menu = MenuUtils.getStringInfo("");

            switch (menu) {
                case "1": // dodaj lokalizacje
                    addNewLocation();
                    System.out.println("----------------------------------");
                    break;
                case "2": // lista lokalizacji
                    System.out.println("Localization list");
                    System.out.println("----------------------------------");
                    break;
                case "3": // aktualizacja danych lokalizacji
                    System.out.println("Weather in localization");
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

    private static void addNewLocation() {
        System.out.println("ADDING NEW LOCALIZATION");
        MenuUtils.getStringInfo("Name of the city (required):");
        MenuUtils.getStringInfo("Give geographic height (required), format: N, S:");
        MenuUtils.getStringInfo("Give geographic width (required), format: E, W:");
        MenuUtils.getStringInfo("Give region (optional - none):");
        MenuUtils.getStringInfo("Give country name (required):");
    }
}
