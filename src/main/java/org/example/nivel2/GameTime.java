package org.example.nivel2;

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int endTime = scanner.nextInt();

        if (startTime > endTime) {
            int duration = endTime - startTime + 24;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else if (startTime < endTime) {
            int duration = endTime - startTime;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        scanner.close();
    }
}