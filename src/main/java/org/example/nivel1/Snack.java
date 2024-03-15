package org.example.nivel1;

import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();
        int quant = scanner.nextInt();
        scanner.close();
        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};

        if (code >= 1 && code <= 5) {
            System.out.printf("Total: R$ %.2f%n", quant * precos[code - 1]);
        }
    }
}
