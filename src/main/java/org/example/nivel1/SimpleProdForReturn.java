package org.example.nivel1;

import java.util.Scanner;

public class SimpleProdForReturn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PROD = " + prod(scanner));

    }

    private static int prod(Scanner scanner) {
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        return numeros[0] * numeros[1];
    }
}