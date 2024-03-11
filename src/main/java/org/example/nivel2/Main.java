package org.example.nivel2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            boolean validacao = true;

            while (validacao) {
                if (scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();
                    validacao = false;
                } else {
                    scanner.next();
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }
        scanner.close();

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }

            if (numero > 0){
                positivo++;
            }
            else {
                negativo++;
            }
        }

        System.out.println(par  + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

    }
}