package org.example.nivel1;

import java.util.Scanner;

public class SimpleProdForEach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(prod(scanner));

    }

    private static int prod(Scanner scanner) {
        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        int prod = 1;

        for (int numero : numeros) {
            prod *= numero;
        }

        return prod;
    }
}
