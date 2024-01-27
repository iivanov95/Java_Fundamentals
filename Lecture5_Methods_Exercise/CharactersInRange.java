package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharsInRange(firstSymbol, secondSymbol);
    }
    public static void printCharsInRange(char first, char second) {
        //започваме със символа с по-малък ASCII код
        if (first < second) {
            for (char symbol = (char) (first + 1); symbol < second; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (second + 1); symbol < first; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}