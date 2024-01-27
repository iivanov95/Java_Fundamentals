package Lecture4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String[] inputArr = input.split(" ");
//        int[] numbersArr = new int[inputArr.length];
//        for (int i = 0; i < numbersArr.length; i++) {
//            numbersArr[i] = Integer.parseInt(inputArr[i]);
//        }
//        for (int i = 0; i < numbersArr.length; i++) {
//            System.out.println(numbersArr[i]);
//        }

        String[] inputArr = input.split(" ");

        for (String el : inputArr) {
            System.out.println(el);
        }
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i : numbersArr) {

        }
    }
}