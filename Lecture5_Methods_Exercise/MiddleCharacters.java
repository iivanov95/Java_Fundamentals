package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleChars(text);
    }
    public static void printMiddleChars(String text) {
        int lengthText = text.length();
        //нечетна дължина -> един среден символ
        //четна дължина -> два средни символа
        if (lengthText % 2 != 0) {
            //"aString" - ['a', 'S', 't', 'r', 'i', 'n', 'g']
            int indexMiddleSymbol = lengthText / 2;
            System.out.println(text.charAt(indexMiddleSymbol));
        } else {
            int indexFirstMiddleSymbol = (lengthText / 2) - 1;
            int indexSecondMiddleSymbol = lengthText / 2;
            System.out.print(text.charAt(indexFirstMiddleSymbol));
            System.out.print(text.charAt(indexSecondMiddleSymbol));
        }
    }
}