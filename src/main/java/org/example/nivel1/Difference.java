package org.example.nivel1;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int dif = ((a*b) - (c*d));
        System.out.println(String.format("DIFERENCA = %d",dif));*/

        System.out.println("DIFERENCA = " + diferenca(scanner));

    }

    private static int diferenca(Scanner scanner) {
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        return ((numbers[0]*numbers[1]) - (numbers[2]*numbers[3]));
    }
}
