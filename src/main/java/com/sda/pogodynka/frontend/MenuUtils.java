package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuUtils {

    public static String getStringInfo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public static float getFloatInfo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        float val=0;
        try {
            val = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Incorrect value!");
            getFloatInfo(message);
        }
        return val;
    }
}
