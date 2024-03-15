package org.example.nivel1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, num, num * i);
        }
    }
}
