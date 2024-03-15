package org.example.nivel1;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        System.out.println(String.format("%.4f", DistanceBetweenTP()));


    }

    private static double DistanceBetweenTP() {
        Scanner scanner = new Scanner(System.in);

        double[] num = new double[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextDouble();
        }
        scanner.close();

        return Math.sqrt(Math.pow(num[2] - num[0], 2) + Math.pow(num[3] - num[1], 2));
    }
}
