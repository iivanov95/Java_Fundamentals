package Lecture8_BitwiseOperations;

import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int binaryDigit = Integer.parseInt(scanner.nextLine());
        int count = 0;
        while (n > 0) {
            int remainder = n % 2;
            if (remainder == binaryDigit) {
                count++;
            }
            n /= 2;
        }
        System.out.println(count);
    }
}