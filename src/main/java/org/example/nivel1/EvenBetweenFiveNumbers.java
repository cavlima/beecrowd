package org.example.nivel1;

import java.util.Scanner;

public class EvenBetweenFiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtde = scanner.nextInt();

        int[] numeros = new int[qtde];

        for (int i = 0; i < numeros.length; i++) {
            boolean validacao = true;

            while (validacao) {
                if (scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();
                    validacao = false;
                } else {
                    scanner.next();
                    System.out.println("Inválido");
                }
            }
        }
        scanner.close();

        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }

        System.out.println(count + " valores pares");

    }
}
