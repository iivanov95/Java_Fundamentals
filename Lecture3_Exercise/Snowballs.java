package Lecture3_Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        double highestValue = 0;
        String bestBall = "";
        for (int i = 1; i <= numberSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (snowballValue > highestValue) {
                highestValue = snowballValue;
                bestBall = String.format("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuality);
            }
        }
        System.out.println(bestBall);
    }
}