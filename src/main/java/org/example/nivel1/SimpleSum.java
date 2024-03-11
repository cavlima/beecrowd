package org.example.nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("SOMA = " + (a + b));*/

        //tentando aprimorar o código colocando a prova o meu conhecimento
        // Chamando o método para validar e calcular a soma
        simpleSumWithValidator();

    }

    private static void simpleSumWithValidator() {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[2]; //array de 2 elementos inteiros
        int soma = 0; //variável para receber a soma

        for (int i = 0; i < 2; i++) {

            while (true) {
                try {
                    numeros[i] = scan.nextInt();
                    soma += numeros[i];
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Caractere inválido. Tente novamente: ");
                    scan.next();
                }
            }
        } scan.close();
        System.out.println("SOMA = " + soma);
    }
}
