package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            //проверка дали текста е палиндром
            if (isTextPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    //метод за проверка за палиндром - true/false
    public static boolean isTextPalindrome(String text) {
        String reversedText = ""; //текстът обърнат наобратно

        for (int index = text.length() - 1; index >= 0 ; index--) {
            reversedText += text.charAt(index);
        }
        return text.equals(reversedText);
    }
}