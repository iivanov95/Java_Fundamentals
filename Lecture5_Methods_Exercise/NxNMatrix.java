package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
        }
    }
}