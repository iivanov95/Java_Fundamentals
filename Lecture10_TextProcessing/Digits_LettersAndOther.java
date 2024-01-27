package Lecture10_TextProcessing;

import java.util.Scanner;

public class Digits_LettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        //Agd#53Dfg^&4F53
        StringBuilder digitsSb = new StringBuilder();
        StringBuilder lettersSb = new StringBuilder();
        StringBuilder charsSb = new StringBuilder();

        for (int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.charAt(i);
            if (Character.isDigit(symbol)) {
                digitsSb.append(symbol);
            } else if (Character.isLowerCase(symbol) || Character.isUpperCase(symbol)) {
                lettersSb.append(symbol);
            } else {
                charsSb.append(symbol);
            }
        }
        System.out.println(digitsSb);
        System.out.println(lettersSb);
        System.out.println(charsSb);
    }
}