package com.sda.pogodynka;

import com.sda.pogodynka.frontend.MenuClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuClass.getMenu();

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
                    System.out.println("czytanie ze zrozumieniem leży nie?");
            }
        }

    }
}
