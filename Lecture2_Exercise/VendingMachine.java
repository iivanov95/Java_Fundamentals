package Lecture2_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoneyInserted = 0;
        double productPrice = 0;
        while (!input.equals("Start")) {
            double coinInserted = Double.parseDouble(input);
            if (coinInserted == 0.1) {
                totalMoneyInserted += coinInserted;
            } else if (coinInserted == 0.2) {
                totalMoneyInserted += coinInserted;
            } else if (coinInserted == 0.5) {
                totalMoneyInserted += coinInserted;
            } else if (coinInserted == 1) {
                totalMoneyInserted += coinInserted;
            } else if (coinInserted == 2) {
                totalMoneyInserted += coinInserted;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinInserted);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String currentProduct = command;
            switch (command) {
                case "Nuts":
                    productPrice = 2.0;
                    if (totalMoneyInserted < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", currentProduct);
                        totalMoneyInserted -= productPrice;
                    }
                    break;
                case "Water":
                    productPrice = 0.7;
                    if (totalMoneyInserted < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", currentProduct);
                        totalMoneyInserted -= productPrice;
                    }
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    if (totalMoneyInserted < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", currentProduct);
                        totalMoneyInserted -= productPrice;
                    }
                    break;
                case "Soda":
                    productPrice = 0.8;
                    if (totalMoneyInserted < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", currentProduct);
                        totalMoneyInserted -= productPrice;
                    }
                    break;
                case "Coke":
                    productPrice = 1.0;
                    if (totalMoneyInserted < productPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.printf("Purchased %s%n", currentProduct);
                        totalMoneyInserted -= productPrice;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", totalMoneyInserted);
    }
}