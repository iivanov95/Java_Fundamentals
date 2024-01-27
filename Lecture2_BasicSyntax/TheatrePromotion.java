package Lecture2_BasicSyntax;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayTime = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        boolean isValid = true;
        if (age >= 0 && age <= 18) {
            if (dayTime.equals("Weekday")) {
                price = 12;
            } else if (dayTime.equals("Weekend")) {
                price = 15;
            } else if (dayTime.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (dayTime.equals("Weekday")) {
                price = 18;
            } else if (dayTime.equals("Weekend")) {
                price = 20;
            } else if (dayTime.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (dayTime.equals("Weekday")) {
                price = 12;
            } else if (dayTime.equals("Weekend")) {
                price = 15;
            } else if (dayTime.equals("Holiday")) {
                price = 10;
            }
        } else {
            isValid = false;
        }
        if (isValid) {
            System.out.println(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
