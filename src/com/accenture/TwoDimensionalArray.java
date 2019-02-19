package com.accenture;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of row");
        int row = sc.nextInt();
        System.out.println("Input number of column");
        int col = sc.nextInt();


        int[][] twodimentionarray = fillArray(row, col);
        printTwoDimenArray(twodimentionarray);
        System.out.println();
        minValue(twodimentionarray);
        maxValue(twodimentionarray);
        meanValue(twodimentionarray);
    }

    private static int[][] fillArray(int rows, int column) {

        int[][] twoDimensionalArray = new int[rows][column];
        Random rd = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                twoDimensionalArray[i][j] = rd.nextInt();
            }
        }
        return twoDimensionalArray;

    }

    private static void printTwoDimenArray(int[][] twodimarray) {

        for (int[] row : twodimarray) {
            System.out.println();
            for (int i : row) {
                System.out.printf("%-12d", i);
            }
        }
    }

    private static void minValue(int[][] twodimarray) {

        int min = twodimarray[0][0];

        for (int i = 0; i < twodimarray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (twodimarray[i][j] < min)
                    min = twodimarray[i][j];
            }
        }
        System.out.println("Min value ir " + min);
       /*
        int max = twodimarray[0][0];
        for (int[] row : twodimarray) {
            for (int i : row) {
                if (i <= min) min=i;

            }*/

    }

    private static void maxValue(int[][] twodimarray) {

        int max = twodimarray[0][0];

        for (int i = 0; i < twodimarray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (twodimarray[i][j] > max)
                    max = twodimarray[i][j];
            }
        }
        System.out.println("Max value ir " + max);

    }

    private static void meanValue(int[][] array) {

        int summ = 0;
        int summ1 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                summ += array[i][j];
                summ1 += i + j;
            }
        }
        int avr = summ / summ1;

        System.out.println("Average is " + avr);

    }
}


