package org.example.nivel1;

import java.util.Scanner;

public class SimpleProductForVoid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        prod(scanner);

    }

    private static void prod(Scanner scanner) {
        int[] numeros = new int[2];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("PROD = " + numeros[0] * numeros[1]);
    }
}
