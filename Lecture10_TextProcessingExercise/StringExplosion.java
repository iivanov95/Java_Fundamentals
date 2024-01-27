package Lecture10_TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"abv>1>1>2>2asdasd"

        StringBuilder textBuilder = new StringBuilder(input);

        int totalPower = 0;
        for (int position = 0; position <= textBuilder.length() - 1; position++) {
            char currentSymbol = textBuilder.charAt(position);
            if (currentSymbol == '>') {
                int explosionPower = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                totalPower += explosionPower;
            } else if (currentSymbol != '>' && totalPower > 0) {
                textBuilder.deleteCharAt(position);
                totalPower--;
                position--;
            }
        }
        System.out.println(textBuilder);
    }
}