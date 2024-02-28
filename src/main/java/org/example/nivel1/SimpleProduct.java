package org.example.nivel1;

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("PROD = " + simpleProductVoid(scanner));
        //simpleProduct(scanner);

        //System.out.println("PROD = " + simpleProductForEach(scanner));
        simpleProductForEachVoid(scanner);



    }

    private static void simpleProduct(Scanner scanner) {

        //int a = scanner.nextInt();
        //int b = scanner.nextInt();

        int[] numeros = new int[2];
        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("PROD = " + (numeros[0] * numeros[1]));
    }

    private static int simpleProductVoid(Scanner scanner) {

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        return numeros[0] * numeros[1];
    }

    private static void simpleProductForEachVoid(Scanner scanner) {

        int[] numeros = new int[2];
        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        int prod = 1;
        for (int numero : numeros) {
            prod *= numero;
        }

        System.out.println("PROD = " + prod);
    }


    private static int simpleProductForEach(Scanner scanner) {

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        int prod = 1;
        for (int numero : numeros) {
            prod *= numero;
        }
        return prod;
    }

}
