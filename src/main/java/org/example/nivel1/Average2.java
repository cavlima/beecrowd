package org.example.nivel1;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*double a = scanner.cnextDouble();
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

        // Loop para ler as 3 notas
        for (int i = 0; i < numeros.length; i++) { //loop para ler as 3 notas

            // Loop infinito para solicitar ao usuário que insira uma nota válida
            while (true) {
                // Verifica se a próxima entrada é um número decimal válido
                if (scanner.hasNextDouble()) {
                    numeros[i] = scanner.nextDouble(); // leitura da entrada como uma nota
                    somaNotas += numeros[i] * pesos[i]; // calcula a soma ponderada das 3 notas
                    somaPesos += pesos[i]; // calcula a soma dos pesos
                    break; // encerra o loop while
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número válido.");
                    scanner.next();
                }
            } // fim do while e volta para o loop for
        } // fim do for

        scanner.close();
        double media = somaNotas / somaPesos;
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
