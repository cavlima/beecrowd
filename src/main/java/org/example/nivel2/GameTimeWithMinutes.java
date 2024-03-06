package org.example.nivel2;

import java.util.Scanner;
public class GameTimeWithMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startTime = scanner.nextInt();
        int startTimeMinutes = scanner.nextInt();
        int endTime = scanner.nextInt();
        int endTimeMinutes = scanner.nextInt();

        if (startTime > endTime) {
            int duration = endTime - startTime + 24;
            int durationMinutes = endTimeMinutes - startTimeMinutes + 60;
            System.out.println("O JOGO DUROU " + duration + " HORA(S) E " + durationMinutes + " MINUTO(S)");
        } else if (startTime < endTime) {
            int duration = endTime - startTime;
            int durationMinutes = endTimeMinutes - startTimeMinutes;
            System.out.println("O JOGO DUROU " + duration + " HORA(S) E " + durationMinutes + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }

    }
}
