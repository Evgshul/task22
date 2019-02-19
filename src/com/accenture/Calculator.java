package com.accenture;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s;
        do {
            System.out.println("Enter case: ");
            s = sc.next();

            System.out.println("Enter number a:");
            int a = sc.nextInt();
            System.out.println("Enter number b:");
            int b = sc.nextInt();
            int result = 0;
            switch (s) {
                case "1":
                    result = a + b;
                    break;
                case "2":
                    result = a - b;
                    break;
                case "3":
                    result = a * b;
                    break;
                case "4":
                    result = a / b;
                    break;
                case "0":
                    System.out.println("Closing application");
                   return;
                default :
                    System.out.println("Wrong input");

            }
            System.out.println("Your result is: " + result);

        } while (s != "0");


    }

}
