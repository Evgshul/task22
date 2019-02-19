package com.accenture;

import java.util.Scanner;

public class FactorialCalculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for factorial: ");
        int input = scanner.nextInt();

        System.out.println(loopFactorial(input));
        System.out.println(recursionFactorial(input));
    }

    private static int loopFactorial(int b) {
        int a = 1;
        for (int i = 1; i <= b; i++) {
             a *= i;// same a = a * i
        }
        return a;
    }


    private static int recursionFactorial (int number){

        if (number<=1){
            return 1;
        }
        else {
            return number * recursionFactorial(number-1);
        }
    }
}
