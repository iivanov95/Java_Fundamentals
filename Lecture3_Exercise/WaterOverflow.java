package Lecture3_Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sum = 0;
        for (int i = 1; i <= numInputs; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (capacity < currentLiters) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= currentLiters;
                sum += currentLiters;
            }
        }
        System.out.println(sum);
    }
}