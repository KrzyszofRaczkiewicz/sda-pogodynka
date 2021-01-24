package com.sda.pogodynka.frontend;

import java.util.Scanner;

public class MenuUtils {

    public static String getStringInfo(String messege){
        Scanner scanner = new Scanner(System.in);
        System.out.print(messege + " ");
        return scanner.next();
    }
    public static int getIntInfo(String messege){
        Scanner scanner = new Scanner(System.in);
        System.out.print(messege + " ");
        return scanner.nextInt();
    }
}
