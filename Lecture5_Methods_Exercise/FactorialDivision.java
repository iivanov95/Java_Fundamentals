package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        double result = (1.0 * factorial(first)) / factorial(second);
        System.out.printf("%.2f", result);
    }

    //факториел на първото число
    public static long factorial (int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}