package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLinesToFollow = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[numLinesToFollow];
        int[] secondArr = new int[numLinesToFollow];
        for (int i = 1; i <= numLinesToFollow; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <= numbers.length - 1; j++) {
                if (i % 2 != 0) {
                    firstArr[i - 1] = numbers[0];
                    secondArr[i - 1] = numbers[1];
                } else {
                    firstArr[i - 1] = numbers[1];
                    secondArr[i - 1] = numbers[0];
                }
            }
        }
        for (int i = 0; i <= firstArr.length - 1; i++) {
            System.out.print(firstArr[i] + " ");
            if (i == firstArr.length - 1) {
                System.out.println();
            }

        }
        for (int i = 0; i <= secondArr.length - 1; i++) {
            System.out.print(secondArr[i] + " ");
            if (i == secondArr.length - 1) {
                System.out.println();
            }
        }
    }
}