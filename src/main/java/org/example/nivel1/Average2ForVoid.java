package org.example.nivel1;

import java.util.Scanner;

public class Average2ForVoid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        media(scanner);
    }

    public static void media(Scanner scanner) {
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
        }

        double media = (numeros[0] * 2 + numeros[1] * 3 + numeros[2] * 5) / 10.0;
        System.out.println("MEDIA = " + media);
    }
}
