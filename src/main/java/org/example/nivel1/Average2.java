package org.example.nivel1;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        average(scanner);
        System.out.println("MEDIA = " + average(scanner.nextInt(), scanner.nextInt()));
    }

    public static double average(int a, int b) {

        return (a + b) / 2.0;
    }

    public static void average(Scanner scanner) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("MEDIA = " + average(a, b));
    }
}
