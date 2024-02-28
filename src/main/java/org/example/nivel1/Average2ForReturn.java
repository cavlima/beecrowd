package org.example.nivel1;

import java.util.Scanner;

public class Average2ForReturn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("MEDIA = " + average(scanner));

    }

    public static double average(Scanner scanner) {
        double[] numeros = new double[3];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = scanner.nextDouble();
        }
        return (numeros[0] * 2 + numeros[1] * 3 + numeros[2] * 5) / 10;
    }
}
