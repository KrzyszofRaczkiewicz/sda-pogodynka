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
            Scanner scanner = new Scanner(System.in);
            String menu = scanner.next();
            switch (menu) {
                case "1": // dodaj lokalizacje
                    System.out.println("Dodajemy lokalizację");
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
                    System.out.println("nie ze mną te numery Bruner....\n\n sprobuj jeszcze raz...");
            }
        }
    }
}
