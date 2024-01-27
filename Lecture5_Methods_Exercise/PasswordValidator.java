package Lecture5_Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isBetween6And10Chars(input) && hasOnlyLettersAndNums(input) && hasAtleast2Digits(input)) {
            System.out.println("Password is valid");
            return;
        }
        if (!isBetween6And10Chars(input) && !hasOnlyLettersAndNums(input) && !hasAtleast2Digits(input)) {
            System.out.println("Password must be between 6 and 10 characters");
            System.out.println("Password must consist only of letters and digits");
            System.out.println("Password must have at least 2 digits");
            return;
        }
        if (!isBetween6And10Chars(input) && !hasAtleast2Digits(input)) {
            System.out.println("Password must be between 6 and 10 characters");
            System.out.println("Password must have at least 2 digits");
            return;
        }
        if (!isBetween6And10Chars(input) && !hasOnlyLettersAndNums(input)) {
            System.out.println("Password must be between 6 and 10 characters");
            System.out.println("Password must consist only of letters and digits");
            return;
        }
        if (!hasAtleast2Digits(input) && !hasOnlyLettersAndNums(input)) {
            System.out.println("Password must consist only of letters and digits");
            System.out.println("Password must have at least 2 digits");
            return;
        }
        if (!isBetween6And10Chars(input)) {
            System.out.println("Password must be between 6 and 10 characters");
            return;
        }
        if (!hasAtleast2Digits(input)) {
            System.out.println("Password must have at least 2 digits");
            return;
        }
        if (!hasOnlyLettersAndNums(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
    }

    public static boolean isBetween6And10Chars(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasOnlyLettersAndNums(String input) {
        String countCorrect = "";
        for (int index = 0; index <= input.length() - 1; index++) {
            if (input.charAt(index) >= 48 && input.charAt(index) <= 57 || input.charAt(index) >= 65 && input.charAt(index) <= 90 || input.charAt(index) >= 97 && input.charAt(index) <= 122) {
                countCorrect += input.charAt(index);
            } else {
                countCorrect = "";
            }
        }
        if (countCorrect.equals(input)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasAtleast2Digits(String input) {
        int numDigits = 0;
        for (int index = 0; index <= input.length() - 1; index++) {
            if (input.charAt(index) >= 48 && input.charAt(index) <= 57) {
                numDigits++;
                if (numDigits == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}