package MidExamPreparationPart2;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                       .mapToInt(Integer::parseInt).toArray();
        int currentIndex = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            int jumpLength = Integer.parseInt(command.split(" ")[1]);
            currentIndex += jumpLength;
            if (currentIndex > houses.length - 1) {
                currentIndex = 0;
            }
            if (houses[currentIndex] != 0) {
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isFailed = false;
        int countFailed = 0;
        for (int house : houses) {
            if (house != 0) {
                isFailed = true;
                countFailed++;
            }
        }
        if (isFailed) {
            System.out.printf("Cupid has failed %d places.%n", countFailed);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}