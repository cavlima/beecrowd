package org.example.nivel2;

import java.util.Scanner;

public class SimpleProd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            if (scanner.hasNextInt()){
                int value1 = scanner.nextInt();
                int value2 = scanner.nextInt();
                System.out.println("PROD = " + (value1 * value2));
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            } // fim do if

        } // fim do while
        scanner.close();
    }
}
