package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuUtils {

    public static String getStringInfo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public static int getIntInfo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int val=0;
        try {
            val = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect value!");
            getIntInfo(message);
        }
        return val;
    }
}
