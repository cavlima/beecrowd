package org.example.nivel1;

import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();
        int velocidade = scanner.nextInt();

        double litros = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f%n", litros);

    }
}
