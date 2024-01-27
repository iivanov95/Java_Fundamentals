package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printLowestNum(firstNum, secondNum, thirdNum);
    }
    public static void printLowestNum(int first, int second, int third) {
        if (first < second && first < third) {
            System.out.println(first);
        } else if (second < first && second < third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}