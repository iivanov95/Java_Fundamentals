package Lecture4_Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersArr = new int[n];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j = numbersArr.length - 1; j >= 0; j--) {
            System.out.printf("%d ", numbersArr[j]);
        }
    }
}