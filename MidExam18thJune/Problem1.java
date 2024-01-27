package MidExam18thJune;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;
        for (int i = 1; i <= numberCities; i++) {
            String name = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expense = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                expense *= 1.5;
            }
            if (i % 5 == 0) {
                income *= 0.9;
                if (i % 3 == 0) {
                    expense /= 1.5;
                }
            }
            double currentCityProfit = income - expense;
            totalProfit += currentCityProfit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", name, currentCityProfit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}