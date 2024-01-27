package Lecture3_Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());
        for (int position = firstSymbol; position <= lastSymbol; position++) {
            char currentSymbol = (char) position;
            System.out.printf("%c ",currentSymbol);
        }
    }
}