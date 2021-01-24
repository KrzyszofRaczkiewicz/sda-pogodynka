package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuUtils {

    public static String getStringInfo(String messege) { // todo messege -> message
        Scanner scanner = new Scanner(System.in);
        System.out.print(messege);
        return scanner.next();
    }

    public static int getIntInfo(String messege) { // todo unnecessary method
        Scanner scanner = new Scanner(System.in);
        System.out.print(messege);
        return scanner.nextInt();
    }
}
