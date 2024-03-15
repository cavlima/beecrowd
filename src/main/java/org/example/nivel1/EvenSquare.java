package org.example.nivel1;

import java.util.Scanner;

public class EvenSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            n = scanner.nextInt();
        } while (n < 5 || n > 2000);

        for (int i = 2; i <= n; i += 2) {
            System.out.printf("%d^2 = %d%n", i, i * i);
        }


        scanner.close();
    }
}
