package org.example.nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double media = ((a*2)+(b*3)+(c*5))/(2+3+5);
        System.out.println(String.format("MEDIA = %.1f",media));
        scanner.close();*/

        averageWithValidator(scanner);
    }

    private static void averageWithValidator(Scanner scanner) {
        double[] numeros = new double[3];
        double[] pesos = {2, 3, 5};
        double somaPesos = 0, somaNotas = 0;

        for (int i = 0; i < numeros.length; i++) {

            while (true) {
                try {
                    numeros[i] = scanner.nextDouble();
                    somaNotas += numeros[i] * pesos[i];
                    somaPesos += pesos[i];
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    scanner.next();
                }
            } // fim do while

        } // fim do for
        scanner.close();
        double media = somaNotas / somaPesos;
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
