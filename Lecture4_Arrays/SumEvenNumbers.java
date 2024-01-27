package Lecture4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String[] inputArr = input.split(" ");
//        int[] numbersArr = new int[inputArr.length];
//        for (int i = 0; i < numbersArr.length; i++) {
//            numbersArr[i] = Integer.parseInt(inputArr[i]);
//        }
        int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }
        }
        System.out.println(sum);
    }
}
