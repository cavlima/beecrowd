package org.example.nivel1;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("PROD = " + num1 * num2);*/

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            while (true) {
                if(scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Inválido. Digite um valor inteiro.");
                    scanner.next();
                }
            }
        }

        int prod = numeros[0] * numeros[1];
        System.out.println("PROD = " + prod);
    }
}
