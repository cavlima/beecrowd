package org.example.nivel1;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {

        result();
    }

    private static void result() {

        Scanner scan = new Scanner(System.in);

        double[] numeros = new double[6];

        int count = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < 6; i++) {
            numeros[i] = scan.nextDouble();
        }

        for (double numero : numeros) {
            if (numero > 0) {
                count++;
            } else if (numero < 0) {
                count2++;
            } else {
                count3++;
            }
        }

        System.out.println("Quantidade de valores positivos: " + count);
        //System.out.println("Quantidade de valores negativos: " + count2);
        //System.out.println("Quantidade de valores iguais a zero: " + count3);


        //positiveNumbersValidator();

    }

    private static void positiveNumbersValidator() {
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
            if (numero > 0) {
                count++;
            }
        }

        System.out.println(count + " valores positivos.");
    }


}
