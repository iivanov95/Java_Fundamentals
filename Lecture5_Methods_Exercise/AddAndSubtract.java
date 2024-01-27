package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractThirdNumFromSum(first, second, third));
    }
    public static int sumFirstTwoNumbers(int first, int second) {
        return first + second;
    }

    public static int subtractThirdNumFromSum(int first, int second, int third) {
        return sumFirstTwoNumbers(first, second) - third;
    }
}