package org.example.nivel1;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        result();
    }

    private static void result() {
        Scanner scanner = new Scanner(System.in);

        //int qtde = scanner.nextInt();
        //double[] numeros = new double[qtde];

        double[] numeros = new double[6];


        for (int i = 0; i < numeros.length; i++) {

            boolean validacao = true;

            while (validacao) { // a validacao por ser true entra no loop
                if (scanner.hasNextDouble()) {
                    numeros[i] = scanner.nextDouble();
                    validacao = false; //e para sair tenho que fazer com que validacao receba false para voltar ao for
                } else {
                    scanner.next();
                    System.out.println("Erro. Digite um número.");
                }
            }
        }
        scanner.close();

        int count = 0;
        for (double numero : numeros) {
            if (numero > 0){
                count++;
            }
        }

        System.out.println(count + " valores positivos.");
    }
}
