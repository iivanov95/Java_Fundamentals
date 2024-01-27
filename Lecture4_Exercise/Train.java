package Lecture4_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[countWagons];
        int sum = 0;
        for (int i = 0; i <= train.length - 1; i++) {
            int numPassengers = Integer.parseInt(scanner.nextLine());
            sum += numPassengers;
            train[i] = numPassengers;
        }
        for (int i = 0; i <= train.length - 1; i++) {
            System.out.print(train[i] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}