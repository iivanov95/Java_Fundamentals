package Lecture10_TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder modifiedString = new StringBuilder(input);

        for (int i = 0; i <= modifiedString.length() - 1; i++) {

            char firstSymbol = modifiedString.charAt(i);
            if (i + 1 > modifiedString.length() - 1) {
                break;
            }
            char secondSymbol = modifiedString.charAt(i + 1);

            if (firstSymbol == secondSymbol) {
                modifiedString.deleteCharAt(i + 1);
                i = -1;
            }
        }
        System.out.println(modifiedString);
    }
}