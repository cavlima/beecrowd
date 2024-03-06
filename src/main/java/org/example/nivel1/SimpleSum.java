package org.example.nivel1;
import java.util.*;

public class SimpleSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("SOMA = " + (a + b));

        //simpleSumValidator();

    }

    private static void simpleSumValidator() {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            boolean validacao = true;

            while(validacao){
                if (scan.hasNextInt()) {
                    numeros[i] = scan.nextInt();
                    validacao = false;
                } else {
                    scan.next();
                    System.out.println("Número inválido. Tente novamente: ");
                }
            }
        }

        System.out.println("SOMA = " + (numeros[0] + numeros[1]));
    }
}
