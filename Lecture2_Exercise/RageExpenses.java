package Lecture2_Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetBroken = lostGamesCount / 2;
        int mouseBroken = lostGamesCount / 3;
        int keyboardBroken = lostGamesCount / 6;
        int displayBroken = lostGamesCount / 12;
        double headsetSum = headsetBroken * headsetPrice;
        double mouseSum = mouseBroken * mousePrice;
        double keyboardSum = keyboardBroken * keyboardPrice;
        double displaySum = displayPrice * displayBroken;
        double totalSum = headsetSum + mouseSum + keyboardSum + displaySum;
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
