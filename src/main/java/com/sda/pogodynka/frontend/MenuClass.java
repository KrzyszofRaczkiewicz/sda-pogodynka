package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuClass {

    public static void getMenuInfo(){
        System.out.println("POGODYNKA 1.0");
        System.out.println("1 - Dodaj lokalizacje do bazy danych");
        System.out.println("2 - Lista zapisanych lokalizacji");
        System.out.println("3 - Aktualizuj dane lokalizacji");
        System.out.println("0 - ZAKOŃCZ DZIAŁANIE PROGRAMU");
    }

    public static void getMenu(){
        while (true) {
            getMenuInfo();

            String menu = MenuUtils.getStringInfo("");

            switch (menu) {
                case "1": // dodaj lokalizacje
                    addNewLocation();
                    System.out.println("----------------------------------");
                    break;
                case "2": // lista lokalizacji
                    System.out.println("Lista lokalizacji");
                    System.out.println("----------------------------------");
                    break;
                case "3": // aktualizacja danych lokalizacji
                    System.out.println("Aktualizacja danych");
                    System.out.println("----------------------------------");
                    break;
                case "0":
                    System.out.println("Sajonara!!!");
                    return;
                default:
                    System.out.println("serio??? to takie trudne wybrać odpowiedni numer....\n\nsprobuj jeszcze raz...");
            }
        }
    }

    private static void addNewLocation() {
        System.out.println("DODAJEMY NOWĄ LAKALIZACJE");
        MenuUtils.getStringInfo("Podaj nazwę miasta:");
        MenuUtils.getStringInfo("Podaj szerokość geograficzną, format: S, N:");
        MenuUtils.getStringInfo("Podaj długość geograficzną, format: W, E:");
        MenuUtils.getStringInfo("Podaj region:");
        MenuUtils.getStringInfo("Podaj nazwę kraju:");
    }
}
