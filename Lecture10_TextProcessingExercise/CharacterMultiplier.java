package Lecture10_TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstWord = input.split(" ")[0];
        String secondWord = input.split(" ")[1];

        System.out.println(sumOfCharacterCodes(firstWord, secondWord));
    }
    public static int sumOfCharacterCodes (String firstWord, String secondWord) {
        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();
        int sum = 0;

        if (firstWordLength > secondWordLength) {
            int diff = firstWordLength - secondWordLength;

            for (int i = 0; i < firstWordLength - diff; i++) {
                for (int j = i; j <= i; j++) {
                    sum += firstWord.charAt(i) * secondWord.charAt(j);
                }
            }
            for (int i = firstWordLength - diff; i < firstWordLength; i++) {
                sum += firstWord.charAt(i);
            }

        } else if (secondWordLength > firstWordLength) {
            int diff = secondWordLength - firstWordLength;

            for (int i = 0; i < secondWordLength - diff; i++) {
                for (int j = i; j <= i; j++) {
                    sum += secondWord.charAt(i) * firstWord.charAt(j);
                }
            }
            for (int i = secondWordLength - diff; i < secondWordLength; i++) {
                sum += secondWord.charAt(i);
            }

        } else {
            for (int i = 0; i < firstWordLength; i++) {
                for (int j = i; j <= i; j++) {
                    sum += firstWord.charAt(i) * secondWord.charAt(j);
                }
            }
        }
        return sum;
    }
}