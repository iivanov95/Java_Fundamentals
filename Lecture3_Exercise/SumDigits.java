package Lecture3_Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
//        while (number > 0) {
//            int lastDigit = number % 10;
//            sum += lastDigit;
//            number = number / 10;
//        }
//        System.out.println(sum);

        String numberAsString = "" + number;
        for (int position = 0; position <= numberAsString.length() - 1; position++) {
            char currentSymbol = numberAsString.charAt(position);
            int currentDigit = Integer.parseInt(currentSymbol + "");
            sum += currentDigit;
        }
        System.out.println(sum);
    }
}