package Lecture3_Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int numDays = 0;
        int sumSpices = 0;
        while (startingYield >= 100) {
            int currentYield = startingYield - 26;
            startingYield -= 10;
            numDays++;
            sumSpices += currentYield;

            if (startingYield < 100) {
                sumSpices -= 26;
                System.out.println(numDays);
                System.out.println(sumSpices);
            }
        }
    }
}