package com.accenture;

public class Marathon {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265};

        printResult(names, times);
        System.out.println("---------------");
        printResult2(names, times);
    }


    private static void printResult(String[] n, int[] t) {

        int i = n.length - 1;
        int j = t.length - 1;
        int k = 0;
        int l = 0;

        do {
            i--;
            j--;
            System.out.printf("%-9s %2d\n", (n[k++]), (t[l++]));
        } while (i >= 0 || j >= 0);


    }

    private static void printResult2(String[] n, int[] t) {

        if (n.length == t.length) {
            for (int i = 0; i < n.length; i++) {


                System.out.printf("%-9s %2d\n", (n[i]), (t[i]));
            }


        } else System.out.println("n " + "isn't equals" + " t");
    }


}


