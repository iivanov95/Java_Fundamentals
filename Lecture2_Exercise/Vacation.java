package Lecture2_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double totalSum = 0;
        switch (groupType) {
            case "Students":
                if (day.equals("Friday")) {
                    totalSum = numPeople * 8.45;
                    if (numPeople >= 30) {
                        totalSum = totalSum * 0.85;
                    }
                } else if (day.equals("Saturday")) {
                    totalSum = numPeople * 9.80;
                    if (numPeople >= 30) {
                        totalSum = totalSum * 0.85;
                    }
                } else if (day.equals("Sunday")) {
                    totalSum = numPeople * 10.46;
                    if (numPeople >= 30) {
                        totalSum = totalSum * 0.85;
                    }
                }
                System.out.printf("Total price: %.2f", totalSum);
                break;
            case "Business":
                if (day.equals("Friday")) {
                    totalSum = numPeople * 10.9;
                    if (numPeople >= 100) {
                        totalSum = totalSum - (10.9 * 10);
                    }
                } else if (day.equals("Saturday")) {
                    totalSum = numPeople * 15.6;
                    if (numPeople >= 100) {
                        totalSum = totalSum - (15.6 * 10);
                    }
                } else if (day.equals("Sunday")) {
                    totalSum = numPeople * 16;
                    if (numPeople >= 100) {
                        totalSum = totalSum - (16 * 10);
                    }
                }
                System.out.printf("Total price: %.2f", totalSum);
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    totalSum = numPeople * 15;
                    if (numPeople >= 10 && numPeople <= 20) {
                        totalSum = totalSum * 0.95;
                    }
                } else if (day.equals("Saturday")) {
                    totalSum = numPeople * 20;
                    if (numPeople >= 10 && numPeople <= 20) {
                        totalSum = totalSum * 0.95;
                    }
                } else if (day.equals("Sunday")) {
                    totalSum = numPeople * 22.5;
                    if (numPeople >= 10 && numPeople <= 20) {
                        totalSum = totalSum * 0.95;
                    }
                }
                System.out.printf("Total price: %.2f", totalSum);
                break;
        }
    }
}