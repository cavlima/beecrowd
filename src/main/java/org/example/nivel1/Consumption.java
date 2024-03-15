package org.example.nivel1;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalDistance = scanner.nextInt();
        double fuelTotal = scanner.nextDouble();

        double consumption = totalDistance / fuelTotal;

        System.out.printf("%.3f km/l%n", consumption);

        scanner.close();
    }
}
