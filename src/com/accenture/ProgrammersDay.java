package com.accenture;

import java.util.Scanner;

public class ProgrammersDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year between 1800 and 2800: ");
        int year = scanner.nextInt();
        getDateMyWay(year);
        //getDate(year);

    }

    private static void getDateMyWay(int year) {
        System.out.print("Output: ");
        if (year > 1800 && year < 2800 && year != 1918) {
            if (year % 4 == 0) {
                System.out.println("14.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        } else if (year == 1918) {
            System.out.println("30.08." + year);
        } else {
            System.out.println("Wrong year");
        }
    }
}
