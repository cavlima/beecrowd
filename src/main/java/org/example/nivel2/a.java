package org.example.nivel2;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            numeros[i] = scanner.nextInt();
        }

        if (numeros[0] % numeros[1] == 1){
            System.out.println("São multiplos");
        } else System.out.println("Nao sao multiplos");

    }
}
