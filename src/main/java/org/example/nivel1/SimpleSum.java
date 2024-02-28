package org.example.nivel1;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("SOMA = " + simpleSum(scanner));
        //simpleSumVoid(scanner);

        //System.out.println("SOMA = " + sumForLoop(scanner));
        //sumForLoopVoid(scanner);

        //System.out.println("SOMA = " + sumForEach(scanner));
        sumForEachVoid(scanner);
    }

    public static int simpleSum(Scanner scanner) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a + b;
    }

    public static void simpleSumVoid(Scanner scanner) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("SOMA = " + (a + b));
    }


    private static int sumForLoop(Scanner scanner) {
        int soma = 0;
        for (int i = 0; i < 2; i++) {
            soma += scanner.nextInt();
        }
        return soma;
    }

    private static void sumForLoopVoid(Scanner scanner) {
        int soma = 0;
        for (int i = 0; i < 2; i++) {
            soma += scanner.nextInt();
        }
        System.out.println("SOMA = " + soma);
    }


    private static int sumForEach(Scanner scanner) {
        int[] numeros = new int[2];

        //numeros[0] = scanner.nextInt();
        //numeros[1] = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    private static void sumForEachVoid(Scanner scanner) {
        int[] numeros = new int[2];

        //numeros[0] = scanner.nextInt();
        //numeros[1] = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("SOMA = " + soma);
    }
}
