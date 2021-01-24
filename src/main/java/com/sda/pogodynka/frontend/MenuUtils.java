package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuUtils {

    public static String getStringInfo(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }
}
