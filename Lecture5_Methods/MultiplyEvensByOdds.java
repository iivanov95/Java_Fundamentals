package Lecture5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplySums(numInput));
    }

    public static int multiplySums(int num) {
        return evenSum(num) * oddSum(num);
    }

    public static int evenSum(int n) {
        String intToString = Integer.toString(n);
        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int oddSum(int n) {
        String intToString = Integer.toString(n);
        int[] arr = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        return sum;
    }
}