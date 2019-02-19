package com.accenture;

import java.util.*;

public class OneDemensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int sizeOfArray = sc.nextInt();


        long[] array = fillRandomeValues(sizeOfArray);

        printArray(array);
        System.out.println();
        System.out.println("min values is: " + getMin(array));
        getMax(array);
        meanValue(array);

        ArrayList<Long> num =

    }

    private static long[] fillRandomeValues(int size) {

        long[] arrays = new long[size];
        Random rd = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rd.nextLong();
        }
        return arrays;
    }

    private static void printArray(long[] array) {

        for (long l : array) System.out.println(l);

    }

    private static long getMin(long[] longarray) {

        long min = longarray[0];

        for (int i = 0; i < longarray.length; i++) {

            if (longarray[i] < min) min = longarray[i];

        }

        return min;
    }

    private static void getMax(long[] longearray) {
        long max = longearray[0];
        for (long l : longearray) {
            if (l > max) max = l;

        }

        System.out.println("Max value of Array is " + max);
    }

    private static void meanValue(long[] array) {

        long summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        long avr = summ / array.length;

        System.out.println("Average is " + avr);
    }

}
