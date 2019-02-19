package com.accenture;

public class GravityCalculator {

    static final double GRAVITY = -9.81;

    public static void main(String[] args) {
        int fallingTime;

        if (args.length > 0) {
            fallingTime = Integer.valueOf(args[0]);

        } else fallingTime = 0;

        double initialPozition = args.length > 1 ? Double.valueOf(args[1]) : 0;

        double initialVelocity = args.length > 2 ? Double.valueOf(args[2]) : 0;

        for (String arg : args) System.out.println(arg);


        double finalPozition = calculateFinalPosition(fallingTime, initialVelocity, initialPozition);

        System.out.println("Position in " + fallingTime + " seconds: " + finalPozition);
    }

    private static double calculateFinalPosition(int t, double v0, double X0) {


        return ((t ^ 2) * 0.5 * GRAVITY) + v0 * t + X0;

    }
}
