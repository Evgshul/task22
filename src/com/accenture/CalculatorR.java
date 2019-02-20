package com.accenture;

import java.util.Scanner;

public class CalculatorR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What operation would you like to do? ");
        System.out.println("If you want to add values enter 1");
        System.out.println("If you want to subtract numbers enter 2");
        System.out.println("If you want to multiply numbers enter 3");
        System.out.println("If you want to divide numbers enter 4");
        System.out.println("If you want to quit application,enter 0 ");

        System.out.println("Enter  operation number: ");
        int operandnumber = input.nextInt();

        calc(operandnumber);


    }

    public static void calc(int operandnumber) {
        Scanner input = new Scanner(System.in);
        if (operandnumber != 1 || operandnumber != 2 || operandnumber != 3 || operandnumber != 4)
            System.exit(0);
        System.out.println("Now enter first number");
        int number1 = input.nextInt();
        System.out.println("Now enter second number");
        int number2 = input.nextInt();
        switch (operandnumber) {
            case 1:
                if (operandnumber == 1)
                    System.out.println((number1 + number2));
                System.out.println("Enter  operation number: ");
                operandnumber = input.nextInt();
                calc(operandnumber);
                break;
            case 2:
                if (operandnumber == 2)
                    System.out.println(number1 - number2);
                System.out.println("Enter  operation number: ");
                operandnumber = input.nextInt();
                calc(operandnumber);
                break;
            case 3:
                if (operandnumber == 3)
                    System.out.println(number1 * number2);
                System.out.println("Enter  operation number: ");
                operandnumber = input.nextInt();
                calc(operandnumber);
                break;
            case 4:
                if (operandnumber == 4)
                    System.out.println((number1 / number2));
                System.out.println("Enter  operation number: ");
                operandnumber = input.nextInt();
                calc(operandnumber);
                break;

            default:
                System.exit(0);
        }
    }
}
