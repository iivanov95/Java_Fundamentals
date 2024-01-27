package MidExamExercise01;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalPrice = 0;

        boolean isSpecial = false;
        boolean isRegular = false;
        while (!input.contains("regular") || !input.contains("special")) {

            if (input.equals("regular")) {
                isRegular = true;
                break;
            }
            if (input.equals("special")) {
                isSpecial = true;
                break;
            }
            double currentPrice = Double.parseDouble(input);

            if (currentPrice < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
            } else {
                totalPrice += currentPrice;

                input = scanner.nextLine();
            }

        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            if (isSpecial) {
                double taxes = totalPrice * 0.2;
                double finalPrice = (totalPrice + taxes) * 0.9;
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", totalPrice);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$%n", finalPrice);
            } else if (isRegular) {
                double taxes = totalPrice * 0.2;
                double finalPrice = totalPrice + taxes;
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", totalPrice);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$%n", finalPrice);
            }
        }

    }
}
