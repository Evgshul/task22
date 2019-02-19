package com.accenture;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello");
        System.out.println("World");

        String a = "Hello, Word";
        /*String[] Arrays = new String[3];

        Arrays[0] = "Hello";
        Arrays[1] = "World";
        Arrays[2] = "!!!";

        for (String s : Arrays) System.out.println(s);*/

        for (int i = 0; i<a.length();i++) {
            char q = a.charAt(i);
            System.out.println(q);
        }

    }
}
