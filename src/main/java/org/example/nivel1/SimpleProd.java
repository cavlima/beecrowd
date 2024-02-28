package org.example.nivel1;

import java.util.Scanner;

public class SimpleProd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //prod(scanner);
        System.out.println(prod(scanner.nextInt(), scanner.nextInt()));

    }

    private static void prod(Scanner scanner) {

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("PROD = " + (a * b));
    }

    private static int prod(int a, int b) {

        return a * b;
    }


}
