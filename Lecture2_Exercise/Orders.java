package Lecture2_Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= numOrders; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int numCapsules = Integer.parseInt(scanner.nextLine());
            double orderPrice = (numCapsules * days) * capsulePrice;
            totalPrice += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}