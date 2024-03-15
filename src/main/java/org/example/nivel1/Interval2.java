package org.example.nivel1;

import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n < Math.pow(-10, 7) || n > Math.pow(10, 7) && scanner.hasNextInt()) {
            n = scanner.nextInt();
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (numeros[j] >= 10 && numeros[j] <= 20) {
                count++;
            }
        }

        int count2 = n - count;

        System.out.println(count + " in");
        System.out.println(count2 + " out");
    }
}
