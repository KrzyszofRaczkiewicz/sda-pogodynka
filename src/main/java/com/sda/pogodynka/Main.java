package com.sda.pogodynka;

import com.sda.pogodynka.frontend.MenuClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuClass.getMenu();

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 0:
                    return;
            }
        }

    }
}
